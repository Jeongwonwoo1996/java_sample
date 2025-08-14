package ch11;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class SortDemo {

	public static void main(String[] args) {
		String[] fruits = { "포도", "수박", "사과", "키위", "망고" };
		List<String> list = Arrays.asList(fruits);

		Set<String> set = Set.of("포도", "수박", "사과", "키위", "망고");
		HashSet<String> hashSet = new HashSet<>(set);

//		Collections.sort(hashSet);
		// list 의 구현체만 Collections를 이용해 sort 가 가능함

		Collections.sort(list, Collections.reverseOrder()); // Reverse_Order 로 정렬하기 위한 Comparator 반환해주는 메서드
		System.out.println(list);

		Collections.reverse(list); // 리스트의 순서를 거꾸로 만드는 메서드
		System.out.println(list);
	}

}
