package ch03;

public class SwitchDemo {

	public static void main(String[] args) {

		// 낙하방식이 없으면 조건 성립하는 아래식으로 다 수행, break문으로 탈출
//		int number = 4;
//
//		switch (number) {
//		case 3:
//			System.out.print("*");
//		case 2:
//			System.out.print("*");
//		case 1:
//			System.out.print("*");
//		default:
//			System.out.print("*");
//
//		}

		String day = "월";

//		dayCheck(day);
		System.out.println(dayCheckReturn(day));
	}

	private static String dayCheckReturn(String day) {
		String gubun = switch (day) {
		case "월", "화", "수", "목", "금" -> "평일";
		case "토", "일" -> "주말";
		default -> "*"; // 반드시 등록
		};
		return gubun;
	}

	private static void dayCheck(String day) {
		switch (day) {
		case "월", "화", "수", "목", "금" -> System.out.print(day + "요일은 평일입니다.");
		case "토", "일" -> System.out.print(day + "요일은 주말입니다.");
		default -> System.out.print("*");
		}

		// switch (day) { // 정수, 문자열, 상수만 들어갈 수 있음, 변수와 실수는 들어갈 수 없음.
//		case "월":
//		case "화":
//		case "수":
//		case "목":
//		case "금":
//			System.out.print(day + "요일은 평일입니다.");
//			break;
//		case "토":
//		case "일":
//			System.out.print(day + "요일은 주말입니다.");
//			break;
//		default:
//			System.out.print("*");
//
//		}
	}

}
