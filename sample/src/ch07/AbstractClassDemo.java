package ch07;

public class AbstractClassDemo {

	public static void main(String[] args) {
//		Shape shape = new Shape();
	}

}

abstract class Shape {
	double pi = 3.14;

	abstract void draw();

	public double findArea() {
		return pi * 1;
	}
}

class Circle extends Shape { // 완성품을 만들 수 있는 설계도

	int radius;

	public Circle(int radius) {
		this.radius = radius;
	}

	@Override
	void draw() {
		System.out.println("원을 그리다.");

	}

	@Override
	public double findArea() {
		return pi * radius * radius;
	}

}

class Triangle extends Shape {

	@Override
	void draw() {

	}
}
