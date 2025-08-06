package ch06;

public class DowncastDemo {

	public static void main(String[] args) {

//		Class casting except
//		Person p = new Person();
//		Student s = (Student) p;

		Person pp = new Person();
		System.out.println(pp instanceof Student);
		System.out.println(pp instanceof Person);
		System.out.println(pp instanceof Object);

		System.out.println();

		Student s = new Student();
		System.out.println(s instanceof Student);
		System.out.println(s instanceof Person);
		System.out.println(s instanceof Object);

		Person p = s; // upcasting, 자동 형변환
		System.out.println(p.name);
		p.whoAmI();
//		p.number; p.work();

		Student s2 = (Student) p; // downcasting, 명시적 형변환
		System.out.println(s2.number);
		s2.work();

		Person[] pArr = new Person[5];
		pArr[0] = new Student();
		pArr[1] = new Employee();
		pArr[2] = new SportsPlayer();
		pArr[3] = new Entertainer();
		pArr[4] = new Person();

		for (Person person : pArr) {
			person.work();
//			if (person instanceof Student st) {
////				Student s0 = (Student) person;
//				st.work();
//			} else if (person instanceof Employee e) {
////				Employee e0 = (Employee) person;
//				e.work();
//			} else if (person instanceof SportsPlayer sp) {
////				SportsPlayer sp0 = (SportsPlayer) person;
//				sp.work();
//			} else if (person instanceof Entertainer et) {
////				Entertainer et0 = (Entertainer) person;
//				et.work();
//			} else if (person instanceof Person) {
//				person.whoAmI();
//
//			}
		}

	}

	public static void downcast(Person person) {
		person.work();
		if (person instanceof Student) {
			Student s0 = (Student) person;
			s0.work();
		} else if (person instanceof Employee) {
			Employee e0 = (Employee) person;
			e0.work();
		} else if (person instanceof SportsPlayer) {
			SportsPlayer sp0 = (SportsPlayer) person;
			sp0.work();
		} else if (person instanceof Entertainer) {
			Entertainer et0 = (Entertainer) person;
			et0.work();
		}
	}

}
