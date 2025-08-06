package ch06_exercise4;

class Parent {
	String name = "영조";

	void print() {
		System.out.println("나는 " + name + "입니다.");
	}
}

class Child extends Parent {
	String name = "사도세자";

	@Override
	void print() {
		System.out.println("나는 " + name + "이고, 아버지는 " + super.name + "입니다.");
	}
}
