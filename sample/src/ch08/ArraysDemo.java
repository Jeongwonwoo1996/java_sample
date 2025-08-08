package ch08;

import java.util.Arrays;

public class ArraysDemo {

	public static void main(String[] args) {
		String[] sArr = { "케이크", "애플", "도넛", "바나나" };
		Integer[] iArr = { 3, 5, 1, 7 };
		Character[] cArr = { 'j', 'a', 'v', 'a' };

		print(sArr);
		print(iArr);
		print(cArr);

		Arrays.sort(sArr);
		print(sArr);

		System.out.println(Arrays.binarySearch(sArr, "애플"));

	}

	static void print(Object[] oArr) {
		System.out.print("[ ");
		for (Object object : oArr) {
			System.out.print(object + " ");
		}
		System.out.println("]");
	}

}