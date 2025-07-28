package ch02;

import java.util.Scanner;

public class ScannerDemo {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
//		System.out.print("정수 값을 입력하세요 : ");
//		int x = sc.nextInt();
//		System.out.printf("당신이 입력한 값은 %d 입니다. \n", x);
//
//		System.out.print("실수 값을 입력하세요 : ");
//		float f = sc.nextFloat();
//		System.out.printf("당신이 입력한 값은 %f 입니다. \n", f);

		System.out.print("정수 값을 입력하세요 : ");
		String s = sc.nextLine();
		System.out.printf("당신이 입력한 값은 %s 입니다. \n", s);

		int number = Integer.parseInt(s);

		System.out.printf("s + 10 은 %d 입니다. \n", number + 10);

		System.out.print("실수 값을 입력하세요 : ");
		s = sc.nextLine();
		System.out.printf("당신이 입력한 값은 %s 입니다. \n", s);
		double number1 = Double.parseDouble(s);

		System.out.printf("s + 10 은 %f 입니다. \n", number1 + 10);

	}

}
