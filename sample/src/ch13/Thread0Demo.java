
package ch13;

public class Thread0Demo {

	public static void main(String[] args) {
		// Runnable 인터페이스를 익명 구현 객체로 활용
		Thread thread = new Thread(new Runnable() {
			@Override
			public void run() {
				System.out.println(Thread.currentThread().getName() + " thread ==> ");
				System.out.println("안녕");
			}
		});
		thread.start();

		System.out.println(Thread.currentThread().getName() + " thread ==> ");
		System.out.println("hello");

	}

}