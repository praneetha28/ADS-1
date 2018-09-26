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
        Arrays.sort(a);
        int count = 1;
        int tot = 0;
        int initial = a[0];
        for (int i = 0; i < size - 1; i++) {
            if(initial == a[i]) {
                count++;
            }
            else {
                tot+= count*(count - 1)/2;
                initial = a[i];
                count = 1;
            }
        }
        tot = tot + count*(count-1)/2;
        System.out.println("No of pairs "+tot);
    }
}