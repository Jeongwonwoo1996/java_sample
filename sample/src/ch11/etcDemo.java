package ch11;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class etcDemo {

	public static void main(String[] args) {
		List<String> list = List.of("사과", "포도", "수박", "사과", "키위", "망고", "사과");
		List<String> fruits = new ArrayList<String>(list);

		Collections.sort(fruits);
		System.out.println(fruits);
		System.out.println(Collections.binarySearch(fruits, "사과"));

		System.out.println(Collections.frequency(fruits, "사과"));
	}

}
