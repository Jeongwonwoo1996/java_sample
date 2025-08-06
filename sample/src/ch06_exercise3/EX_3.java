package ch06_exercise3;

public class EX_3 {

	public static void main(String[] args) {
		Person[] persons = new Person[3];

		persons[0] = new Person("길동이", 22);
		persons[1] = new Student("황진이", 23, "100");
		persons[2] = new ForeignStudent("Amy", 30, "200", "U.S.A");

		for (Person person : persons) {
			System.out.println(person.show());
		}
	}

}
