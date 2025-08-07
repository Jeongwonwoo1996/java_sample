package ch07.exercise;

public class EX_3_2 {

	public static void main(String[] args) {
		Triangle t1 = new Triangle(5, 10);
		Triangle t2 = new Triangle(8, 5);

		System.out.println(t1.toString());
		System.out.println(t2.toString());

		System.out.println(t1.equals(t2));
		System.out.println(t1.compareTo(t2));

	}

}

class Triangle implements Comparable {

	int width;
	int height;

	public Triangle(int width, int height) {
		super();
		this.width = width;
		this.height = height;
	}

	@Override
	public boolean equals(Object obj) {
//		return super.equals(obj);
		if (obj instanceof Triangle triangle) {
			return (int) (height * width * 0.5) == (int) (triangle.width * triangle.height * 0.5);
		}
		return false;

	}

	@Override
	public int compareTo(Object obj) {
		if (obj instanceof Triangle triangle) {
			return (int) (height * width * 0.5) - (int) (triangle.width * triangle.height * 0.5);
		}
		return 0;
	}

	@Override
	public String toString() {
		return String.format("Triangle [width = %d, height = %d, 넓이 = %f]", width, height, (width * height * 0.5));
	}

}
