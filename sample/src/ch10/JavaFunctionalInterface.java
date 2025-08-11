package ch10;

import java.util.function.Consumer;
import java.util.function.Predicate;

public class JavaFunctionalInterface {

	public static void main(String[] args) {
		// FunctionalInterface ==> Runnable(void run()), Supplier(get)
		// Supplier(T get()), Consumer(void accept(T t))
		// Function(R apply(T t))
		// Predicate(boolean test(T t));
//
//		Predicate<String> isEmptyStr = new Predicate<>() {
//
//			@Override
//			public boolean test(String t) {
//				if (t != null && t.equals("")) {
//					return true;
//				}
//				return false;
//			}
//
//		};

		Predicate<String> isEmptyStr = t -> t != null && t.equals("") ? true : false;

		System.out.println(isEmptyStr.test("hello"));
		System.out.println(isEmptyStr.test(""));
		System.out.println(isEmptyStr.test(null));

		Consumer<String> printString = (s) -> System.out.println(s);
		printString.accept("hello");
	}

}
