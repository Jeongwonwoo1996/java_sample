package ch08;

import java.util.StringTokenizer;

public class StringTokenizerDemo {

	public static void main(String[] args) {

		String s = "a b, c d, e f";

		StringTokenizer st = new StringTokenizer(s, ",");

		System.out.println(st);
		System.out.println(st.countTokens());

		while (st.hasMoreTokens()) {
			System.out.println(st.nextToken());
		}

	}

}
