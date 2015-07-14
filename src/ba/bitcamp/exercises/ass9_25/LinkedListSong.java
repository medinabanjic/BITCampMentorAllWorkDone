package ba.bitcamp.exercises.ass9_25;

public class LinkedListSong {

	private Node first;
	private Node next;

	public LinkedListSong() {
		first = null;
	}

	public LinkedListSong(Song[] songs) {
		Node last = null;

		for (int i = 0; i < songs.length; i++) {
			Node newNode = new Node(songs[i]);

			if (first == null && last == null) {
				first = newNode;
				last = newNode;
			} else {
				last.setNextNode(newNode);
				last = newNode;
			}
		}
	}

	@Override
	public String toString() {
		if (first == null) {
			return "The list is empty";
		}

		return first.toString();
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		LinkedListSong other = (LinkedListSong) obj;
		if (first == null) {
			if (other.first != null)
				return false;
		} else if (!first.equals(other.first))
			return false;
		if (next == null) {
			if (other.next != null)
				return false;
		} else if (!next.equals(other.next))
			return false;
		return true;
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

		private LinkedListSong getOuterType() {
			return LinkedListSong.this;
		}

	}
}
