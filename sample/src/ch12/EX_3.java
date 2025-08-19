package ch12;

import java.util.stream.Stream;

public class EX_3 {

	public static void main(String[] args) {
//		Stream<String> of = Stream.of("갈매기", "나비", "다람쥐", "라마");
//		Stream<String> filter = of.filter(t -> t.length() >= 2);

		Stream<String> animals = Stream.of("갈매기", "나비", "다람쥐", "라마");
		animals.filter(s -> s.length() == 2).forEach(System.out::println);
	}

}
