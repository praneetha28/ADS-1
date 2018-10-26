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
        HashTable htable = new HashTable();
        int n = sc.nextInt();
        sc.nextLine();
        for (int i = 0; i < n; i++) {
            String line = sc.nextLine();
            String[] tokens = line.split(" ");
            switch(tokens[0]) {
                case"put":
                    htable.put(tokens[1], Integer.parseInt(tokens[2]));
                    break;
                case"get":
                    System.out.println(htable.get(tokens[1]));
                    break;
                case"delete":
                    htable.delete(tokens[1]);
                    break;
                case"display":
                    System.out.println(htable.display());
                    break;
                default:
                    break;
            }
        }
    }
}
