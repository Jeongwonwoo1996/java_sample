package ch10;

import java.util.function.BiPredicate;
import java.util.function.IntPredicate;
import java.util.function.Predicate;

public class PredicateDemo {

	public static void main(String[] args) {
		// IntPredicate : int 타입 매개변수를 받아서 boolean 값을 반환
		IntPredicate even = x -> x % 2 == 0; // 짝수인지 판별
		System.out.println(even.test(3) ? "짝수" : "홀수"); // 3 → 홀수
		System.out.println(even.test(4) ? "짝수" : "홀수"); // 4 → 짝수

		// BiPredicate<T, U> : 두 개의 매개변수를 받아서 boolean 값을 반환
		BiPredicate<Integer, Integer> bp = (x, y) -> x > y; // 첫 번째 값이 더 큰지 비교
		System.out.println(bp.test(3, 5) ? "앞에 숫자가 더 크다." : "뒤에 숫자가 더 크다"); // 3,5 → 뒤에 숫자가 더 큼
		System.out.println(bp.test(5, 3)); // 5 > 3 → true

		// Predicate<T> : 단일 매개변수를 받아서 boolean 값을 반환
		Predicate<String> p = x -> x.equals(""); // 빈 문자열 여부 확인
		System.out.println(p.test("hello") ? "빈 문자열입니다." : "빈 문자열이 아닙니다."); // "hello" → 빈 문자열 아님
		System.out.println(p.test("") ? "빈 문자열입니다." : "빈 문자열이 아닙니다."); // "" → 빈 문자열임
	}

}
