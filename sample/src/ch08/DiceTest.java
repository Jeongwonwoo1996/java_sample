package ch08;

import java.util.Random;

public class DiceTest {

	public static void main(String[] args) {

		for (int i = 0; i < 10; i++) {
			System.out.println(new Dice().roll());

		}
	}

}

class Dice {
	int number;

	int roll() {
		Random r = new Random();
		return r.nextInt(1, 7);
	}
}
