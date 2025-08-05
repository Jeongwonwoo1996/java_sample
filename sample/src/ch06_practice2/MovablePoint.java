package ch06_practice2;

public class MovablePoint extends Point {

	private int xSpeed, ySpeed;

	MovablePoint(int x, int y, int xSpeed, int ySpeed) {
		super(x, y);
		this.xSpeed = xSpeed;
		this.ySpeed = ySpeed;
	}

	public int getxSpeed() {
		return xSpeed;
	}

	public void setxSpeed(int xSpeed) {
		this.xSpeed = xSpeed;
	}

	public int getySpeed() {
		return ySpeed;
	}

	public void setySpeed(int ySpeed) {
		this.ySpeed = ySpeed;
	}

	@Override
	public String toString() {
		return String.format("MovablePoint point(%d, %d, %d, %d)", super.getX(), super.getY(), xSpeed, ySpeed);
	}

}
