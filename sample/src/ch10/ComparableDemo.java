package ch10;

import java.util.Arrays;

public class ComparableDemo {

	public static void main(String[] args) {
		Rectangle[] rectangles = { new Rectangle(3, 5), new Rectangle(2, 10), new Rectangle(5, 5) };

		Arrays.sort(rectangles); // compareTo 의 기본 정렬 방식으로 정렬됨, ascending 방식 정렬
//		Arrays.sort(rectangles, new Comparator<Rectangle>() {
//			@Override
//			public int compare(Rectangle o1, Rectangle o2) {
//				return o2.height - o1.height;
//			};
//		}); // compareTo의 기본 정렬 방식이 아닌 다른 기준으로 정렬 ==> 높이가 더 큰 것이 앞으로 오도록 정렬

		Arrays.sort(rectangles, (o1, o2) -> o2.height - o1.height); // compareTo의 기본 정렬 방식이 아닌 다른 기준으로 정렬 ==> 높이가 더 큰 것이
																	// 앞으로 오도록 정렬
		System.out.println(Arrays.toString(rectangles));

	}

}

class Rectangle implements Comparable<Rectangle> {
	int width, height;

	public Rectangle(int width, int height) {
		super();
		this.width = width;
		this.height = height;
	}

	public int findArea() {
		return width * height;
	}

	@Override
	public String toString() {
		return String.format("사각형[폭=%d, 높이=%d]", width, height);
	}

	@Override
	public int compareTo(Rectangle o) {
		return this.findArea() - o.findArea();
	}

}
