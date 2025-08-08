package ch09;

public class UnCheckedDemo2 {

	public static void main(String[] args) {

		int number = 1;

		try {
			int res = 5 / number; // ArithmeticException

			String str = null;
			System.out.println(str.length()); // NullPointerException

			int[] arr = new int[0];
			System.out.println(arr[3]); // ArrayIndexOutOfBoundsException

		} catch (ArithmeticException | NullPointerException e) {
//			e.printStackTrace();
			System.out.println("0 으로 나눌 수 없거나 문자열에 값이 없습니다.");
		} catch (Exception e) {
			System.out.println("알 수 없는 예외가 발생했습니다.");
		}

	}

}
