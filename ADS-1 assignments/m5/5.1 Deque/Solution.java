/**.
 * { item_description }
 */
import java.io.BufferedInputStream;
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
        // LinkedList ll = new LinkedList();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();
        Dequeue deck = new Dequeue();
        for (int i = 0; i < n; i++) {
            // read the line
            String line = sc.nextLine();
            // split the line using space
            String[] tokens = line.split(" ");
            // based on the list operation invoke the corresponding method
            switch (tokens[0]) {
                case"pushLeft":
                // System.out.println("hello");
                    deck.addFirst(Integer.parseInt(tokens[1]));
                    System.out.println(deck.display());
                    break;
                case"pushRight":
                    deck.addLast(Integer.parseInt(tokens[1]));
                    System.out.println(deck.display());
                    break;
                case"popLeft":
                    if (!deck.isEmpty()) {
                        deck.deleteFirst();
                        System.out.println(deck.display());
                    } else {
                        System.out.println("Deck is empty");
                    }
                    break;
                case"popRight":
                    if (!deck.isEmpty()) {
                       deck.deleteLast();
                        System.out.println(deck.display());
                    } else {
                        System.out.println("Deck is empty");
                    }

                    break;
                case"size":
                    System.out.println(deck.size());
                    break;
                default:
                    break;
            }
        }
    }
}