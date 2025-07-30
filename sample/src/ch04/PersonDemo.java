package ch04;

public class PersonDemo {

	public static void main(String[] args) {
		Person p = new Person();
//		p.setAge(21);
//		p.setName("민국");
//		p.setNationionality("대한민국");
//		p.sayHello();

		p.setAge(21).setName("민국").setNationionality("대한민국").sayHello();
	}

}

class Person {
	private String name;
	private int age;
	private String nationality;

	public Person setName(String name) {
		this.name = name;
		return this;
	}

	public Person setAge(int age) {
		this.age = age;
		return this;
	}

	public Person setNationionality(String nationality) {
		this.nationality = nationality;
		return this;
	}

	public void sayHello() {
		System.out.println(nationality + "에 사는 " + age + "살 " + name);
	}
}
