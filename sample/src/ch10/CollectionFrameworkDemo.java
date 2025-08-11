package ch10;

import java.util.ArrayList;

public class CollectionFrameworkDemo {

	public static void main(String[] args) {
		ArrayList<String> list = new ArrayList<>();
		list.add("apple");
		list.add("");
		list.add("banana");
		list.add("cherry");

		list.forEach((s) -> System.out.println(s)); // Consumer 인터페이스의 구현체를 람다식으로 작성
		list.removeIf((s) -> s.length() == 0); // Predicate 인터페이스의 구현체를 람다식으로 작성
		list.forEach((s) -> System.out.println(s)); // Consumer 인터페이스의 구현체를 람다식으로 작성

		// 숫자 원소를 가지는 ArrayList를 작성해라. 그리고 원소를 4개를 추가하는데
		// + : 2개, - : 2개
		// 리스트에서 음수값은 삭제하고 양수값만 남겨놓은 다음, 남아있는 원소를 전부 출력해주세요.

		ArrayList<Integer> numberList = new ArrayList<>();

		numberList.add(-5);
		numberList.add(-3);
		numberList.add(15);
		numberList.add(7);

		numberList.forEach((n) -> System.out.println(n));
		numberList.removeIf((n) -> n < 0); // Predicate 인터페이스와 구현체를 람다식으로 작성
		numberList.forEach((n) -> System.out.println(n));

		// 객체(삼각형)을 원소로 가지는 ArrayList 를 작성해라. 원소를 3개 추가하는데
		// () 밑변과 높이가 (10, 3), (10,5), (5,5)인 객체이다.
		// 넓이가 20 보다 작은 것은 리스트에서 삭제하고 남아있는 원소를 전부 출력해주세요.

		ArrayList<Triangle> triangleList = new ArrayList<>();
		triangleList.add(new Triangle(10, 3));
		triangleList.add(new Triangle(10, 5));
		triangleList.add(new Triangle(5, 5));

		System.out.println("삼각형 리스트 출력");
		triangleList.forEach(t -> System.out.println(t));
		triangleList.removeIf(t -> t.findArea() < 20);
		System.out.println("넓이가 20보다 큰 삼각형 리스트 출력");
		triangleList.forEach(t -> System.out.println(t));
	}

}

class Triangle {
	int height;
	int width;

	public Triangle(int height, int width) {
		super();
		this.height = height;
		this.width = width;
	}

	double findArea() {
		return (width * height) / (double) 2;
	}

	@Override
	public String toString() {
//		return super.toString();
		return String.format("Triangle[area = %.2f]", findArea());
	}

}