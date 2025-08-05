package ch06.sec02;

import static ch04.sec07.NewCircle.method;

import ch04.sec07.NewCircle;

public class InheritanceDemo {

	public static void main(String[] args) {

		Circle c = new Circle();
		NewCircle c1 = new NewCircle();
		method();

		System.out.println(c1.radius);
//		Circle.staticMethod();
//
//		Circle c = new Circle();
//		c.findArea();
//		c.findRadius();
//
//		Ball b = new Ball("빨간색");
//		b.findArea();
//		b.findRadius();
//		b.findVolume();
//		b.findColor();

		// 오버라이딩 불가
		// 1) private 은 오버라이딩 대상이 아님.
		// 2) static 메서드는 오버라이딩 대상이 아님.
		// 3) final 메서드는 더이상 수정불가, 자식클래스가 오버라이딩 할 수 없음.

	}

}
