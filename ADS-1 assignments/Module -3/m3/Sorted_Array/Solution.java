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
        int size1 = sc.nextInt();
        int[] a = new int[size];
        int[] b = new int[size1];
        int[] c = new int[size + size1];
        String line = sc.next();
        String[] tokens = line.split(",");
        for (int n = 0; n < size; n++) {
            a[n] = Integer.parseInt(tokens[n]);
        }
        String line1 = sc.next();
        String[] tokens1 = line1.split(",");
        for (int n = 0; n < size1; n++) {
            b[n] = Integer.parseInt(tokens1[n]);
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