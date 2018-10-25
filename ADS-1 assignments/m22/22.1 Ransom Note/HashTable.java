class HashTable {
	private int M = 97;
	private Node[] ht = new Node[M];
	int size = 0;
	private static class Node {
		private String key;
		private int value;
		private Node next;

		Node(String k, int v, Node node) {
			this.key = k;
			this.value = v;
			this.next = node;
		}
		public String getKey() {
			return this.key;
		}
		public int getValue() {
			return this.value;
		}
		public String toString() {
			return this.getKey() + " " + this.getValue();
		}
	}

	public void put(String key, int value) {
		int h = hashKey(key);
		Node t = ht[h];
		while (t != null) {
			if (key.equals(t.key)) {
				t.value = value;
				return;
			}
			t = t.next;
		}
		ht[h] = new Node(key, value, ht[h]);
		size++;
	}
	public int hashKey(String key) {
		return (key.hashCode() & 0x7fffffff) % M;
	}
	public int get(String key) {
		int h = hashKey(key);
		Node t = ht[h];
		while (t != null) {
			if (key.equals(t.key)) {
				return t.value;
			}
			t = t.next;
		}
		return -1;
	}
	// public void delete(String key) {
	// 	int h = hashKey(key);
	// 	if (ht[h].contains(key)) {
	// 		size--;
	// 	}
	// 	ht[h].delete(key);
	// }
	public boolean contains(String key) {
		return get(key) != -1;
	}
	public void display() {
		for (int i = 0; i < ht.length; i++) {
			System.out.println(ht[i]);
		}
	}
}