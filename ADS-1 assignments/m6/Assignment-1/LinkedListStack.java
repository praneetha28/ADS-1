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
        char value = head.value;
        head = head.next;
        return value;
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
}