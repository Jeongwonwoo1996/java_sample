package ch11;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;

public class IteratorDemo {

	public static void main(String[] args) {

		Collection<String> list = Arrays.asList("다람쥐", "개구리", "나비"); // 사이즈가 고정된 리스트
//		list.add("라마"); // add 사용 불가
//		 list.remove("나비"); // remove 사용 불가
		System.out.println(list.size());

		Collection<String> list1 = new ArrayList<>(Arrays.asList("다람쥐", "개구리", "나비")); // 사이즈가 증가하거나 줄어들 수 있음
		list1.add("라마");
		list1.add("나비");

		System.out.println(list1.size());

		Iterator<String> iterator = list.iterator();
		while (iterator.hasNext()) {
			System.out.println(iterator.next());
		}
//		iterator.next();

		Iterator<String> iterator1 = list1.iterator();
		while (iterator1.hasNext()) {
			System.out.println(iterator1.next());
		}

		list1.remove("나비");

		iterator1 = list1.iterator();
		while (iterator1.hasNext()) {
			System.out.println(iterator1.next());
		}
	}

}
