package ch12;

import java.util.Optional;
import java.util.OptionalDouble;
import java.util.OptionalInt;

public class Optional1Demo {

	public static void main(String[] args) {
		OptionalDouble d = divide(3.0, 3.0);
		System.out.println(d);
		if (d.isPresent()) {
			System.out.println(d.getAsDouble());

		}

		OptionalDouble d1 = divide(3.0, 0.0);
		System.out.println(d1);
		if (d1.isEmpty()) {
			System.out.println("0 으로 나눌 수 없습니다.");
		}

		d1.ifPresentOrElse(number -> System.out.println(number), () -> System.out.println("0 으로 나눌 수 없습니다."));

		OptionalInt i = divide(3, 0);
		if (i.isEmpty()) {
			System.out.println("0으로 나눌 수 없습니다.");
		}
		OptionalInt i1 = divide(3, 3);
		if (i1.isPresent()) {
			System.out.println(i1.getAsInt());
		}

		i1.ifPresentOrElse(number -> System.out.println(number), () -> System.out.println("0 으로 나눌 수 없습니다."));

		Optional<String> s = Optional.ofNullable("apple");
		Optional<String> s1 = Optional.ofNullable(null);

		System.out.println(s);
		System.out.println(s.get());
		System.out.println(s1);

		s.ifPresentOrElse(str -> System.out.println(str), () -> System.out.println("빈 문자열입니다."));
		s1.ifPresentOrElse(str -> System.out.println(str), () -> System.out.println("빈 문자열입니다."));
	}

	public static OptionalDouble divide(double x, double y) {
		return y == 0 ? OptionalDouble.empty() : OptionalDouble.of(x / y);
	}

	public static OptionalInt divide(int x, int y) {
		return y == 0 ? OptionalInt.empty() : OptionalInt.of(x / y);
	}
}
