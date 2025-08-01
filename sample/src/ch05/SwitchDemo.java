package ch05;

public class SwitchDemo {

	public static void main(String[] args) {
		NewGender gender = NewGender.남성;

		String s = switch (gender) {
		case 남성 -> "은 병역의무가 있다.";
		case 여성 -> "은 병역의무가 없다.";
		default -> "* ";
		};

		System.out.println(gender + s);
	}

}

enum NewGender {
	남성, 여성
}
