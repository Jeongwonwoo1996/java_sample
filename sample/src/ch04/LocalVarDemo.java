package ch04;

public class LocalVarDemo {

	public static void main(String[] args) {
		int a = 0;
		double b;
//		System.out.println(b); The local variable b may not have been initialized
//		System.out.println(a + c); c cannot be resolved to a variable
		int c = 0;
//		public double d = 0.0; Illegal modifier for parameter d; only final is permitted
		for (int e = 0; e < 10; e++) {
//			int a = 1; Duplicate local variable a
			System.out.println(e);
		}

	}

}
