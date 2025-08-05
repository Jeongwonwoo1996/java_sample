package ch06.sec02;

public class Ball extends Circle {
	private String color;

	public Ball(String color) {
		this.color = color;
	}

	void findColor() {
		System.out.println(color + "공이다.");
	};

	void findVolume() {
		System.out.println("공의 부피는 4/3 * (PI * 반지름 * 반지름)이다. ");
	};

	@Override // 오버라이드에서는 시그니처가 달라지면 안되고 반한타입도 달라지면 안된다.
	public void findArea() {
		System.out.println("공의 넓이는 4 * PI * 반지름 * 반지름이다.");
	}

//	@Override
//	public void findArea() {
//		super.findArea();
//	}

	@Override
	public void findRadius() {
		super.findRadius();
	}

}
