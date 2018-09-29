/**.
 * { item_description }
 */
import java.util.Scanner;
/**.
 * List of linked lists.
 */
class LinkedListStack {
    /**.
     * { var_description }
     */
    private Node head;
    private static int size= 0;
    /**.
     * Class for node.
     */
    private class Node {
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
    LinkedListStack() {
        head = null;
    }
    /**.
     * { function_description }
     *
     * @return     { description_of_the_return_value }
     */
    public char pop() {
        if (head != null) {
            // Node temp = null;
            // Node popped = tail;
            char item = head.value;
            // Node element = head;
            // while (element != tail) {
            //     temp = element;
            //     element = element.next;
            // }
            // tail = temp;
            head.next = null;
            // popped.next = null;
            size--;
            return item;
        }
        return 0;
    }
    /**.
     * { function_description }
     *
     * @param      value  The value
     */
    public void push(final char value) {
        Node oldHead = head;
        head = new Node();
        head.value = value;
        head.next = oldHead;
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
    public char peek() {
        return head.value;
    }
    public static int size() {
        return size;
    }
}