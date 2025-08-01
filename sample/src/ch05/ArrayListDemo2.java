package ch05;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListDemo2 {

	public static void main(String[] args) {
		// 스캐너 객체 할당
		Scanner in = new Scanner(System.in);
		// 동적 배열 선언 : 크기가 유동적인 배열
		ArrayList<Integer> scores = new ArrayList<>();
		// 표준입력장치에서 원하는 숫자 만큼 점수를 입력받아서 동적 배열에 저장, 종료하려면 -1 을 입력
		int score = 0;
		while (true) {
			System.out.println("학생의 점수를 입력하세요. (종료하려면 -1 을 입력) : ");
			score = in.nextInt();
			if (score < 0) {
				break;
			}
			scores.add(score);
		}
//		int count = scores.size();
		// 점수가 50점 이하인 학생은 동적 배열에서 삭제 ==> 다시 설명하기
		// IndexOutOfBoundsException 발생
		// size 가 3(index=0,1,2) 이었다가 2(index=0,1) 로 줄어드는데
		// scores[2] 에 접근하기 때문
		for (int i = 0; i < scores.size(); i++) {
			if (scores.get(i) <= 50) {
				scores.remove(i--);
			}
		}
		int count = scores.size();
		// IndexOutOfBoundsException 발생하지 않도록
		// size 가 3(index=2,1,0) 이었다가 2(index=1,0) 로 줄어들어도
		// scores[0] 에 접근하므로 문제가 안됨

//		for (int i = count - 1; i >= 0; i--) {
//			if (scores.get(i) <= 50) {
//				scores.remove(i);
//			}
//		}

		// 동적 배열의 크기만큼 점수를 꺼내서 합계를 구하고, 평균을 구하여 출력
		int sum = 0;
//		for (int i = 0; i < scores.size(); i++) {
//			sum += scores.get(i);
//		}
		for (Integer item : scores) {
			sum += item;
		}
		System.out.println(scores);
		System.out.printf("학생 %d 명의 점수의 합은 %d 입니다. \n", scores.size(), sum);
		System.out.printf("학생 %d 명의 점수의 평균은 %.2f 입니다.\n ", scores.size(), (sum / (double) scores.size()));
	}
}