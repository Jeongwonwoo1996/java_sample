package ch07.sec06;

public class AnonymousDemo {

	Bird b = new Bird() {
		@Override
		void move() {
			System.out.println("이름없는 새가 날아간다.");
		};

//		void sound() {
//			System.out.println("이름없는 새가 내는 소리");
//		}
	};

	public static void main(String[] args) {
		AnonymousDemo a = new AnonymousDemo();
		a.b.move();
		// a.b.sound();
	}

}
