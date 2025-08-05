package ch06_practice1;

public class Circle {

	int radius;

	void show() {
		System.out.println("반지름이 " + radius + " 인 원이다.");
	}

	Circle(int radius) {
		this.radius = radius;
	}

}
