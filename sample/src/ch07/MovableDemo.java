package ch07;

public class MovableDemo {

	public static void main(String[] args) {
		Movable m = new Car();

		m.move(5);
//		m.show();

		Car c = (Car) m;
		c.move(5);
		c.show();
	}

}

interface Movable {
	void move(int s);
}

class Car implements Movable {
	private int pos = 0;

	@Override
	public void move(int x) {
		pos += x;
	}

	public void show() {
		System.out.println(pos + "m 이동했습니다.");
	}

}
