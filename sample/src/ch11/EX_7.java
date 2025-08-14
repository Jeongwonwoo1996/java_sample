package ch11;

import java.util.HashMap;
import java.util.Map;

public class EX_7 {

	public static void main(String[] args) {
		Map<String, Integer> map = new HashMap<>();

		map.put("blue", 96);
		map.put("hong", 86);
		map.put("white", 92);

		String maxName = "";
		String minName = "";
		int maxScore = 0;
		int minScore = 100;
		int totalScore = 0;
		double mean = 0.0;

		for (Map.Entry<String, Integer> entry : map.entrySet()) {
			totalScore += entry.getValue();

			if (entry.getValue() > maxScore) {
				maxScore = entry.getValue();
				maxName = entry.getKey();
			}

			if (entry.getValue() < minScore) {
				minScore = entry.getValue();
				minName = entry.getKey();
			}

		}

		mean = (double) totalScore / map.size();

		System.out.println(maxName);
		System.out.println(minName);
		System.out.printf("%.2f", mean);
	}

}
