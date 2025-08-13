package ch11;

import java.util.Arrays;
import java.util.List;

public class ListDemo {

	public static void main(String[] args) {
		String[] animal1 = { "사슴", "호랑이", "바다표범", "곰" }; // 추가,삭제(X), 해당 index의 요소를 수정(O)
		List<String> animal2 = Arrays.asList(animal1); // add, remove(X), set(O)

		animal2.set(0, "앵무새");
		for (int i = 0; i < animal2.size(); i++) {
			System.out.println(animal2.get(i));
		}
//		animal2.add("앵무새");  Collection 의 add()의 형식임, 현재는 불가
//		animal2.add(1, "앵무새"); List의 add()의 형식임, 현재는 불가 

		animal2.sort((o1, o2) -> o1.length() - o2.length());

		for (int i = 0; i < animal2.size(); i++) {
			System.out.println(animal2.get(i));
		}

		List<Integer> numbers = List.of(1, 2, 3, 4, 5); // immutable - add,remove(X), set(X)
//		numbers.sort((o1, o2) -> o1 - o2);
//		numbers.set(0, 10);
//		numbers.add(10);
//		numbers.add(0, 10);
	}

}
