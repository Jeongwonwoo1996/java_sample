package ch08;

import java.util.Objects;

public class PersonTest {

	// 다형성, 제너릭, 람다식, 스트림 중요

	public static void main(String[] args) {
		Person p1 = new Person("111111", "홍길동");
		Person p2 = new Person("111111", "손흥민");
		Person p3 = new Person("123456", "손흥민");

		if (p1.equals(p2)) {
			System.out.println("같은 사람이다.");
		} else {
			System.out.println("다른 사람이다.");
		}

		if (p2.equals(p3)) {
			System.out.println("같은 사람이다.");
		} else {
			System.out.println("다른 사람이다.");
		}
	}

}

class Person {
	String number;
	String name;

	public Person(String number, String name) {
		super();
		this.number = number;
		this.name = name;
	}

	@Override
	public boolean equals(Object obj) {

		if (obj instanceof Person person) {
			if (person.hashCode() == this.hashCode()) {
				return true;
			}
		}
		return false;
	}

	@Override
	public int hashCode() {
		return Objects.hash(number, name);
	}

}
