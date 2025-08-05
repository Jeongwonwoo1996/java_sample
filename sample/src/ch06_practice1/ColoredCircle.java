package ch06_practice1;

public class ColoredCircle extends Circle {
	String color;

	@Override
	void show() {
//		super.show();
		System.out.println("반지름이 " + radius + "인 " + color + " 원이다.");

	}

	ColoredCircle(int radius, String color) {
		super(radius);
		this.color = color;
	}

}
