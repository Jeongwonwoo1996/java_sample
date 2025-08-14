package ch11;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public class EX_6 {

	public static void main(String[] args) {

		// 로또 6/45 생성

		Random r = new Random();
		List<Integer> lotto = new ArrayList<>();

		while (lotto.size() < 6) {
			int number = r.nextInt(45) + 1;

			if (!lotto.contains(number)) {
				lotto.add(number);
			}
		}
		Collections.sort(lotto);
		System.out.println(lotto);

	}

}
