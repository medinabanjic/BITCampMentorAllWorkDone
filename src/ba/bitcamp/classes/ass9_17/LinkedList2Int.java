package ba.bitcamp.classes.ass9_17;

public class LinkedList2Int {

	private Node head;

	public LinkedList2Int() {
		head = null;
	}

	public void addHead(int x) {
		Node newNode = new Node(x);
		if (head == null) {
			head = newNode;
		} else {
			newNode.setNext(head);
			head = newNode;
		}
	}

	public void removeHead() {
		if (head.getNext() == null) {
			head = null;
		} else {
			head = head.getNext();
		}
	}
	
	public void addLast(int x){
		Node last = null;
		Node newNode = new Node(x);
		while(head.getNext() != null){
			last = head.getNext();
		}
		last.setNext(newNode);
		last = newNode;		
	}
	
	public void removeLast(){
		
	}

	public String toString() {
		return head.toString();
	}

	private class Node {
		private Node next;
		private int value;

		public Node(int value) {
			this.value = value;
		}

		public Node getNext() {
			return next;
		}

		public void setNext(Node next) {
			this.next = next;
		}

		public int getValue() {
			return value;
		}

		public void setValue(int value) {
			this.value = value;
		}

		public String toString() {
			if (next == null) {
				return value + "";
			} else {
				return value + " " + next.toString();
			}
		}

	}
	
	public static void main(String[] args) {
		LinkedList2Int list1 = new LinkedList2Int();
		list1.addHead(5);
	}
}
