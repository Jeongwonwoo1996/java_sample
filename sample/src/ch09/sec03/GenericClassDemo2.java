package ch09.sec03;

import java.util.ArrayList;

public class GenericClassDemo2 {

	public static void main(String[] args) {
		Cup<Beer> beerCup = new Cup<>();

//		beerCup.setBeverage(new Ball("red"));
//		beerCup.setBeverage(new Boricha());

		beerCup.setBeverage(new Beer());
		Beer b = beerCup.getBeverage();
		b.drink();

		Cup<Boricha> borichaCup = new Cup<>();

//		borichaCup.setBeverage(new Beer()); // 미리 정해진 타입만 담을 수 있어서 타입안정성 제공

		borichaCup.setBeverage(new Boricha());
		Boricha b1 = borichaCup.getBeverage(); // 불필요한 타입체크 및 형변환 필요 없음
		b1.eat();

		ArrayList<Integer> intArr = new ArrayList<>();
//		intArr.add("str");
//		intArr.add(0.2f);
		intArr.add(10);

		int i = intArr.get(0);
		System.out.println(i);

		ArrayList list = new ArrayList(); // raw type은 권장하지 않는다.
		list.add(10);
		list.add(10.0);
		list.add("hello");
		list.add(new Beverage());

		System.out.println(list);
		Integer i2 = (Integer) list.get(3);
	}

}

class Beverage {
}

class Cup<T> {
	private T beverage;

	public T getBeverage() {
		return beverage;
	}

	public void setBeverage(T beverage) {
		this.beverage = beverage;
	}
}

class Beer extends Beverage {
	void drink() {
		System.out.println("맥주를 마신다.");
	}
}

class Boricha extends Beverage {
	void eat() {
		System.out.println("보리차를 마신다.");
	}
}
