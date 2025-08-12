package ch10;

import java.util.function.DoubleSupplier;
import java.util.function.IntSupplier;
import java.util.function.Supplier;

public class SupplierDemo {

	public static void main(String[] args) {
		// Supplier<T> : 매개변수 없이 값을 공급(리턴)하는 함수형 인터페이스
		Supplier<String> s = () -> new String("hello");
		System.out.println(s.get()); // "hello" 문자열 리턴 후 출력

		// DoubleSupplier : 매개변수 없이 double 타입 값을 공급
		DoubleSupplier ds = () -> Math.random(); // 0.0 ~ 1.0 사이의 난수
		System.out.println(ds.getAsDouble()); // 난수 출력

		// IntSupplier : 매개변수 없이 int 타입 값을 공급
		IntSupplier is = () -> (int) (Math.random() * 10); // 0~9 범위의 난수
		System.out.println(is.getAsInt()); // 난수 출력
	}

}
