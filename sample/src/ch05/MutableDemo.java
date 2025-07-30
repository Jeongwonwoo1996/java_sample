package ch05;

public class MutableDemo {

	public static void main(String[] args) {
		Cat c1 = new Cat("나비"); // 0x100

		Cat c2 = c1; // 객체의 주소를 공유 , 0x100

		System.out.println(c1 + ":" + c2);
		System.out.println(c1.getName()); // 나비
		System.out.println(c2.getName()); // 나비

//		c2.setName("야옹이");

		c2 = new Cat("야옹이"); // 0x200

		System.out.println(c1.getName()); // 나비(X) ==> 야옹이 : side effect
		System.out.println(c2.getName()); // 야옹이

		int i = 1; // 값 복사
		int j = i; // 값 복사

		System.out.println(i + " : " + j);

		j = 3;
		System.out.println(i + " : " + j);

	}

}

class Cat { // mutable ==> immutable
	private final String name; // final ==> name 이 변하지 않게

	public Cat(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

//	public void setName(String name) { // 변경할 수 있는 방법을 없앰
//		this.name = name;
//	}

}
