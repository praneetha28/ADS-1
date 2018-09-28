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
    public int deleteFront() {
        if (head != null) {
            int item = head.value;
            head = head.next;
            // size--;
            return item;
        }
        return tail.value;
    }
    /**.
     * { function_description }
     *
     * @param      value  The value
     */
    public void insertLast(final int value) {
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
        // size++;
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

    // public static void main(String[] args) {
    //     LinkedList ll = new LinkedList();
    //     ll.insertLast(12);
    //     ll.insertLast(13);
    //     System.out.println(ll.tail.value);
    //     System.out.println(ll.head.value);
    //     System.out.println("---------------------------");
    //     ll.deleteFront();
    //     ll.deleteFront();
    //     System.out.println(ll.head.value);
    //     System.out.println(ll.tail.value);
    // }
}