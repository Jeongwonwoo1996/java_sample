package dataStructure;

public class ListQueueDemo {

	public static void main(String[] args) {
		ListQueue<Integer> lq = new ListQueue<>();

		lq.offer(10);
		System.out.println(lq);
		lq.offer(20);
		System.out.println(lq);
		lq.offer(30);
		System.out.println(lq);
		lq.offer(40);
		System.out.println(lq);

		System.out.println(lq.size());

		while (!lq.isEmpty()) {
			System.out.println(lq.poll());
			System.out.println(lq.size());
		}
	}

}