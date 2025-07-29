package ch04;

public class ClassDiagramEx {

	public static void main(String[] args) {
		Animal animal = new Animal();
	}

}

class Animal {
	public int age;
	public String gender;

	public void isMammal() {

	}

	public void introduce(String name) {

	}

}

class Duck extends Animal {
	public String beakColor = "yellow";

	public void swim() {

	}

	public void quak() {

	}
}

class Fish extends Animal {
	public int sizeFt;

	public void swim() {

	}
}
