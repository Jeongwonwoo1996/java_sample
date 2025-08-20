
package ch13;

public class Thread2Demo {

	public static void main(String[] args) {
		// Runnable 인터페이스의 구현체를 따로 작성하고 이를 활용
		Thread thread = new Thread(new MyRunnable());
		// thread.start();
		thread.run();

		Thread thread1 = new Thread(new MyRunnable());
		thread1.start();

		System.out.println(Thread.currentThread().getName() + " thread ==> ");
		System.out.println("hello");

	}

}

// 작업할 내용
class MyRunnable implements Runnable {

	@Override
	public void run() {
		System.out.println(Thread.currentThread().getName() + " thread ==> ");
		System.out.println("안녕");
	}

}