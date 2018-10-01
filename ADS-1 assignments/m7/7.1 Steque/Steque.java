class Steque {
	private Node head;
	private Node tail;
    private int size= 0;
    private class Node {
        /**.
         * { var_description }
         */
        private int value;
        /**.
         * { var_description }
         */
        private Node next;
    }
    Steque() {
    	head = null;
    	tail = null;
    }
    public void push(int item) {
    	// System.out.println("in push");
    	if (head == null) {
    		Node n = new Node();
    		n.value = item;
    		n.next = null;
    		head = n;
    		tail = n;
    		size++;
    	} else {
    		Node oldhead = head;
    		Node n = new Node();
    		n.value = item;
    		n.next = oldhead;
    		head = n;
    		// tail = oldhead;
    		size++;
    	}
    }
    public int pop() {
    	if (head != null) {
    		int item = head.value;
    		head = head.next;
    		size--;
    		return item;
    	}
    	return 0;
    }
    public void enqueue(int item) {
    	// System.out.println("in enqueue");
    	if (tail == null) {
    		Node n = new Node();
    		n.value = item;
    		n.next = null;
    		head = tail;
    		size++;
    	} else {
    		Node oldtail = tail;
    		Node n = new Node();
    		n.value = item;
    		n.next = null;
    		oldtail.next = n;
    		tail = n;
    		size++;
    	}
    }
    public int size() {
    	return size;
    }
    public String display() {
    	if (size != 0) {
            String str = "";
            Node temp = head;
            while (temp != null) {
                str += temp.value + ", ";
                temp = temp.next;
            }
            return str.substring(0, str.length() - 2);
        } else if (size == 1){
        	String str = "";
        	Node temp = head;
        	str += temp.value;
        	return str;
        }
        return "";
    }
    public boolean isEmpty() {
        return head == null || tail == null;
    }
}