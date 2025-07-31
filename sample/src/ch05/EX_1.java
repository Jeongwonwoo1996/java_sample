package ch05;

public class EX_1 {

	public static void main(String[] args) {
		countChar("heLLo", 'l');
	}

	static int countChar(String s, char c) {
		int count = 0;
		for (int i = 0; i < s.length(); i++) {
			if (Character.toLowerCase(s.charAt(i)) == Character.toLowerCase(c)) {
				count += 1;
			}
		}
		System.out.println("포함된 글자 횟수 : " + count);
		return count;
	}

}
