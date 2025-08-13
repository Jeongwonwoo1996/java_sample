package ch11;

import java.util.ArrayList;
import java.util.List;

public class ArrayListDemo {

	public static void main(String[] args) {
		List<String> list = List.of("그랜저", "소나타", "아반테", "제네시스", "소울");

		List<String> car1 = new ArrayList<>(list);
		car1.add("모닝"); // collection.add();
		car1.add(0, "싼타페"); // List.add();
		System.out.println(car1);
		System.out.println(car1.contains("테슬라"));

		List<String> car2 = new ArrayList<>(list);
		car2.remove("제네시스");
		System.out.println(car2);

		System.out.println(car1.containsAll(car2));

		car1.removeIf(c -> c.startsWith("소"));
		System.out.println(car1);

		car1.replaceAll(c -> "New " + c);
		System.out.println(car1);

		car1.forEach(c -> System.out.println(c));

		car1.clear();
		System.out.println(car1.isEmpty());
	}

}
