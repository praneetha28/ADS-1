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
        BinarySearch bs = new BinarySearch();
        // MinPQ minpq = new MinPQ();
        // MaxPQ maxpq = new MaxPQ();
        int hours = 6;
        int n = sc.nextInt();
        sc.nextLine();
        MinPQ min = new MinPQ();
        MaxPQ max = new MaxPQ();
        for (int i = 0; i < hours; i++) {
            for (int j = 0; j < n; j++) {
                String input = sc.nextLine();
                String[] tokens = input.split(",");
                min.insert(new Stock(tokens[0], Float.parseFloat(tokens[1])));
                max.insert(new Stock(tokens[0], Float.parseFloat(tokens[1])));
            }
            MinPQ minpq = new MinPQ();
            MaxPQ maxpq = new MaxPQ();
            for (int k = 0; k < 5; k++) {
                minpq.insert(min.delMin());
            }
            for (int l = 0; l < 5; l++) {
                maxpq.insert(max.delMax());
            }
            // System.out.println("max...");
            System.out.println(maxpq.toString());
            System.out.println();
            // System.out.println("min....");
            System.out.println(minpq.toString());
            System.out.println();
        }
    }
}
