package ch02;

public class UpDemo {

	public static void main(String[] args) {
		int j, i = 3;

//		j = i++;
//		j = i;
//		i = i + 1;

		j = ++i;
//		i = i + 1;
//		j = i;

		System.out.printf("%d, %d", j, i);

	}

}
