package ch04.sec07;

public class CircleDemo {

	public static void main(String[] args) {
		System.out.println(Circle.numOfCircles);
//		System.out.println(Circle.numCircles);
		Circle c1 = new Circle(10.0);
		System.out.println(Circle.numOfCircles);
		System.out.println(c1.numOfCircles);
		System.out.println(c1.numCircles);
		Circle c2 = new Circle(5.0);
		System.out.println(Circle.numOfCircles);
		System.out.println(c2.numOfCircles);
		System.out.println(c2.numCircles);

	}

}

class Circle {
	// 인스턴스 변수
	double radius;
	int numCircles = 0;

	// 정적 변수(static.클래스) 변수
	static int numOfCircles = 0;

	// 생성자
	public Circle(double radius) {
		this.radius = radius;
		numCircles++;
		numOfCircles++;
	}
}
