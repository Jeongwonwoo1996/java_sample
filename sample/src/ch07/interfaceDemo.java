package ch07;

public class interfaceDemo {

	public static void main(String[] args) {

	}

}

interface A {
	void method1();

	default void method2() {
	};
}

class D1 implements A {

	@Override
	public void method1() {
	}

	@Override
	public void method2() {
	}

}
