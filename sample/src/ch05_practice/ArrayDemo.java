package ch05_practice;

import java.util.Arrays;

public class ArrayDemo {

	public static void main(String[] args) {

		// 배열을 선언하는 첫 번째 방법
//		int[] scores = { 92, 100, 85, 78, 69, 88, 90, 100, 70 };

		// 배열을 선언하는 두 번째 방법
//		int scores[] = new int[] {92, 100, 85, 78, 69, 88, 90, 100, 70};

		// 배열을 선언하는 세 번째 방법
		int[] scores;
		scores = new int[] { 92, 100, 85, 78, 69, 88, 90, 100, 70 };

		// 기존의 for문 예제
//		int sum = 0;
//		for (int i = 0; i < scores.length; i++) {
//			sum += scores[i];
//		}
//		System.out.println(sum);

		// for-each문 예제
		int sum = 0;
		for (int score : scores) { // for-each
			sum = sum + score;
		}

//		System.out.println(sum);
//		System.out.println(scores.length);

		System.out.printf("학생 %d명의 점수의 합은 %d 입니다., \n", scores.length, sum);
		System.out.printf("학생 %d명의 점수의 평균은 %.2f 입니다. \n", scores.length, (sum / (double) scores.length));

		// 배열의 출력
		int[] arr = { 1, 2, 3, 4, 5 };
		String str = "hello";
		System.out.println(arr);
		System.out.println(Arrays.toString(arr));
		System.out.println(str);

		char[] cArr = { 'a', 'b', 'c' };
		System.out.println(cArr);

		double[] dArr = { 10.0, 20.0, 30.0 };
		System.out.println(dArr);
		System.out.println(Arrays.toString(dArr));

	}

}
