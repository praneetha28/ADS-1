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
    public void insertAt(final int pos, final int value) {
        // System.out.println("..");
        Node new_node = new Node();
        if (pos == 0) {
            insertFront(value);
        } else {
            Node temp = head;
            for (int i= 1; i < pos - 1; i++) {
                temp = temp.next;
            }
            new_node.value = value;
            new_node.next = temp.next;
            temp.next = new_node;
        }

    }
    /**.
     * Determines if empty.
     *
     * @return     True if empty, False otherwise.
     */
    public boolean isEmpty() {
        return head == null;
    }
    public void reverse() {
        head = reverseRecursive(head);
    }
    private Node reverseRecursive(Node head) {
        if(head==null || head.next == null)
            return head;
        Node temp = reverseRecursive(head.next);
        head.next.next = head;
        head.next = null;
        return temp;
    }
    public int size() {
        return size;
    }
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