package ch07.sec06;

public class MemberDemo {

	class Eagle extends Bird {

		@Override
		void move() {
			System.out.println("독수리가 날아간다.");
		}

		void sound() {
			System.out.println("휘이익~~");
		}
	}

	Eagle e = new Eagle();

	public static void main(String[] args) {
		MemberDemo m = new MemberDemo();
		m.e.move();
		m.e.sound();

	}

}
