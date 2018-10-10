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
        String line = sc.nextLine();
        String[] tokens = line.split(" ");
        BinarySearch bs = new BinarySearch();
        for (int i = 0; i < tokens.length; i++) {
            bs.put(tokens[i], i);
        }
        while (sc.hasNext()) {
            String input = sc.nextLine();
            String[] tokens1 = input.split(" ");
            switch (tokens1[0]) {
                case"max":
                    System.out.println(bs.max());
                    break;
                case"floor":
                    System.out.println(bs.floor(tokens1[1]));
                    break;
                case"rank":
                    System.out.println(bs.rank(tokens1[1]));
                    break;
                case"deleteMin":
                    bs.deleteMin();
                    break;
                case"contains":
                    System.out.println(bs.contains(tokens1[1]));
                    break;
                case"keys":
                    System.out.println(bs.keys());
                    break;
                case"get":
                    System.out.println(bs.get(tokens1[1]));
                    break;
                default:
                break;
            }
        }
    }
}
