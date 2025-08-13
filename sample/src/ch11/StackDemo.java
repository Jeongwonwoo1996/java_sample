package ch11;

import java.util.Stack;

public class StackDemo {

	public static void main(String[] args) {
		Stack<String> stack = new Stack<>();
		System.out.println(stack.size());
		System.out.println(stack.empty());

		stack.push("사과");
		stack.push("바나나");
		stack.push("체리");

		System.out.println(stack.search("체리"));
		System.out.println(stack.search("사과"));

		while (!stack.empty()) {
			System.out.println(stack.pop());
		}

		Stack<Integer> s2 = new Stack<>(); // stack에서는 push, pop을 사용할 것
		s2.add(10);
		s2.add(20);
//		s2.add(0, 100);

		while (!s2.empty()) {
			System.out.println(s2.pop());
		}

	}

}
