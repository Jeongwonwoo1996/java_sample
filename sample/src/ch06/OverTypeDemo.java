package ch06;

public class OverTypeDemo {

	public static void main(String[] args) {
		Vehicle v = new OldCar();
		System.out.println(v.name); // 필드는 오버라이딩 대상이 아님
		v.whoami(); // 메서드는 오버라이딩 되어서 자식의 기능이 실행
		Vehicle.move();
		v.move();

		OldCar oc = new OldCar();
		System.out.println(oc.name);
		oc.whoami();
		OldCar.move();
		oc.move();

		v = new SportsCar();
		v.whoami();

		Vehicle[] vehicles = new Vehicle[2];
		vehicles[0] = new OldCar();
		vehicles[1] = new SportsCar();

		for (Vehicle vehicle : vehicles) {
			vehicle.whoami();
			vehicle.move();
		}

	}

}
