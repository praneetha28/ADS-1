/**.
 * { item_description }
 */
import java.util.*;
/**.
 * { item_description }
 */
public final class Solution {
    /**.
     * Constructs the object.
     */
    private Solution() {
        /**.
         * { item_description }
         */
    }
    /**.
     * { function_description }
     *
     * @param      args  The arguments
     */
    // time complexity for the main method is N
    // Because there is one while loop.
    // while loop iterates until it has next line i.e N times.
    public static void main(final String[] args) {
        Scanner sc = new Scanner(System.in);
        BinarySearchTree bst = new BinarySearchTree();
        while (sc.hasNext()) {
            String input = sc.nextLine();
            String[] tokens = input.split(",");
            // System.out.println(Arrays.toString(tokens));
            switch (tokens[0]) {
                case"put":
                    bst.put(new Book(tokens[1], tokens[2], Float.parseFloat(tokens[3])), Integer.parseInt(tokens[4]));
                    break;
                case"get":
                    System.out.println(bst.get(new Book(tokens[1], tokens[2], Float.parseFloat(tokens[3]))));
                    break;
                default:
                break;
            }
        }
    }
}
