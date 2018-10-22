class BinarySearchTree<Key extends Comparable<Key>, Value> {
	Node head;
	BinarySearchTree() {

	}
	private class Node {
		private Book key;
		private Value value;
		private Node left;
		private Node right;
		private int count;
	}
	// time complexity is O (log N)
	public void put(Book k, Value v) {
		if (k == null) {
			System.out.println("key is null");
		}
		head = put(head, k, v);
	}
	// time complexity is O (log N)
	public Node put(Node head, Book k, Value v) {
		if (head == null) {
			Node n = new Node();
			n.key = k;
			n.value = v;
			n.left = null;
			n.right = null;
			n.count = 1;
			head = n;
		}
		int index = k.compareTo(head.key);
		if (index < 0) {
			head.left = put(head.left, k, v);
		} else if (index > 0) {
			head.right = put(head.right, k, v);
		} else {
			head.value = v;
		}
		head.count = 1 + size(head.left) + size(head.right);
		return head;
	}
	// time complexity is O (log N)
	public Value get(Book k) {
		return get(head, k);
	}
	// time complexity is O (log N)
	public Value get(Node head, Book k) {
		// System.out.println("deepak");
		if (k == null) {
			System.out.println("key is null");
		}
		if (head == null) {
			return null;
		}
		int index = k.compareTo(head.key);
		if (index < 0) {
			return get(head.left, k);
		} else if (index > 0) {
			return get(head.right, k);
		} else {
			return head.value;
		}
	}
	public Book min() {
		return min(head).key;
	}
	public Node min(Node head) {
		if (head.left == null) {
			return head;
		} else {
			return min(head.left);
		}
	}
	public Book max() {
		return max(head).key;
	}
	public Node max(Node head) {
		if (head.right == null) {
			return head;
		} else {
			return max(head.right);
		}
	}
	public Book floor(Book k) {
		Node n = floor(head, k);
		if (n == null) {
			return null;
		} else {
			return n.key;
		}
	}
	public Node floor(Node head, Book k) {
		if (head == null) {
			return null;
		}
		int i = k.compareTo(head.key);
		if (i == 0) {
			return head;
		}
		if (i < 0) {
			return floor(head.left, k);
		}
		Node n = floor(head.right, k);
		if (n != null) {
			return n;
		} else {
			return head;
		}
	}
	public Book ceil(Book k) {
		Node n = ceil(head, k);
		if (n == null) {
			return null;
		} else {
			return n.key;
		}
	}
	public Node ceil(Node head, Book k) {
		if (head == null) {
			return null;
		}
		int i = k.compareTo(head.key);
		if (i == 0) {
			return head;
		}
		if (i > 0) {
			return ceil(head.right, k);
		}
		Node n = floor(head.left, k);
		if (n != null) {
			return n;
		} else {
			return head;
		}
	}
	public Book select(int k) {
		if (k < 0 || k >= size(head)) {
			System.out.println("invalid");
		}
		Node n = select(head, k);
		return n.key;
	}
	public Node select(Node head, int k) {
		if (head == null) {
			return null;
		}
		int i = size(head.left);
		if (i > k) {
			return select(head.left, k);
		} else if (i < k) {
			return select(head.right, k - i - 1);
		} else {
			return head;
		}
	}
	public int rank(Book k) {
		return rank(head, k);
	}
	public int rank(Node head, Book k) {
		if (head == null) {
			return 0;
		}
		int i = k.compareTo(head.key);
		if (i < 0) {
			return rank(head.left, k);
		} else if (i > 0) {
			return 1 + size(head.left) + rank(head.right, k);
		} else {
			return size(head.left);
		}
	}
	public int size() {
		return size(head);
	}
	public int size(Node head) {
		if (head == null) {
			return 0;
		} else {
			return head.count;
		}
	}
}