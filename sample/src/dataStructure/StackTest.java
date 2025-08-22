package dataStructure;

import java.util.Stack;

public class StackTest {

	public static void main(String[] args) {
		Stack<String> stk = new Stack<>();
		// System.out.println(stk.pop());
		System.out.println(stk.peek());

		stk.push("A");
		stk.push("B");
		stk.push("C");

		if (!stk.empty()) {
			System.out.println(stk.peek());
		}
		System.out.println("# Stack");
		while (!stk.empty()) {
			System.out.println(stk.pop());
		}

	}

}