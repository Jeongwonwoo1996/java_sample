package ch06;

public class InheritanceDemo {

	public static void main(String[] args) {
		Parent p = new Parent();
		p.name = "부모";
		p.method1();
//		p.method2(); 자식의 정보를 알 수 없다.
//		p.myName = "";

		Child c = new Child();
		c.name = "my parent";
		c.myName = "나 자신";
		c.method1();
		c.method2();
	} // end of main method

} // end of demo class

class Parent {
	// 필드
	String name;

	// 메서드
	void method1() {
		System.out.println("메서드 1 입니다.");
		System.out.println(name);

	}
}

class Child extends Parent {
	// 부모에게 받은 멤버
	// 자식의 멤버
	String myName;

	void method2() {
		System.out.println("메서드 2 입니다.");
		System.out.println(myName);
	}
}