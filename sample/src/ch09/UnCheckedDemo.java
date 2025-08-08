package ch09;

import java.util.StringTokenizer;

public class UnCheckedDemo {

	public static void main(String[] args) {
//		int res = 5 / 0;  // ArithmeticException

		String str = "";
		System.out.println(str.length()); // NullPointerException

		int[] arr = new int[0];
		System.out.println(arr.length); // NullPointerException

//		System.out.println(arr[3]); // ArrayIndexOutOfBoundsException

		String s = "a b c";
		StringTokenizer st = new StringTokenizer(s);
//		while (st.hasMoreTokens()) {
//			st.nextToken();
//		}
		st.nextToken(); // NoSuchElementException

	}

}
