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
    public LinkedListStack() {
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
/**.
 * { item_description }
 */
public final class Solution {
    /**.
     * Constructs the object.
     */
    private Solution() {

    }
    /**.
     * { function_description }
     *
     * @param      args  The arguments
     */
    public static void main( final String[] args ) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int i = 0;
        while ( i < n) {
            String line = sc.next();
            if (balancedPranthesis(line)) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
            i++;
        }
    }
    /**.
     * { function_description }
     *
     * @param      str   The string
     *
     * @return     { description_of_the_return_value }
     */
    public static boolean balancedPranthesis(final String str) {
        LinkedListStack ll = new LinkedListStack();
        int len = str.length();
        // if (len == 0) {
        //  return true;
        // }
        for ( int i = 0; i < len; i++ ) {
            char c = str.charAt(i);
            if ( c == '(' || c == '[' || c == '{') {
                ll.push(c);
            } else {
                if ( ll.isEmpty()) {
                    return false;
                }
                // char top = stack.peek();
                if ( c == ')' && ll.peek() == '(') {
                    ll.pop();
                } else if (c == ']' && ll.peek() == '[') {
                    ll.pop();
                } else if (c == '}' && ll.peek() == '{') {
                    ll.pop();
                } else {
                    return false;
                }
            }
        }
        if (!ll.isEmpty()) {
            return false;
        } else {
            return true;
        }
    }
}