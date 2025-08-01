package ch05_practice;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListDemo2 {

	public static void main(String[] args) {

		// 스캐너 객체 할당
		Scanner in = new Scanner(System.in);

		// 동적 배열 선언 : 크기가 유동적인 배열
		ArrayList<Integer> scores = new ArrayList<>();

		int score = 0;
		while (true) {
			System.out.println("학생의 점수를 입력하세요. (종료하려면 -1을 입력) : ");
			score = in.nextInt();
			if (score < 0) {
				break;
			}
			scores.add(score);
		}
		// 점수가 50점 이하인 학생은 동적 배열에서 삭제
		for (int i = 0; i < scores.size(); i++) {
			if (scores.get(i) <= 50) {
				scores.remove(i--);
			}
		}

//		int count = scores.size();

		// 동적 배열의 크기만큼 점수를 꺼내서 합계를 구하고, 평균을 구하여 출력
		int sum = 0;
//				for (int i = 0; i < scores.size(); i++) {
//					sum += scores.get(i);
//				}
		for (Integer item : scores) {
			sum += item;
		}
		System.out.println(scores);
		System.out.printf("학생 %d 명의 점수의 합은 %d 입니다. \n", scores.size(), sum);
		System.out.printf("학생 %d 명의 점수의 평균은 %.2f 입니다.\n ", scores.size(), (sum / (double) scores.size()));

	}

}
