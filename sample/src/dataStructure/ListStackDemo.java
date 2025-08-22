package dataStructure;

public class ListStackDemo {

	public static void main(String[] args) {
		ListStack<Integer> stack = new ListStack<>();
		// System.out.println(stack.peek());

		System.out.println(stack.isEmpty());
		System.out.println(stack.size());

		stack.push(10);
		stack.push(20);
		stack.push(30);
		System.out.println(stack.peek());
		System.out.println(stack.isEmpty());
		System.out.println(stack.size());

		while (!stack.isEmpty()) {
			System.out.println(stack.pop());
		}
	}

}