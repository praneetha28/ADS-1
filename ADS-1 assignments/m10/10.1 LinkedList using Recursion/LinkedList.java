/**.
 * { item_description }
 */
import java.util.Scanner;
/**.
 * List of linked lists.
 */
class LinkedList {
    /**.
     * { var_description }
     */
    private Node head;
    /**.
     * { var_description }
     */
    private Node tail;
    /**.
     * { var_description }
     */
    private int size= 0;
    private static int index = 0;
    /**.
     * Class for node.
     */
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
     * @return     { description_of_the_return_value }
     */
// time complexity is O(1)
    public void deleteFront() {
        if (head != null) {
            head = head.next;
            size--;
        }
    }
    /**.
     * { function_description }
     *
     * @return     { description_of_the_return_value }
     */
// time complexity is O(N)
    public void deleteBack() {
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
    /**.
     * { function_description }
     *
     * @param      value  The value
     */
// time complexitty is O(1)
    public void insertBack(final int value) {
        if (tail == null) {
            tail = new Node();
            tail.value = value;
            tail.next = null;
            head = tail;
        } else {
            Node oldTail = tail;
            tail = new Node();
            tail.value = value;
            tail.next = null;
            oldTail.next = tail;
        }
        size++;
    }
// time complexitty is O(1)
    /**.
     * { function_description }
     *
     * @param      value  The value
     */
    public void insertFront(final int value) {
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
// time complexity is O(1)
    public void insertAt(int pos, int value) {
        insertAt(head, pos, value);
    }
// time complexitty is O(N)
    public void insertAt(Node head, int pos, int value) {
        if (pos == 0) {
            insertFront(value);
            return;
        }
            if (index + 1 == pos) {
                Node new_node = new Node();
                // Node temp = head;
                new_node.value = value;
                new_node.next = head.next;
                head.next = new_node;
                index = 0;
                return;
            }
            index++;
            insertAt(head.next, pos, value);
    }
    /**.
     * Determines if empty.
     *
     * @return     True if empty, False otherwise.
     */
    public boolean isEmpty() {
        return head == null;
    }
// time complexity is O(1)
    public void reverse() {
        head = reverseRecursive(head);
    }
// time complexity is O(N)
    private Node reverseRecursive(Node head) {
        if(head == null || head.next == null) {
            return head;
        }
        Node temp = reverseRecursive(head.next);
        head.next.next = head;
        head.next = null;
        return temp;
    }
// time complexity is O(1)
    public int size() {
        return size;
    }
    // time complexity is O(N)
    public String displayAll() {
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
}