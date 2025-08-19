package ch12;

import java.util.List;
import java.util.stream.Stream;

public class EX_1 {

	public static void main(String[] args) {
		List<Integer> scores = List.of(45, 76, 38, 27, 50);

		Stream<Integer> stream = scores.stream();

		stream.map(i -> i + 10).forEach(System.out::println);
	}

}
