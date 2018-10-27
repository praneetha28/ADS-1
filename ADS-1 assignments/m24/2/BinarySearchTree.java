class BinarySearchTree<Key extends Comparable<Key>, Value> {
	Node head;
	BinarySearchTree() {

	}
	private class Node {
		private Student key;
		private double value;
		private Node left;
		private Node right;
		private int count;
	}
	// time complexity is O(1)
	public void put(Student k, double v) {
		if (k == null) {
			System.out.println("key is null");
		}
		head = put(head, k, v);
	}
	// time complexity is O (N)
	public Node put(Node head, Student k, double v) {
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
	// time complexity is O(1)
	public double get(Student k) {
		return get(head, k);
	}
	// time complexity is O (N)
	public double get(Node head, Student k) {
		// System.out.println("deepak");
		if (k == null) {
			System.out.println("key is null");
		}
		if (head == null) {
			return 0.0;
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
	// time complexity is O(1)
	public Student min() {
		return min(head).key;
	}
	// time complexity is O (N)
	public Node min(Node head) {
		if (head.left == null) {
			return head;
		} else {
			return min(head.left);
		}
	}
	// time complexity is O(1)
	public Student max() {
		return max(head).key;
	}
	// time complexity is O (N)
	public Node max(Node head) {
		if (head.right == null) {
			return head;
		} else {
			return max(head.right);
		}
	}
	// time complexity is O(1)
	public Student floor(Student k) {
		Node n = floor(head, k);
		if (n == null) {
			return null;
		} else {
			return n.key;
		}
	}
	// time complexity is O ( N)
	public Node floor(Node head, Student k) {
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
	// time complexity is O(1)
	public Student ceil(Student k) {
		Node n = ceil(head, k);
		if (n == null) {
			return null;
		} else {
			return n.key;
		}
	}
	// time complexity is O ( N)
	public Node ceil(Node head, Student k) {
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
	// time complexity is O(1)
	public Student select(int k) {
		if (k < 0 || k >= size(head)) {
			System.out.println("invalid");
		}
		Node n = select(head, k);
		return n.key;
	}
	// time complexity is O (N)
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
	// time complexity is O (1)
	public int rank(Student k) {
		return rank(head, k);
	}
	// time complexity is O (N)
	public int rank(Node head, Student k) {
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
	// time complexity is O (1)
	public int size() {
		return size(head);
	}
	// time complexity is O (1)
	public int size(Node head) {
		if (head == null) {
			return 0;
		} else {
			return head.count;
		}
	}
	// time complexity is O (N)
	public void keys() {
		keys(head);
	}
	// time complexity is O (N)
	public void keys(Node head) {
		if (head == null) {
			return;
		} else {
			keys(head.left);
			System.out.println(head.key);
			keys(head.right);
		}
	}
	// time complexity is O (1)
	public void deleteMin() {
		head = deleteMin(head);
	}
	// time complexity is O (N)
	public Node deleteMin(Node head) {
		if (head.left == null) {
			return head.right;
		}
		head.left = deleteMin(head.left);
		head.count = 1 + size(head.left) + size(head.right);
		return head;
	}
	// time complexity is O (1)
	public void deleteMax() {
		head = deleteMax(head);
	}
	// time complexity is O (N)
	public Node deleteMax(Node head) {
		if (head.right == null) {
			return head.left;
		}
		head.right = deleteMax(head.right);
		head.count = 1 + size(head.left) + size(head.right);
		return head;
	}
	// time complexity is O (1)
	public void delete(Student k) {
		head = delete(head, k);
	}
	// time complexity is O (N)
	public Node delete(Node head, Student k) {
		if (head == null) {
			return null;
		}
		int i = k.compareTo(head.key);
		if (i < 0) {
			head.left = delete(head.left, k);
		} else if (i > 0) {
			head.right = delete(head.right, k);
		} else {
			if (head.right == null) {
				return head.left;
			}
			if (head.left == null) {
				return head.right;
			}
			Node n = head;
			head = min(n.right);
			head.right = deleteMin(n.right);
			head.left = n.left;
		}
		head.count = 1 + size(head.left) + size(head.right);
		return head;
	}
	public void between(double d1, double d2) {
		between(head, d1, d2);
	}
	public void between(Node head, double d1, double d2) {
		if (head == null) {
            return;
        } else {
        	between(head.left, d1, d2);
        	if (head.value >= d1 &&head.value <= d2) {

        		String s = "";
        		s += head.key;
        		String[] key = s.split(",");
        		System.out.println(key[1]);
        	}
        	between(head.right, d1, d2);
        }

	}
	public void greater(double d1) {
		greater(head, d1);
	}
	public void greater(Node head, double d1) {
		if (head == null) {
            return;
        } else {
        	greater(head.left, d1);
        	if (head.value >= d1) {

        		String s = "";
        		s += head.key;
        		String[] key = s.split(",");
        		System.out.println(key[1]);
        	}
        	greater(head.right, d1);
        }

	}
	public void less(double d1) {
		less(head, d1);
	}
	public void less(Node head, double d1) {
		if (head == null) {
            return;
        } else {
        	less(head.left, d1);
        	if (head.value <= d1) {

        		String s = "";
        		s += head.key;
        		String[] key = s.split(",");
        		System.out.println(key[1]);
        	}
        	less(head.right, d1);
        }

	}
}