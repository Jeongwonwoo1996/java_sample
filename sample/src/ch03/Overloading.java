package ch03;

public class Overloading {

	public static void main(String[] args) {
		int i = 1, j = 10, k = 20;
		System.out.println(max(i, j));
		System.out.println(max(i, j, k));

		long l1 = 10000000L, l2 = 20000000L, l3 = 11000000L;
		System.out.println(max(l1, l2, l3));

	}

	public static int max(int x, int y) {
		return (x > y) ? x : y;
	}

	public static long max(long x, long y) {
		return (x > y) ? x : y;
	}

	public static int max(int x, int y, int z) {
		return max(max(x, y), z);
	}

	public static long max(long x, long y, long z) {
		return max(max(x, y), z);
	}

}
