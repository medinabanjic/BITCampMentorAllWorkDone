package ba.bitcamp.exercises.ass9_26;

import java.util.Arrays;
import java.util.EmptyStackException;

import ba.bitcamp.exercises.ass9_25.Song;

public class StringStack {

	private String[] array;

	public StringStack() {
		super();
		array = new String[0];
	}

	public boolean isEmpty() {
		return (array.length == 0);
	}

	public String push(String s) {
		array = Arrays.copyOf(array, array.length + 1);
		array[array.length - 1] = s;
		return s;
	}

	public String pop() throws EmptyStackException {
		if (array.length <= 0) {
			throw new EmptyStackException();
		} else {
			String temp = array[array.length - 1];
			array = Arrays.copyOf(array, array.length - 1);
			return temp;
		}
	}

	public String peek() throws EmptyStackException {
		if (isEmpty()) {
			throw new EmptyStackException();
		} else {
			return array[array.length - 1];
		}
	}

	public int search(String s) {
		int counter = 1;
		for (int i = array.length - 1; i >= 0; i--) {

			if (array[i].equals(s)) {
				return counter;
			}
			counter++;
		}
		return -1;
	}

	private class Node {
		private Song value;
		private Node next;

		public Node(Song value) {
			this.value = value;
		}

		public Song getValue() {
			return value;
		}

		public Node getNextNode() {
			return next;
		}

		public void setNextNode(Node next) {
			this.next = next;
		}

		@Override
		public String toString() {
			if (next == null) {
				return value + "";
			}

			return value + " " + next.toString();
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
			if (value == null) {
				if (other.value != null)
					return false;
			} else if (!value.equals(other.value))
				return false;
			return true;
		}

		private StringStack getOuterType() {
			return StringStack.this;
		}

	}

	public static void main(String[] args) {
		long start = System.currentTimeMillis();
		StringStack ss = new StringStack();
		ss.push("Medina");
		ss.push("Banjic");
		ss.push("Davud");
		ss.push("Zaid");
		// ss.pop();
		System.out.println(ss.peek());
		System.out.println(ss.isEmpty());
		System.out.println(ss.search("Medina"));
		System.out.println(System.currentTimeMillis() - start);

	}

}
