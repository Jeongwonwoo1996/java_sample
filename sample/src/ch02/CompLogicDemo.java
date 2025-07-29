package ch02;

public class CompLogicDemo {

	public static void main(String[] args) {
		int x = 0, y = 1;

		System.out.println(x < y && x == 0); // true
		System.out.println(x > y); // false

		// 쇼트 서킷 (논리 &&) 조건식1이 false 이면 조건식2 조사하지 않고 성능개선
		System.out.println(x > y && 5 / 0 == 0); // 에러 발생하지 않음, 쇼트 서킷 발생
//		System.out.println(5 / 0 == 0 && x > y); // 에러 발생

		// 쇼트 서킷( 논리 ||) 조건식이 true 이면 조건식2 조사하지 않고 성능개선
		System.out.println(x < y || 5 / 0 == 0); // 에러 발생하지 않음, 쇼트 서킷 발생
	}

}
