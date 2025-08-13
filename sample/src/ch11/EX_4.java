package ch11;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class EX_4 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		List<Integer> scoreList = new ArrayList<>();

		while (true) {
			System.out.print("점수를 입력하세요 : ");
			String input = in.nextLine();

			if (input == null || input.isBlank()) {
				System.out.println("잘못된 입력입니다. 다시 입력해주세요.");

			} else if (Integer.parseInt(input) < 0) {
				break;
			} else {
				scoreList.add(Integer.parseInt(input));
			}

		}

		System.out.println("전체 학생은 " + scoreList.size() + "명 이다.");

		int highscore = scoreList.get(0);
		int index = 0;

		for (int i = 0; i < scoreList.size(); i++) {
			if (scoreList.get(i) > highscore) {
				highscore = scoreList.get(i);
			}
		}

		for (int i = 0; i < scoreList.size(); i++) {

			int score = scoreList.get(i);
			String grade;

			if (score >= highscore - 10) {
				grade = "A";
			} else if (score >= highscore - 20) {
				grade = "B";
			} else {
				grade = "C";
			}

			System.out.println(String.format("%d번 학생의 성적은 %d이며 등급은 %s이다.", index, score, grade));
			index++;
		}
		in.close();

	}
}
