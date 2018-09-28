/**.
 * { item_description }
 */
import java.util.Scanner;
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
        int num = sc.nextInt();
        sc.nextLine();
        while(sc.hasNextLine()) {
            String line = sc.nextLine();
            String[] tokens = line.split(" ");
            // System.out.println(tokens[0]);
            // System.out.println(tokens[1]);
            int m = Integer.parseInt(tokens[0]);
            // System.out.println(m);
            int n = Integer.parseInt(tokens[1]);
            // System.out.println(n);
            LinkedList deque = new LinkedList();
            for (int j = 0; j < m; j++) {
                // System.out.println("for loop");
                deque.insertLast(j);
            }
            while (!deque.isEmpty()) {
                // System.out.println("while");
                for (int k = 0; k < n-1; k++) {
                    deque.insertLast(deque.deleteFront());
                }
                System.out.print(deque.deleteFront() + " ");
            }
            System.out.println();
        }
    }
}