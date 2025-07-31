package ch05;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListDemo2 {

	public static void main(String[] args) {
		// 스캐너 객체 할당
		Scanner in = new Scanner(System.in);

		// 동적 배열 선언 : 크기가ㅣ 유동적인 배열
		ArrayList<Integer> scores = new ArrayList<>();
		// 표준입력장치에서 원하는 숫자 만큼 점수를 입력받아서 배열에 저장, 종료하려면 -1을 입력
		// 입력받은 학생이 몇명이 count

		int score = 0;
		while (true) {
			System.out.println("학생의 점수를 입력하세요. (종료하려면 -1을 입력) : ");
			score = in.nextInt();
			if (score < 0) {
				break;
			}
			scores.add(score);
		}
		int count = scores.size();
		// 점수가 50점 이하인 학생은 동적 배열에서 삭제
		for (int i = 0; i < count; i++) {
			if (scores.get(i) <= 50) {
				scores.remove(i--);
			}
		}

		// 동적배열의 크기 만큼 점수를 꺼내서 합계를 구하고, 평균을 구하여 출력
		int sum = 0;
//		for (int i = 0; i < scores.size(); i++) {
//			sum += scores.get(i);
//		}

//		for (Integer item : scores) {
//			sum += item;
//		}

		System.out.printf("학생 %d명의 점수의 합은 %d 입니다. \n", scores.size(), sum);
		System.out.printf("학생 %d명의 점수의 평균은 %.2f 입니다. \n ", scores.size(), (sum / (double) scores.size()));
	}

}
