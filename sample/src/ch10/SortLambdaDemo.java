package ch10;

import java.util.ArrayList;
import java.util.Collections;

public class SortLambdaDemo {

	public static void main(String[] args) {
		ArrayList<Integer> arr = new ArrayList<>();
		arr.add(5);
		arr.add(3);
		arr.add(7);

		Collections.sort(arr);

		System.out.println(arr);
		// 내림차순으로 정렬하려면 두번째 매개변수인 Comparator FI를 구현해야 한다.
		// 숫자끼리 비교이기 때문에 - 연산자를 사용해서 구현했음.
//		Collections.sort(arr, new Comparator<Integer>() {
//
//			@Override
//			public int compare(Integer o1, Integer o2) {
//				return o2 - o1;
//			}
//
//		});

		Collections.sort(arr, (o1, o2) -> o2 - o1);
		System.out.println(arr);

		ArrayList<String> sArr = new ArrayList<>();
		Collections.sort(sArr);
		sArr.add("c");
		sArr.add("a");
		sArr.add("d");

		Collections.sort(sArr);
		System.out.println(sArr);

		// 내림차순으로 문자열을 정렬하려면 두번째 매개변수인 Comparator FI를 구현해야 한다.
		// 문자열끼리 비교하려면 ????

//		Collections.sort(sArr, new Comparator<String>() {
//
//			@Override
//			public int compare(String o1, String o2) {
//				return o2.compareTo(o1);
//			}
//		});

		Collections.sort(sArr, (o1, o2) -> o2.compareTo(o1));
		System.out.println(sArr);

		// Line 담고 있는 ArrayList 라면 어떻게 비교하지???
		// Line 담고 있는 ArrayList 의 요소들을 ascending, descending 정렬해보자.
		Line l1 = new Line(10);
		Line l2 = new Line(7);

		int res = l1.compareTo(l2);
		if (res > 0) {
			System.out.println(l1 + "이 더 깁니다.");
		}

		ArrayList<Line> lineList = new ArrayList<>();
		lineList.add(new Line(7));
		lineList.add(new Line(3));
		lineList.add(new Line(2));

		Collections.sort(lineList);
		System.out.println(lineList);

		Collections.sort(lineList, (line1, line2) -> line2.compareTo(line1));
		System.out.println(lineList);

	}

}

class Line implements Comparable<Line> {
	int length;

	public Line(int length) {
		super();
		this.length = length;
	}

	@Override
	public int compareTo(Line line) {
		return this.length - line.length;
	}

	@Override
	public String toString() {
		return "Line[length=" + length + "]";
	}

}
