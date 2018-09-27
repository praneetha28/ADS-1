/**.
 * { item_description }
 */
import java.util.Scanner;
/**.
 * { item_description }
 */
import java.util.Arrays;
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
    public static void main(final String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int[] a = new int[size];
        for (int i = 0; i < size; i++) {
            a[i] = sc.nextInt();
        }
        int start = 0;
        int index = 0;
        int end = size - 1;
        int x = sc.nextInt();
        while (start <= end) {
            int mid = (start + end) / 2;
            if ( x == a[mid]) {
                index = mid;
                end = mid - 1;
            } else if (x < a[mid]) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }
        System.out.println(index);
    }
}
