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
        LinkedList ll = new LinkedList();
        Scanner sc = new Scanner(System.in);
        while (sc.hasNextLine()) {
            String line = sc.nextLine();
            String[] tokens = line.split(" ");
            switch (tokens[0]) {
                case "insertAt":
                    ll.insertAt(Integer.parseInt(tokens[1]), Integer.parseInt(tokens[2]));
                    System.out.println(ll.displayAll());
                    break;
                case "reverse":
                    if (!ll.isEmpty()) {
                        ll.reverse();
                        System.out.println(ll.displayAll());
                    } else {
                        System.out.println("No elements to reverse.");
                    }
                    break;
            }
        }
    }
}