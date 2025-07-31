package ch05;

public class CircleArrayDemo {

	public static void main(String[] args) {
		Circle[] circles = new Circle[5];

		for (int i = 0; i < circles.length; i++) {
			circles[i] = new Circle(i + 1.0);
			System.out.println(circles[i].toString());
		}

	}

}

class Circle {
	double radius;

	public Circle(double radius) {
		this.radius = radius;
	}

	public double getRadius() {
		return radius;
	}

	double findArea() {
		return 3.14 * radius * radius;
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return String.format("원의 넓이(반지름 : %.1f) = %.2f", radius, findArea());
	}
}
