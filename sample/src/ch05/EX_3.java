package ch05;

import java.util.Scanner;

public class EX_3 {

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);

		String url = "";
		String www = "www";
		String com = "com";
		String java = "java";

		while (true) {
			System.out.println("URL 을 입력하세요.");
			url = in.nextLine();
			if (url.equalsIgnoreCase("bye")) {
				break;
			}
			if (url.endsWith(com)) {
				System.out.printf("%s 는 '%s'으로 끝납니다.\n", url, com);
			}
			if (url.contains(java)) {
				System.out.printf("%s 는 '%s'를 포함합니다.\n", url, java);
			}
			if (url.startsWith(www)) {
				System.out.printf("%s 는 '%s'로 시작합니다.\n", url, www);
			}
		}

	}

}
