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
        private int value;
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
    public int pop() {
        if (head != null) {
            int value = head.value;
            head = head.next;
            return value;
        }
        return 0;
    }
    /**.
     * { function_description }
     *
     * @param      value  The value
     */
    public void push(final int value) {
        if (head == null) {
            Node temp = new Node();
            temp.value = value;
            temp.next = null;
            head = temp;
        } else {
            Node oldHead = head;
            Node temp = new Node();
            temp.value = value;
            temp.next = oldHead;
            head = temp;
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
    /**.
     * { function_description }
     *
     * @return     { description_of_the_return_value }
     */
    public int peek() {
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
    public static void main(final String[] args) {
        Scanner sc = new Scanner(System.in);
        // int n = sc.nextInt();
        // int i = 0;
        LinkedListStack ll = new LinkedListStack();
        String line = sc.nextLine();
        int len = line.length();
        for (int i = 0; i < len; i++) {
            char c = line.charAt(i);
            if (c != '*' && c != '-' && c != '+' && c != '/') {
                int num = Integer.parseInt(c + "");
                // System.out.println(num);
                ll.push(num);
            } else {
                    int n = ll.pop();
                    // System.out.println(n);
                    int n1 = ll.pop();
                    // System.out.println(n1);
                    int res = 0;
                    switch (c) {
                        case '*':
                            res = n * n1;
                            ll.push(res);
                            break;
                        case '+':
                            res = n + n1;
                            ll.push(res);
                            break;
                        case '-':
                            res = n - n1;
                            ll.push(res);
                            break;
                        case '/':
                            res = n / n1;
                            ll.push(res);
                            break;
                    }
            }
        }
        System.out.println(ll.peek());
    }
}
