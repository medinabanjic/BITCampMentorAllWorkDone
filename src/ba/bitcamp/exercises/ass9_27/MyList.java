package ba.bitcamp.exercises.ass9_27;

import java.util.Collection;
import java.util.Iterator;

public class MyList implements Collection<MyList> {

	private Node first;
	private Node next;

	public MyList() {
		first = null;
	}

	@Override
	public int size() {
		int counter = 0;
		Node temp = first;
		while (temp != null) {
			temp = temp.next;
			counter++;
		}
		return counter;
	}

	@Override
	public boolean isEmpty() {
		if (first != null) {
			return false;
		}
		return true;
	}

	@Override
	public boolean contains(Object o) {
		Node temp = first;
		while (true) {
			if (temp.equals(o)) {
				return true;
			}
			if (temp.getNextNode() == null) {
				return false;
			}
			temp = temp.next;
		}
	}

	@Override
	public Object[] toArray() {
		if (first != null) {
			Node temp = first;
			Integer[] array = new Integer[size() + 1];
			for (int i = 0; i < array.length; i++) {
				array[i] = temp.getValue();
				temp = temp.next;
			}
			return array;
		} else {
			return null;
		}
	}

	@Override
	public <T> T[] toArray(T[] a) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean add(MyList e) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean remove(Object o) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean containsAll(Collection<?> c) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean addAll(Collection<? extends MyList> c) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean removeAll(Collection<?> c) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean retainAll(Collection<?> c) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public void clear() {
		// TODO Auto-generated method stub

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	private class Node {
		private int value;
		private Node next;

		public Node(int value) {
			this.value = value;
		}

		public int getValue() {
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
			if (value != other.value)
				return false;
			return true;
		}

		private MyList getOuterType() {
			return MyList.this;
		}

	}

	@Override
	public Iterator<MyList> iterator() {
		// TODO Auto-generated method stub
		return null;
	}

}
