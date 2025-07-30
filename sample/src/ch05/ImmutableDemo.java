package ch05;

public class ImmutableDemo {

	public static void main(String[] args) {
		String str1 = "Hello";

		String str2 = "Hello";

		System.out.println(str1 == str2);

		str2 = "World";

		System.out.println(str1 == str2);
		System.out.println(str1 + " : " + str2);

		String str3 = new String("Hello");

		String str4 = new String("Hello");

		System.out.println(str3 == str4);
		System.out.println(str3.equals(str4));
	}

}
