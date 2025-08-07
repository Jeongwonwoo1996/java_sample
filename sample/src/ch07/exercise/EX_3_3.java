package ch07.exercise;

import java.util.Arrays;

public class EX_3_3 {

	public static void main(String[] args) {

		Book[] books = { new Book(15000), new Book(50000), new Book(20000) };

		System.out.println("정렬전");
		for (Book book : books) {
			System.out.println(book);
		}

		Arrays.sort(books);

		System.out.println("정렬후");

		for (Book book : books) {
			System.out.println(book);
		}

	}

}

class Book implements Comparable {
	int price;

	public Book(int price) {
		super();
		this.price = price;
	}

	@Override
	public int compareTo(Object o) {
		if (o instanceof Book b) {
			return this.price - b.price;
		}
		return -9999999;
	}

	@Override
	public String toString() {
		return String.format("Book [price=%d]", price);
	}

}
