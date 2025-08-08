package ch08;

import java.util.Calendar;

public class CalendarDemo {

	public static void main(String[] args) {
		Calendar c = Calendar.getInstance();

		System.out.println(c);

		System.out.println(c.get(Calendar.MILLISECOND));
		System.out.println(Calendar.MONTH);
		System.out.println(c.get(Calendar.YEAR) + "년");
		System.out.println(c.get(Calendar.MONTH) + 1 + "월");

		Calendar c1 = Calendar.getInstance();

		System.out.println(c == c1);
		System.out.println(c.get(Calendar.MILLISECOND));
	}

}