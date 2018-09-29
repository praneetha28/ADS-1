/**.
 * List of linkeds.
 */
class LinkedList {
    /**.
     * { var_description }
     */
    private static Node head;
    /**.
     * { var_description }
     */
    private static Node tail;
    /**.
     * { var_description }
     */
    private static int size= 0;
    /**.
     * Class for node.
     */
    private static class Node {
        /**.
         * { var_description }
         */
        private char value;
        /**.
         * { var_description }
         */
        private Node next;
    }
    /**.
     * Constructs the object.
     */
    LinkedList() {
        head = null;
        tail = null;
    }
    /**.
     * { function_description }
     *
     * @param      value  The value
     */
    // public static void insertBack(char value) {
    // 	System.out.println("in insert");
    public static void push(final char value) {
        Node oldHead = head;
        head = new Node();
        head.value = value;
        head.next = oldHead;
        size++;
    }
    /**.
     * { function_description }
     *
     * @param      value  The value
     */
    public static void insertFront(final char value) {
        if (head == null) {
            head = new Node();
            head.value = value;
            head.next = null;
            tail = head;
        } else {
            Node oldHead = head;
            head = new Node();
            head.value = value;
            head.next = oldHead;
        }
        size++;
    }
    public static String displayAll() {
            String str = "";
            Node temp = head;
            while (temp != null) {
                str += temp.value;
                temp = temp.next;
            }
            return str;
	    	// String str = "";
      //       Node temp = head;
      //       while (temp != null) {
      //           str += temp.value;
      //           temp = temp.next;
      //       }
      //       return str;
	}
    public static char pop() {
        if (tail != null) {
            Node temp = null;
            Node popped = tail;
            char item = popped.value;
            Node element = head;
            while (element != tail) {
                temp = element;
                element = element.next;
            }
            tail = temp;
            tail.next = null;
            // popped.next = null;
            size--;
            return item;
        }
        return 0;
    }
    /**.
     * { function_description }
     *
     * @return     { description_of_the_return_value }
     */
    public static void deleteBack() {
        // if (tail != null) {
        //     Node temp = head;
        //     Node last = tail;
        //     while (temp != tail) {
        //         temp = temp.next;
        //     }
        //     tail = temp;
        //     tail.next = null;
        //     last.next = null;
        //     size--;
        // }
        if (tail != null) {
            Node temp = null;
            Node popped = tail;
            // int item = popped.value;
            Node element = head;
            while (element != tail) {
                temp = element;
                element = element.next;
            }
            tail = temp;
            tail.next = null;
            // popped.next = null;
            size--;
            // return item;
        }
        // return 0;
    }
    public static int size() {
        return size;
    }
}