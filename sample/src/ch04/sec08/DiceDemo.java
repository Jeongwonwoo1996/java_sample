package ch04.sec08;

import java.util.Scanner;

public class DiceDemo {

	public static void main(String[] args) {

		// 사용자로부터 반복수행할 횟수 입력받기
		Scanner sc = new Scanner(System.in);
		System.out.print("주사위를 몇 번을 돌리시겠습니까? : ");
		int count = sc.nextInt();

		Dice dice = new Dice();

		// 사용자로부터 입력받은 횟수만큼 반복하기
		for (int i = 0; i < count; i++) {
			dice.roll();
		}

	}
}

class Dice {

	void roll() {
		System.out.println((int) (Math.random() * 6) + 1);
	}

}
