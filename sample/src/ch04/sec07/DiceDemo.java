package ch04.sec07;

import java.util.Scanner;

public class DiceDemo {

	public static void main(String[] args) {

		Dice dice = new Dice();
		System.out.println("한번은 자동출력");
		dice.roll(); // 결과 : 1부터 6사이의 값이 랜덤하게 출력

		Scanner in = new Scanner(System.in);
		System.out.print("주사위를 몇 번을 던지시겠습니까? : ");
		int input = in.nextInt();

		for (int i = 1; i <= input; i++) {
			System.out.print(i + "번째 결과 : ");
			dice.roll(); // 결과 : 1부터 6사이의 값이 랜덤하게 출력
		}
	}

}

class Dice {

	void roll() {
		System.out.println((int) (Math.random() * 6) + 1);
	}

}
