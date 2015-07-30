package ba.bitcamp.exercises.ass9_28;

import java.util.Collection;
import java.util.EmptyStackException;
import java.util.Iterator;

public class MyStack<T> {

	private Node start;
	private Node last;
	private int size;

	public MyStack() {
		super();
		start = null;
		size = 0;

	}

	public void setLast(Node n) {
		last = n;
	}

	public Node getLast() {
		last = start;
		while (last.next != null) {
			last = last.next;
		}
		return last;
	}

	public T push(T s) {
		Node newNode = new Node(s);
		if (start != null) {
			Node temp = start;
			while (temp.next != null) {
				temp = temp.next;
			}
			temp.setNextNode(newNode);
		} else {
			start = newNode;
		}
		size++;
		return s;
	}

	public T pop() throws EmptyStackException {
		if (start == null) {
			throw new EmptyStackException();
		} else {
			Node temp = last;
			setLast (getLast().previous);
			getLast().next = null;
			size--;
			return temp.value;
		}
	}

	public T peek() throws EmptyStackException {
		if (start == null) {
			throw new EmptyStackException();
		} else {
			return getLast().value;
		}
	}

	public int search(T s) {
		int counter = 1;
		Node temp = getLast();
		for (int i = size - 1; i >= 0; i--) {

			if (temp.value.equals(s)) {
				return counter;
			}
			temp = temp.previous;
			counter++;
		}
		return -1;
	}

	public void addAll(Collection<T> col) {
		Iterator<T> it = col.iterator();
		while (it.hasNext()) {
			Node newNode = new Node(it.next());
			last.next = newNode;
			last = newNode;

		}
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		MyStack other = (MyStack) obj;
		if (last == null) {
			if (other.last != null)
				return false;
		} else if (!last.equals(other.last))
			return false;
		if (size != other.size)
			return false;
		if (start == null) {
			if (other.start != null)
				return false;
		} else if (!start.equals(other.start))
			return false;
		return true;
	}

	private class Node {
		private T value;
		private Node next;
		private Node previous;

		public Node(T value) {
			this.value = value;
		}

		public T getValue() {
			return value;
		}

		public Node getNextNode() {
			return next;
		}

		public void setNextNode(Node next) {
			this.next = next;
		}

		public Node getPreviousNode() {
			previous = start;
			while (previous.next != this) {
				previous = previous.next;
			}
			return previous;
		}

		public void setPreviousNode(Node n) {
			previous = n;
		}

		@Override
		public boolean equals(Object obj) {
			if (this == obj)
				return true;
			if (obj == null)
				return false;
			if (getClass() != obj.getClass())
				return false;
			Node other = (Node) obj;
			if (!getOuterType().equals(other.getOuterType()))
				return false;
			if (next == null) {
				if (other.next != null)
					return false;
			} else if (!next.equals(other.next))
				return false;
			if (previous == null) {
				if (other.previous != null)
					return false;
			} else if (!previous.equals(other.previous))
				return false;
			if (value == null) {
				if (other.value != null)
					return false;
			} else if (!value.equals(other.value))
				return false;
			return true;
		}

		@Override
		public String toString() {
			if (next == null) {
				return value + "";
			}

			return value + " " + next.toString();
		}

		private MyStack getOuterType() {
			return MyStack.this;
		}

	}

	public static void main(String[] args) {
		MyStack<Object> ss = new MyStack<Object>();
		ss.push("Medina");
		ss.push("Banjic");
		ss.push("Davud");
		ss.push("Zaid");
		ss.pop();
		System.out.println(ss.peek());

		// System.out.println(ss.search("Medina"));

	}
}
