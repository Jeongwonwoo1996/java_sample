package ch05_practice;

public class ArgumentsDemo2 {

	public static void main(String[] args) {
		if (args.length == 2) {
			int count = Integer.parseInt(args[1]);
			nPrint(args[0], count);
		}
	}

	public static void nPrint(String msg, int count) {
		for (int i = 0; i < count; i++) {
			System.out.println(msg);
		}
	}

}
