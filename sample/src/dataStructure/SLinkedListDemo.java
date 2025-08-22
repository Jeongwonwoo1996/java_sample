package dataStructure;

public class SLinkedListDemo {

	public static void main(String[] args) {
		SLinkedList<Integer> list = new SLinkedList<>();
		System.out.println(list.indexOf(10));

		// list.removeFirst();

		System.out.println(list.isEmpty());
		System.out.println(list.size());
		System.out.println(list);

		list.addFirst(10);
		System.out.println(list.size());
		System.out.println(list);
		System.out.println(list.indexOf(10));

		if (!list.isEmpty()) {
			list.remove(0);
			System.out.println(list.size());
			System.out.println(list);
		}

		if (!list.isEmpty()) {
			System.out.println(list.removeFirst());
			System.out.println(list.size());
			System.out.println(list);
		}

		list.addFirst(20);
		System.out.println(list.size());
		System.out.println(list);
		list.addFirst(30);
		System.out.println(list.size());
		System.out.println(list);

		list.addLast(40);
		System.out.println(list.size());
		System.out.println(list);
		System.out.println(list.get(0));

		list.add(1, 15);
		System.out.println(list.size());
		System.out.println(list);

		list.add(0, 5);
		System.out.println(list.size());
		System.out.println(list);

		list.add(list.size(), -10);
		System.out.println(list.size());
		System.out.println(list);

		System.out.println(list.remove(2) + "가 지워짐");
		System.out.println(list.size());
		System.out.println(list);

		list.add(4, 10);
		list.add(2, 10);
		System.out.println(list.size());
		System.out.println(list);

		System.out.println(list.indexOf(10));
	}

}