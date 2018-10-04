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
        Sorting sort = new Sorting();
        while (sc.hasNext()) {
            String line = sc.nextLine();
            String[] tokens = line.split(",");
            // int[] arr = new int[tokens.length];
            sort.sort(tokens);
            System.out.println(sort.toString(tokens));
            System.out.println();
        }
    }
}
