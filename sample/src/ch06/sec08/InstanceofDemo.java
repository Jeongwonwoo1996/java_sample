package ch06.sec08;

import ch06.Person;

public class InstanceofDemo {

	public static void main(String[] args) {
		Circle c1 = new Circle(5);
		Circle c2 = new Circle(5);
		Circle c3 = new Circle(3);
		Person p = new Person();

		System.out.println(c1.equals(c2));
		System.out.println(c1.equals(c3));
		System.out.println(c1.equals(p));
		System.out.println(c1);
		System.out.println(c2);
		System.out.println(c3);
	}

}
