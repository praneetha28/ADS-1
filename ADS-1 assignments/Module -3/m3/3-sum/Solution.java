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
        int count = 0;
        for (int i = 0; i < size; i++) {
            a[i] = sc.nextInt();
        }
        Arrays.sort(a);
        for (int i = 0; i < size; i++) {
            for (int j = i + 1; j < size; j++) {
                int start = j + 1;
                int end = size - 1;
                while (start <= end) {
                    int mid = (start + end) / 2;
                    if (-(a[i] + a[j]) == a[mid]) {
                        count++;
                    }
                    if (-(a[i] + a[j]) < a[mid]) {
                        end = mid - 1;
                    } else {
                        start = mid + 1;
                    }
                }
            }
        }
        System.out.println(count);
    }
}
