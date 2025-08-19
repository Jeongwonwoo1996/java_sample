package ch12;

import java.util.List;
import java.util.Optional;
import java.util.stream.Stream;

public class ReduceDemo {

	public static void main(String[] args) {
		List<Integer> list = List.of(1, 2, 3, 4);
		Stream<Integer> stream = list.stream();
		Integer reduce = stream.reduce(0, (x, y) -> x + y);
		System.out.println("[1,2,3,4] 의 합은 " + reduce);

		stream = list.stream();
		Integer reduce1 = stream.reduce(0, Integer::sum);
		System.out.println("[1,2,3,4] 의 합은 " + reduce1);

		stream = list.stream();
		Integer reduce2 = stream.reduce(1, (a, b) -> a * b);
		System.out.println("[1,2,3,4] 의 곱은 " + reduce2);

		stream = list.stream();
		Optional<Integer> reduce3 = stream.reduce((a, b) -> a * b);
		System.out.println("[1,2,3,4] 의 곱은 " + reduce3.get());
	}

}
