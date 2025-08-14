package ch12;

import java.util.stream.IntStream;

public class LazyDemo {

	public static void main(String[] args) {
		IntStream is = IntStream.rangeClosed(1, 5); // 1,2,3,4,5

		is.filter(x -> {
			System.out.println("Filter() : " + x);
			return x % 2 == 0;
		}) // Predicate
				.map(x -> {
					System.out.println("map() : " + x);
					return x * x;
				})// IntunaryOperator
				.forEach(x -> System.out.println("forEach() : " + x)); // Consumer
	}

}
