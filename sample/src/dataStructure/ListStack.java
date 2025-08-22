package dataStructure;

import java.util.EmptyStackException;

public class ListStack<E> {
	// 필드
	private Node<E> top;
	private int size;

	// 생성자
	public ListStack() {
		top = null;
		size = 0;
	}

	// push(), pop(), peek()
	public void push(E item) {
		Node<E> newNode = new Node(item, top);
		top = newNode;
		size++;
	}

	public E pop() {
		if (isEmpty()) {
			throw new EmptyStackException();
		}
		// 지워지는 노드를 백업 받아놓음
		Node<E> removedNode = top;
		// top 을 갱신
		top = top.next;
		// 지워지는 노드 정리
		removedNode.next = null;
		if (size == 1) {
			top = null;
		}
		size--;
		return removedNode.item;
	}

	public E peek() {
		if (isEmpty()) {
			throw new EmptyStackException();
		}
		return top.item;
	}

	// size(), isEmpty()
	public int size() {
		return size;
	}

	public boolean isEmpty() {
		return size == 0;
	}

	private class Node<E> {
		private E item;
		private Node<E> next;

		public Node(E item, Node<E> next) {
			this.item = item;
			this.next = next;
		}
	}
}