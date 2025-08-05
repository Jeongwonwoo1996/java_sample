package ch06;

import static java.util.Arrays.sort;

import java.util.Arrays;
import java.util.Calendar;

public class StaticImportDemo {

	public static void main(String[] args) {
		int[] data = { 5, 3, 1, 2 };
		System.out.println(Arrays.toString(data)); // [5,3,1,2]
		sort(data);
		System.out.println(Arrays.toString(data)); // [1,2,3,5]

//		Calendar c = Calendar.getInstance();
		System.out.println(Calendar.JANUARY);
	}

}
