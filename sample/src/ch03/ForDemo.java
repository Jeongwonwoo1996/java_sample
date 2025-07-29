package ch03;

public class ForDemo {

	public static void main(String[] args) {

		// for(초기식 ; 조건식 ; 증감식)
		for (int i = 0; i < 5; i++) { // i ++ ==> i + 1 ==> i = i + 1
			System.out.println("hello world , " + (i + 1));
		}

		System.out.println();

		// 1부터 10까지 정수를 출력
		for (int i = 1; i <= 10; i++) {
			if (i == 10) {
				System.out.print(i);
			} else {
				System.out.print(i + ", ");
			}
		}

		System.out.println();

		// 1부터 10까지 정수를 출력
		for (int i = 10; i >= 1; i--) {
			if (i == 1) {
				System.out.print(i);
			} else {
				System.out.print(i + ", ");
			}
		}

		System.out.println();

		// 11부터 20까지 정수를 출력
		for (int i = 11; i <= 20; i++) {
			if (i == 20) {
				System.out.print(i);
			} else {
				System.out.print(i + ", ");
			}
		}

		System.out.println();

		// 구구단 2단 출력
		for (int i = 1; i < 10; i++) {
			System.out.println("2 * " + i + " = " + 2 * i);
		}

		System.out.println();

		for (int i = 1; i <= 9; i++) {
			System.out.printf("%d * %d = %d \n", 2, i, 2 * i);
		}
	}

}
