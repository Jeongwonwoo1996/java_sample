package ch12;

import java.util.stream.IntStream;
import java.util.stream.Stream;

public class MapDemo {

	public static void main(String[] args) {
		Stream<String> s1 = Stream.of("a1", "b1", "c1", "c2", "c3");
		Stream<String> map = s1.map(s -> s.toUpperCase());
		map.forEach(Util::print);
		System.out.println();

		Stream<Integer> intOf = Stream.of(1, 2, 2, 3, 4, 4, 5, 6, 7);
		Stream<Integer> map2 = intOf.map(n -> n * 2);
		map2.forEach(Util::print);
		System.out.println();

//		s1.forEach(Util::print);
		s1 = Stream.of("a1", "b1", "c1", "c2", "c3");
		Stream<String> num = s1.map(s -> s.substring(1));
		IntStream i = num.mapToInt(n -> Integer.parseInt(n));
		Stream<String> mapToObj = i.mapToObj(n -> n + "");
//		i.forEach(Util::print);
		mapToObj.forEach(Util::print);
	}

}
