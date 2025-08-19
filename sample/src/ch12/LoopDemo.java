package ch12;

import java.util.OptionalDouble;
import java.util.OptionalInt;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class LoopDemo {

	public static void main(String[] args) {
		Stream<Nation> nationStream = Nation.nations.stream();

		System.out.println("before == 섬인 나라");
		Stream<Nation> peek = nationStream.filter(n -> n.isIsland()).peek(Util::printWithParenthesis);
		System.out.println("after == 섬인 나라");
		peek.mapToInt(n -> n.getName().length()).forEach(Util::print);

		IntStream is = IntStream.of(1, 2, 3, 4, 5);
		OptionalInt min = is.min();
		System.out.println("\n 최소값은 : " + min.getAsInt());

		is = IntStream.of(1, 2, 3, 4, 5);
		OptionalInt max = is.max();
		System.out.println("\n 최대값은 : " + max.getAsInt());

		is = IntStream.of(1, 2, 3, 4, 5);
		OptionalDouble average = is.average();
		System.out.println("\n 평균은 : " + average.getAsDouble());

		is = IntStream.of(1, 2, 3, 4, 5);
		System.out.println("\n 합은 : " + is.sum());

		is = IntStream.of(1, 2, 3, 4, 5);
		System.out.println("\n 개수는 : " + is.count());
	}

}
