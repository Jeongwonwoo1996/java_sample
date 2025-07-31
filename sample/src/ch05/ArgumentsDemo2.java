package ch05;

public class ArgumentsDemo2 {

	public static void main(String[] args) {
		if (args.length == 2) {
			int count = Integer.parseInt(args[1]);
			// 두번째 인자의 횟수 만큼 첫번째 인자를 콘솔에 출력하도록 프로그램을 하기
			nPrint(args[0], count);
		}
//		System.out.println(args.length);
//		System.out.println(args[0]);
//		System.out.println(args[1]);

	}

	public static void nPrint(String msg, int count) {
		for (int i = 0; i < count; i++) {
			System.out.println(msg);
		}
	}
}
