package ch06_exercise3;

class Person {
	private String name;
	private int age;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public Person(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}

	public String show() {
		return String.format("사람[이름: %s, 나이: %d]", name, age);
	}

}

class Student extends Person {

	private String studentNumber;

	public Student(String name, int age, String studentNumber) {
		super(name, age);
		this.studentNumber = studentNumber;
	}

	public String getStudentNumber() {
		return studentNumber;
	}

	public void setStudentNumber(String studentNumber) {
		this.studentNumber = studentNumber;
	}

	@Override
	public String show() {
		return String.format("사람[이름: %s, 나이: %d, 학번: %s]", super.getName(), super.getAge(), studentNumber);
	}

}

class ForeignStudent extends Student {
	private String nationality;

	public String getNationality() {
		return nationality;
	}

	public void setNationality(String nationality) {
		this.nationality = nationality;
	}

	public ForeignStudent(String name, int age, String studentNumber, String nationality) {
		super(name, age, studentNumber);
		this.nationality = nationality;
	}

	@Override
	public String show() {
		return String.format("사람[이름: %s, 나이: %d, 학번: %s, 국적: %s]", super.getName(), super.getAge(),
				super.getStudentNumber(), nationality);
	}

}
