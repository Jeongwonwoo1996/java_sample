package ch02;

public class StringDemlo {

	public static void main(String[] args) {
//		char c = ''; // 빈문자는 허용안됨
		String s = ""; // 빈 문자열은 허용됨
		String res = "\\" + 7 + 7; // 문자열 "77"
		String res1 = 7 + 7 + ""; // 문자열 "14"

		System.out.println(res);
		System.out.println(res1);

	}

}
