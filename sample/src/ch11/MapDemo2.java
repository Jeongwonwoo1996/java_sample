package ch11;

import java.util.HashMap;
import java.util.Map;

public class MapDemo2 {

	public static void main(String[] args) {
		Map<Fruit, Integer> fruits = new HashMap<>();

		fruits.put(new Fruit("사과"), 3);
		fruits.put(new Fruit("바나나"), 5);
		fruits.put(new Fruit("딸기"), 10);

		fruits.put(new Fruit("사과"), 5);

		System.out.println(fruits.size());
		System.out.println(fruits.keySet());
		System.out.println(fruits.values());

		System.out.println(fruits.containsKey("사과"));
		fruits.forEach((x, y) -> System.out.println(x + ":" + y));
//		fruits.forEach(System::println);

	}

}

class Fruit {
	String name;

	public Fruit(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return name;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		} else if (obj instanceof Fruit f) {
//			return this.name.equals(f.name); // 이름으로만 비교해도 항상 hashCode를 오버라이드 해야 함.
			return this.hashCode() == f.hashCode();
		}
		return false;
	}

	@Override
	public int hashCode() {
		return name.hashCode();
	}

}
