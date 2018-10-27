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
        int n =  sc.nextInt();
        BinarySearchTree bst = new BinarySearchTree();
        sc.nextLine();
        for (int i = 0; i < n; i++) {
            String line = sc.nextLine();
            String[] tokens = line.split(",");
            bst.put(new Student(Integer.parseInt(tokens[0]), tokens[1]), Double.parseDouble(tokens[2]));
        }
        int t = sc.nextInt();
        sc.nextLine();
        for (int i = 0; i < t; i++) {
            String line = sc.nextLine();
            String[] tokens = line.split(" ");
            if (tokens[0].equals("BE")) {
                bst.between(Double.parseDouble(tokens[1]), Double.parseDouble(tokens[2]));
            } else if (tokens[0].equals("LE")) {
                bst.less(Double.parseDouble(tokens[1]));
            } else {
                bst.greater(Double.parseDouble(tokens[1]));
            }
        }
    }
}
