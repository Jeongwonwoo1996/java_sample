package ch09;

public class CheckedDemo {

	public static void main(String[] args) {

		try {
			Thread.sleep(100);
		} catch (InterruptedException e) {
			System.out.println("인터럽트 이벤트 발생함");
		}
	}

}
