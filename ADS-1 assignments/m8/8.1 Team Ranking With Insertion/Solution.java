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
        // int i = 0;
        while (sc.hasNext()) {
            String line = sc.nextLine();
            String[] tokens = line.split(",");
            Team team = new Team(tokens[0], Integer.parseInt(tokens[1]),
             Integer.parseInt(tokens[2]), Integer.parseInt(tokens[2 + 1]));
            // System.out.println(tokens[0]);
            // System.out.println(Integer.parseInt(tokens[1]));
            sort.add(team);
            // i++;
        }
        // System.out.println("sort");
        sort.selection();
        // System.out.println("print");
        System.out.println(sort.toString());
    }
}
