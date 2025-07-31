package ch03;

import java.util.Scanner;

public class DoWhileDemo {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int num = 0;
		do {
			System.out.println("값을 입력하세요 : ");
			num = in.nextInt();
		} while (num > 0);
		System.out.println("종료!!!");

		// 1 ~ 10 까지의 짝수만 출력
		int number = 0;
		while (number <= 10) {
			number++;
			if (number % 2 == 1) {
				continue;
			}
			System.out.println(number);
		}

	}
}
