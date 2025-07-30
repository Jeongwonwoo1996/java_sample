package ch04;

public class CircleDemo {

	public static void main(String[] args) {
//		Circle c = new Circle(); The constructor Circle() is undefined
//		c.setRadius(10);
//		System.out.println("원의 반지름은 " + c.getRadius());
//		System.out.println("원의 넓이는 " + c.findArea());

		Circle c1 = new Circle(2);
		System.out.println("원의 반지름은 " + c1.getRadius());
		System.out.println("원의 넓이는 " + c1.findArea());
	}

}

//class Circle {
//	double radius; // 0.0
//
//	double findArea() {
//		return 3.14 * this.radius * radius;
//	}
//}

class Circle {
	// 멤버(필드)
	private double radius;
//	private double radius1;
//	private double radius2;
//	private double radius3;

	// 생성자
//	public Circle() {
//
//	}

	public Circle(double radius) { // , double radius1, double radius2, double radius3) {
		if (radius > 0) {
			this.radius = radius;
//			this.radius1 = radius1;
//			this.radius2 = radius2;
//			this.radius3 = radius3;
		}
	}

	// Getter
	public double getRadius() {
		return this.radius;
	}

	// Setter
	public void setRadius(double r) {
		if (r <= 0) {
			System.out.println("원의 반지름은 0 보다 커야 합니다.,");
			return;
		}
		this.radius = r;
	}

	public double findArea() {
		return 3.14 * this.radius * radius;
	}
}
