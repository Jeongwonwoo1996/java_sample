package ch06_exercise5;

public class ch06Test {
	public static void main(String[] args) {
		Phone[] phones = { new Phone("황진이"), new Telephone("길동이", "내일"), new SmartPhone("민국이", "갤러그") };

		for (Phone p : phones) {
			if (p instanceof SmartPhone sp) {
				sp.playGame();
			} else if (p instanceof Telephone tp) {
				tp.autoAnswering();
			} else if (p instanceof Phone) {
				p.talk();
			}
		}

	}

}
