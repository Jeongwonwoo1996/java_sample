package ch06.sec02;

public class Circle {

	public static void staticMethod() {

	}

	private void secret() {
		System.out.println("비밀이다.");
	}

	protected void findRadius() {
		System.out.println("반지름은 10.0 센티이다.");
	}

	public void findArea() {
		System.out.println("넓이는 PI * 반지름 * 반지름이다.");

	}

	public final void findTTT() {
		System.out.println("넓이는 PI * 반지름 * 반지름이다.");

	}

}
