package ch06;

public class UpCastingDemo {

	public static void main(String[] args) {
		Student s = new Student();

		Person p = s; // 자식 객체를 가리키는 주소를 부모 타입의 참조변수에 할당할 수 있는것: 자동형변환/Upcasting

		System.out.println(p.name);
		p.whoAmI();

		downcast(s);

		Employee e = new Employee();
		downcast(e);

		SportsPlayer sp = new SportsPlayer();
		downcast(sp);

		Person[] pArr = new Person[4];
		pArr[0] = new Student();
		pArr[1] = new Employee();
		pArr[2] = new SportsPlayer();
		pArr[3] = new Enterainer();

		for (Person person : pArr) {
			person.whoAmI();
		}

//		Student[] sArr = new Student[3];
//		Employee[] eArr = new Employee[3];
//		SportsPlayer[] spArr = new SportsPlayer[3];

	}

	public static void downcast(Person p) {
		p.whoAmI();
	}

//	public static void downcast(Student s) {
//
//	}
//
//	public static void downcast(Employee e) {
//
//	}

}
