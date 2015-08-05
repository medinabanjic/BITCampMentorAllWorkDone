package ba.bitcamp.classes.ass9_21;

public class BinarySearchTree<T extends Comparable<T>> {

	private Node root;

	public BinarySearchTree() {
		super();
		this.root = null;
	}

	public void add(T value) {
		if (root == null) {
			root = new Node(value);
			return;
		}
		add(root, value);
	}

	private void add(Node subRoot, T value) {
		if (subRoot.value.compareTo(value) == 1) {
			if (subRoot.right == null) {
				subRoot.right = new Node(value);
				return;
			}
			add(subRoot.right, value);
		} else {
			if (subRoot.left == null) {
				subRoot.left = new Node(value);
				return;
			}
			add(subRoot.left, value);
		}
	}

	private void printTree(Node subRoot) {
		if (subRoot == null) {
			return;
		}
		printTree(subRoot.left);
		System.out.println(subRoot.value);
		printTree(subRoot.right);
	}


	private class Node {
		public T value;
		public Node left;
		public Node right;

		public Node(T value) {
			super();
			this.value = value;
		}
		
		public String toString(){
			return value.toString();
		}

	}

	public static void main(String[] args) {
		BinarySearchTree<Integer> bst = new BinarySearchTree<Integer>();
		bst.add(5);
		bst.add(8);
		bst.add(2);

		bst.printTree(bst.root);
	}

}
