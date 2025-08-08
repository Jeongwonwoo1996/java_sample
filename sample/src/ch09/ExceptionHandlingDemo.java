package ch09;

public class ExceptionHandlingDemo {

	public static void main(String[] args) {
		try {
			method1();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (NumberFormatException e) {
			System.out.println("문자를 포함한 경우에는 숫자로 변환할 수 없습니다.");
		}
	}

	static void method1() throws InterruptedException, NumberFormatException {
		method2();
	}

	static void method2() throws InterruptedException, NumberFormatException {
		Thread.sleep(100);
		int n = Integer.parseInt("abc");
	}

}
