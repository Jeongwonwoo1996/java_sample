package ch04;

public class RefTypeDemo {

	public static void main(String[] args) {
		int i = 10;
		Ball myBall = new Ball();
		Ball yourBall = new Ball();

		System.out.println(myBall);
		System.out.println(yourBall);
		System.out.println(yourBall == myBall);

		myBall = yourBall; // 6e2c634b
		System.out.println(myBall);
		System.out.println(yourBall); // 내용이 동일(동등성) 내용,모든게 동일(동일성)
		System.out.println(yourBall == myBall);

	}

}

class Ball {

}