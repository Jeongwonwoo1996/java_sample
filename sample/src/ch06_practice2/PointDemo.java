package ch06_practice2;

public class PointDemo {

	public static void main(String[] args) {

		Point point = new Point(3, 5);
		System.out.println(point.toString());

		MovablePoint movablePoint = new MovablePoint(3, 5, 6, 10);
		System.out.println(movablePoint.toString());
	}

}
