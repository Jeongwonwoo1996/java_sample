package ch11;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class EX_1 {

	public static void main(String[] args) {
		List<String> animalList = new ArrayList<>(Arrays.asList("나비", "다람쥐", "라마"));

		animalList.add("동물");

		System.out.println(animalList);

		for (String s : animalList) {
			if (s.length() == 2) {
				System.out.println(s);
			}
		}
	}

}
