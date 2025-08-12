package ch10;

import java.util.function.BiConsumer;
import java.util.function.Consumer;
import java.util.function.IntConsumer;
import java.util.function.ObjIntConsumer;

public class ConsumerDemo {

	public static void main(String[] args) {
		// Consumer<T> : 단일 매개변수를 받아서 처리(반환값 없음)
		Consumer<String> c1 = x -> System.out.println(x.toLowerCase());
		c1.accept("Hello java"); // 문자열을 소문자로 변환 후 출력

		// BiConsumer<T, U> : 두 개의 매개변수를 받아서 처리(반환값 없음)
		BiConsumer<String, String> bc = (x, y) -> System.out.println(x + ":" + y);
		bc.accept("Hello", "java"); // "Hello:java" 출력

		// IntConsumer : int형 매개변수를 받아서 처리(반환값 없음)
		IntConsumer c2 = i -> System.out.println(i * 2);
		c2.accept(10); // 20 출력

		// ObjIntConsumer<T> : 객체와 int형 매개변수를 받아서 처리(반환값 없음)
		ObjIntConsumer<String> oc = (s, i) -> System.out.println(s + ":" + i);
		oc.accept("hello", 3); // "hello:3" 출력
	}

}
