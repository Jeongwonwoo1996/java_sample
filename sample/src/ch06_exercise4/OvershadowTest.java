package ch06_exercise4;

public class OvershadowTest {

	public static void main(String[] args) {

		Parent p1 = new Parent();
		System.out.println(p1.name);
		p1.print();

		Parent p = new Child();
		System.out.println(p.name);
		p.print();
	}

}
