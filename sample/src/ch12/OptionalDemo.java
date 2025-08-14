package ch12;

import java.util.Optional;

public class OptionalDemo {

	public static void main(String[] args) {
		Integer i = null;
		Optional<Integer> e = Optional.empty();
		System.out.println(e);
		System.out.println(e.isEmpty());

		Optional<Integer> of = Optional.of(3);
		System.out.println(of);
		System.out.println(of.get());

		Optional<Integer> ofNullable = Optional.ofNullable(i);
		if (!ofNullable.isEmpty()) {
			System.out.println(ofNullable.get());
		}

		i = 10;
		ofNullable = Optional.ofNullable(i);
		System.out.println(ofNullable);
		if (!ofNullable.isEmpty()) {
			System.out.println(ofNullable.get());
		}
		ofNullable.ifPresent(System.out::println);
		i = null;
		ofNullable = Optional.ofNullable(i);
		ofNullable.ifPresentOrElse(System.out::println, () -> System.out.println("값이 없습니다."));
	}

}
