package ch04.sec06;

public class CircleDemo {

	public static void main(String[] args) {
		Circle c1 = new Circle();
		c1.info();
		Circle c2 = new Circle(10.0);
		c2.info();
		Circle c3 = new Circle("빨강");
		c3.info();
		Circle c4 = new Circle(10.0, "파랑");
		c4.info();

	}

}

class Circle {
	double radius;
	String color;

	public Circle() {
		this(1.0, "노랑"); // 자기 생성자를 부를때는 this(매개변수)로 작성, 생성자를 가장 먼저 적어줘야 한다.
		this.radius = 1.0;
		this.color = "노랑";
	}

	public Circle(double radius) {
//		this.radius = radius;
		this(radius, "노랑");
	}

	public Circle(String color) {
//		this.color = color;
		this(1.0, color);
	}

	public Circle(Double radius, String color) {
		this.radius = radius;
		this.color = color;
	}

	public void info() {
		System.out.printf("원의 반지름은 %.1f 이고 색깔은 %s 입니다.\n", radius, color);
	}
}
