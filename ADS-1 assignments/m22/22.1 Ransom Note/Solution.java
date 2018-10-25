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
            htable.put(tokens1[i], 1);
        }
        String line2 = sc.nextLine();
        String[] tokens2 = line2.split(" ");
        int[] arr = new int[tokens2.length];
        for (int i = 0; i < tokens2.length; i++) {
            if (htable.contains(tokens2[i])) {
                int n = htable.get(tokens2[i]);
                arr[i] = --n;
                htable.put(tokens2[i], n);
            } else {
                System.out.println("No");
                return;
            }
        }
        int c = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < 0) {
                c++;
                break;
            } else {
                c = 0 ;
            }
        }
        if (c == 0) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}