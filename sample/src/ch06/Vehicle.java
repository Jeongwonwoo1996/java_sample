package ch06;

public class Vehicle {
	String name = "탈 것";

	void whoami() {
		System.out.println("나는 탈 것이다.");
	}

	static void move() {
		System.out.println("이동하다.");
	}
}

class OldCar extends Vehicle {
	String name = "자동차";

	@Override
	void whoami() {
		System.out.println("나는 자동차이다.");
	}

	static void move() {
		System.out.println("달리다.");
	}
}

class SportsCar extends Vehicle {
	String name = "스포츠카";

	@Override
	void whoami() {
		System.out.println("나는 스포츠 자동차이다.");
	}

	static void move() {
		System.out.println("쌩 달리다.");
	}
}
