/**.
 * { item_description }
 */
import java.util.Scanner;
/**.
 * { item_description }
 */
public final class pairStar {
    /**.
     * Constructs the object.
     */
    private pairStar() {

    }
    /**.
     * { function_description }
     *
     * @param      args  The arguments
     */
    public static void main(final String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        System.out.println(pairStar(str));
    }
    public static String pairStar(String str) {
        if (str.length() <= 1) {
            return str;
        }
        if (str.charAt(0) == str.charAt(1)) {
            return str.charAt(0) + "*" + pairStar(str.substring(1));
        }
        return str.charAt(0) + pairStar(str.substring(1));
    }
}
