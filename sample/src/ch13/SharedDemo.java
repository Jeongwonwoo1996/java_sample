package ch13;

import java.util.Random;

public class SharedDemo {

	public static void main(String[] args) {
		SharedCar car = new SharedCar();
		new CarThread("A", car, "부산").start();
		new CarThread("B", car, "서울").start();
		new CarThread("C", car, "대전").start();

	}

}

class SharedCar {
	public synchronized void drive(String name, String where) {
		System.out.println(name + "님이 자동차에 탔습니다.");
		Random r = new Random();
		for (int i = 0; i < r.nextInt(1, 3); i++) {
			System.out.println(name + " 님이 자동차를 운전합니다.");
		}

		System.out.println(name + " 님이 " + where + " 에 도착했습니다.");
	}
}

class CarThread extends Thread {
	private String who;
	private SharedCar car;
	private String where;

	public CarThread(String who, SharedCar car, String where) {
		this.who = who;
		this.car = car;
		this.where = where;
	}

	@Override
	public void run() {
		car.drive(who, where);
	}
}
