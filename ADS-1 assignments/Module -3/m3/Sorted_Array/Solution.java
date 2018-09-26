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
        // System.out.println("kdvn");
        // int[] a = {10,15,22,80};
        // int[] b = {5,8,11,15,70,90};
        int size = sc.nextInt();
        int size1 = sc.nextInt();
        int[] a = new int[size];
        int[] b = new int[size1];

        int[] c = new int[size + size1];
        for (int n = 0; n < size; n++) {
            a[n] = sc.nextInt();
        }
        for (int n = 0; n < size1; n++) {
            b[n] = sc.nextInt();
        }
        int i = 0;
        int j = 0;
        int k = 0;
        while (i<size && j <size1)
        {
            if (a[i] < b[j])
                c[k++] = a[i++];
            else
                c[k++] = b[j++];
        }
        while (i < size) {
            c[k++] = a[i++];
        }
        while (j < size1) {
            c[k++] = b[j++];
        }
        for (int n = 0; n < c.length - 1 ; n++) {
            System.out.print(c[n] + ",");
        }
        System.out.println(c[c.length - 1]);
    }
}