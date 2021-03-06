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
            Node element = head;
            while (element != tail) {
                temp = element;
                element = element.next;
            }
            tail = temp;
            tail.next = null;
            // popped.data = null;
            // popped.next = null;
            size--;
        }

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
    /**.
     * Determines if empty.
     *
     * @return     True if empty, False otherwise.
     */
    public boolean isEmpty() {
        return head == null;
    }
    /**.
     * { function_description }
     *
     * @return     { description_of_the_return_value }
     */
    public int peek() {
        return head.value;
    }
    public int size() {
        return size;
    }
    public String displayAll() {
        if (size != 0) {
            String str = "[";
            Node temp = head;
            while (temp != null) {
                str += temp.value + ", ";
                temp = temp.next;
            }
            return str.substring(0, str.length() - 2) + "]";
        }
        return "[]";
    }
}