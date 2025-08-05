package ch06;

public class InheritanceDemo3 {

	public static void main(String[] args) {

		Animal animal = new Animal();
		animal.eat();
		animal.move();

		Eagle eagle = new Eagle();
		eagle.eat();
//		eagle.fly();
		eagle.move();

		Tiger tiger = new Tiger();
		tiger.sleep();
//		tiger.run();
		tiger.move();

		Goldfish goldfish = new Goldfish();
		goldfish.eat();
//		goldfish.swim();
		goldfish.move();

	}

}

class Animal {
	String eye;
	String mouth;

	void eat() {
	}

	void sleep() {
	}

	void move() {
		System.out.println("동물은 움직인다.");
	}
}

class Eagle extends Animal {
	String wing;

	@Override
	void move() {
		System.out.println("독수리는 날아갑니다.");
	}

//	void fly() {
//	}
}

class Tiger extends Animal {
	String leg;

//	void run() {
//	}
	@Override
	void move() {
		System.out.println("호랑이는 달립니다.");
	}
}

class Goldfish extends Animal {
	String fin;

//	void swim() {
//	}
	@Override
	void move() {
		System.out.println("금붕어는 헤엄칩니다.");
	}
}
