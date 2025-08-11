package ch09;

public class BoundTypeDemo {

	public static void main(String[] args) {
		BoundCup<Beer> c1 = new BoundCup();
		c1.setBeverage(new Beer());
//		c1.setBeverage(new Boricha());

		BoundCup<Boricha> c2 = new BoundCup();

//		BoundCup<String> c3 = new BoundCup<>();
	}

}

class BoundCup<T extends Beverage> {
	private T beverage;

	public T getBeverage() {
		return beverage;
	}

	public void setBeverage(T beverage) {
		this.beverage = beverage;
	}
}
