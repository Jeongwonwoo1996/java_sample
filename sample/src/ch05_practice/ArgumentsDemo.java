package ch05_practice;

public class ArgumentsDemo {

	public static void main(String[] args) {
		System.out.println(args.length);
		System.out.println(args[0]);
		System.out.println(args[1]);

		int count = Integer.parseInt(args[1]);
		// 두 번째 인자의 횟수 만큼 첫번째 인자를 콘솔에 출력하도록 프로그램을 하기
		for (int i = 0; i < count; i++) {
			System.out.println(args[0]);
		}

	}

}
