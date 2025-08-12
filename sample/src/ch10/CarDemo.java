package ch10;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class CarDemo {

	public static void main(String[] args) {
		List<Car> list = Car.cars.subList(0, 3);
		System.out.println(list.size());
		Car[] cars = list.toArray(new Car[3]);

		Arrays.sort(cars);
		System.out.println(Arrays.toString(cars));

		Comparator<Car> modelComparator = Comparator.comparing(c -> c.getModel());

		Arrays.sort(cars, modelComparator);
		System.out.println(Arrays.toString(cars));

		Arrays.sort(cars, modelComparator.reversed());
		System.out.println(Arrays.toString(cars));

//		Comparator<Car> mileageComparator = Comparator.comparing(c -> c.getMileage());
		Comparator<Car> mileageComparator = Comparator.comparing(Car::getMileage);

		Arrays.sort(cars, mileageComparator);
		System.out.println(Arrays.toString(cars));

//		Comparator<Car> AgeComparator = Comparator.comparing(c -> c.getAge());
		Comparator<Car> AgeComparator = Comparator.comparing(Car::getAge);

		Arrays.sort(cars, AgeComparator.reversed());
		System.out.println(Arrays.toString(cars));

	}

}
