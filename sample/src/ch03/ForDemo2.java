package ch03;

import java.util.Scanner;

public class ForDemo2 {

	public static void main(String[] args) {
		// 사용자로 부터 정수 값을 입력받아 원하는 출력하는 단을 만드시오.

		// scanner 를 선언
		Scanner in = new Scanner(System.in);

		// 점수를 입력하라는 출력문을 실행한다.
		System.out.println("출력하고자 하는 구구단을 입력하세요 : (2 ~ 19)");

		// 몇 단을 출력하고 싶은지 입력 받는다.
		int dan = in.nextInt();

		for (int i = 1; i <= 9; i++) {
			System.out.printf("%d * %d = %d \n", dan, i, dan * i);
		}

	}

}
