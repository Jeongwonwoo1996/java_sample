package ch10;

public class UseThisDemo {

	public static void main(String[] args) {
		new UseThisDemo().lambda();

	}

	public void lambda() {

		String hi = "Hi!";

		UseThis u = new UseThis() {

			@Override
			public void use() {
				System.out.println(this); // this ===> 익명클래스 자기 자신을 의미
//				hi = hi + "lambda";
			}
		};

		u.use();

		UseThis u1 = new UseThis() {

			@Override
			public void use() {
				System.out.println(this); // this ===> 익명클래스 자기 자신을 의미
			}
		};

		u1.use();

		UseThis u2 = () -> {
			System.out.println(this);
//			hi = hi + "lambda"; 외부에서 선언한 변수를 다시 선언할 수 없고, final 로 취급
		};
		u2.use();
	}

	@Override
	public String toString() {
		return "UseThisDemo";
	}

}

interface UseThis {
	void use();
}
