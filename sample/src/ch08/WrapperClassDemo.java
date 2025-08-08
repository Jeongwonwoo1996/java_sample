package ch08;

public class WrapperClassDemo {

	public static void main(String[] args) {
		int i = 10;
		Integer I = new Integer(10);

		int j = I.intValue();

		String s = new String("Hello");

		int k = I;

		System.out.println(i);
		System.out.println(I);
		System.out.println(k);

	}

}