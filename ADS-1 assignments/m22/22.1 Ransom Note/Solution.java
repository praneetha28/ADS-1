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
        String line = sc.nextLine();
        String[] tokens = line.split(" ");
        String line1 = sc.nextLine();
        String[] tokens1 = line1.split(" ");
        for (int i = 0; i < tokens1.length; i++) {
            htable.put(tokens1[i], i);
        }
        // htable.display();
        String line2 = sc.nextLine();
        String[] tokens2 = line2.split(" ");
        // int num = 0;
        int c = 0;
        for (int i = 0; i < tokens2.length; i++) {
            // System.out.println("...");
            if (htable.contains(tokens2[i])) {
                for (int j = 0; j < tokens2.length; j++) {
                    if (tokens2[i].equals(tokens2[j])) {
                        c++;
                    } else {
                        c = 0;
                    }
                // htable.delete(tokens2[i]);
                // htable.display();
                }
            }
        }
        if (c != 0) {
            System.out.println("No");
        } else {
            System.out.println("Yes");
        }
    }
}