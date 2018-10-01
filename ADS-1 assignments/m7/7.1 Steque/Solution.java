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
    public static void main(final String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        for (int i = 0; i < n; i++) {
            Steque stq = new Steque();
            while (sc.hasNextLine()) {
                String line = sc.nextLine();
                String[] tokens = line.split(" ");
                switch (tokens[0]) {
                    case "push":
                        stq.push(Integer.parseInt(tokens[1]));
                        System.out.println(stq.display());
                        break;
                    case "pop":
                        stq.pop();
                        if (stq.isEmpty()) {
                            System.out.println("Steque is empty.");
                        } else {
                            System.out.println(stq.display());
                        }
                        break;
                    case "enqueue":
                        stq.enqueue(Integer.parseInt(tokens[1]));
                        System.out.println(stq.display());
                        break;
                    default:
                        break;
                }
                if (tokens[0].equals("")) {
                    System.out.println();
                    break;
                }
            }
        }
    }
}