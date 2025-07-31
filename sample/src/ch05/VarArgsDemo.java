package ch05;

public class VarArgsDemo {

	public static void main(String[] args) {
		System.out.println(add(2, 3));
		System.out.println(add(2, 3, 4));
		System.out.println(add(2, 3, 4, 5));
		System.out.println(add(2, 3, 4, 5, 6));
		System.out.println(add(2, 3, 4, 5, 6, 7));
		System.out.println(add(2, 3, 4, 2, 3, 4, 5));

	}

//	public static int add(int a, int b) {
//		return a + b;
//	}
//	
//
//
//	public static int add (int a, int b, int c) {
//		return a + b + c;
//
//	}

	public static int add(int... number) {
		int sum = 0;
		for (int i : number) {
			sum += i;
		}
		return sum;
	}

}
