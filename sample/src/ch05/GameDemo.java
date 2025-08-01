package ch05;

import java.util.Arrays;

public class GameDemo {

	public static void main(String[] args) {

		String[] name = { "가위", "바위", "보" };
		System.out.println(name);

		System.out.println(Arrays.toString(name));

		for (int i = 0; i < 10; i++) {
			System.out.println(name[(int) (Math.random() * 3)]);
		}
	}

}
