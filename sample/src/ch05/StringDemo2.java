package ch05;

public class StringDemo2 {

	public static void main(String[] args) {
		String str = "Hello, World";

		System.out.println(str);

		System.out.println(str.toLowerCase());
//		System.out.println(str.toUpperCase());
		str = str.toUpperCase();

		System.out.println(str);

		System.out.println(str.substring(0, 5));
		System.out.println(str.substring(5));
	}

}
