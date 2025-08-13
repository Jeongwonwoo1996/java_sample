package ch11;

import java.util.LinkedList;
import java.util.Queue;

public class QueueDemo {

	public static void main(String[] args) {
		Queue<String> q = new LinkedList<>();
		q.offer("A");
		q.offer("B");
		q.offer("C");

		while (!q.isEmpty()) {
			System.out.println(q.poll());
		}

		q.add("D");
		q.add("E");
		q.add("F");

		System.out.println(q.peek());
		while (!q.isEmpty()) {
			System.out.println(q.poll());
		}

	}
}
