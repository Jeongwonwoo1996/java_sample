package ch11;

import java.util.Map;

public class MapDemo1 {

	public static void main(String[] args) {
		Map<String, Integer> fruits = Map.of("사과", 5, "바나나", 2, "포도", 10);

//		fruits.put("사과", 3);

		System.out.println(fruits.size());
		System.out.println(fruits.keySet());
		System.out.println(fruits.values());

		System.out.println(fruits.containsKey("사과"));
		fruits.forEach((x, y) -> System.out.println(x + ":" + y));
//		fruits.forEach(System::println);

	}

}
