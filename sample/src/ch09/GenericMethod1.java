package ch09;

public class GenericMethod1 {

	public static void main(String[] args) {
		Integer[] iArr = { 1, 2, 3, 4, 5 };
		String[] sArr = { "a", "b", "c" };

		test(iArr);
		System.out.println(getLast(iArr));

		test(sArr);
		System.out.println(getLast(sArr));

	}

	public static <T> void test(T[] arr) {
		for (T t : arr) {
			System.out.println(t);
		}
	}

	public static <T> T getLast(T[] arr) {
		return arr[arr.length - 1];
	}

}
