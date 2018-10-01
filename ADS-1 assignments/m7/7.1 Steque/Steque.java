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
// time complexity for this method is 1 as it adds only one element for each function call.
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
// time complexity for this method is 1 as it deletes only one element for each function call and return the element.
    public int pop() {
    	if (head != null) {
    		int item = head.value;
    		head = head.next;
    		size--;
    		return item;
    	}
    	return 0;
    }
// time complexity for this method is 1 as it adds only one element for each function call.
    public void enqueue(int item) {
    	// System.out.println("in enqueue");
    	if (tail == null || head == null) {
    		// System.out.println("if");
    		Node n = new Node();
    		n.value = item;
    		n.next = null;
    		head = n;
    		tail = n;
    		size++;
    	} else {
    		// System.out.println("else");
    		Node oldtail = tail;
    		Node n = new Node();
    		n.value = item;
    		n.next = null;
    		oldtail.next = n;
    		tail = n;
    		size++;
    	}
    }
// time complexity for this method is 1 as it returns the size of the linked list.
    public int size() {
    	return size;
    }
// time complexity for this method is 1 as it returns the linked list in string format.
    public String display() {
    	if (size != 0) {
            String str = "";
            Node temp = head;
            while (temp != null) {
                str += temp.value + ", ";
                temp = temp.next;
            }
            return str.substring(0, str.length() - 2);
        }
        return "";
    }
// time complexity for this method is 1 as it returns the boolean value.
    public boolean isEmpty() {
        return head == null || tail == null;
    }
}