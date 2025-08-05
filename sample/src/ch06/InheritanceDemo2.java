package ch06;

public class InheritanceDemo2 {

	public static void main(String[] args) {

	}
}

// class A <---- class B
//class A {}
//
//class B extends A {}
//
////class A <---- class B <--- class C
//
////class C extends B {}
//
//// class A <---- class B
//// class A <---- class C
//// class A <---- class D
//
//class C extends A{}
//
//class D extends A{}

// class A <--- class C (X) 다중상속 자바는 허용하지 않음
// class B <--- class C (X)
class A {
	String name;

	void method1() {
		System.out.println("A 의 메소드입니다.");
	}
}

class B {
	String name;

	void method() {
		System.out.println("B 의 메소드입니다.");
	}
}

//class C extends A, B{ // 다중 상속은 지원하지 않음
//	
//}