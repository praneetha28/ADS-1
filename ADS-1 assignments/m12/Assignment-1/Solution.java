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
    // time complexity for the main method is N
    // Because there is one for loop.
    // for loop iterates until N times.
    /**.
     * { function_description }
     *
     * @param      args  The arguments
     */
    public static void main(final String[] args) {
        Scanner sc = new Scanner(System.in);
        Sorting sort = new Sorting();
        int n = sc.nextInt();
        int noOfVacancies = sc.nextInt();
        int vac1 = sc.nextInt();
        int vac2 = sc.nextInt();
        int vac3 = sc.nextInt();
        int vac4 = sc.nextInt();
        sc.nextLine();
        for (int i = 0; i < n; i++) {
            String line = sc.nextLine();
            String[] tokens = line.split(",");
            Student student = new Student(tokens[0], tokens[1],
             Integer.parseInt(tokens[2]), Integer.parseInt(tokens[2 + 1]),
             Integer.parseInt(tokens[2 + 2]), Integer.parseInt(tokens[2 + 2 + 1]),
             tokens[2 + 2 + 2]);
            sort.add(student);
        }
        sort.insertion();
        System.out.println(sort.toString());
        sort.vacancy1(vac1);
        if (vac2 == 0) {
            sort.vacancy3(vac1 + vac2, vac3);
            sort.vacancy4(vac1 + vac2 + vac3, vac4);
        } else {
            sort.vacancy2(vac1, vac2);
            sort.vacancy3(vac1 + vac2, vac3);
            sort.vacancy4(vac1 + vac2 + vac3, vac4);
        }

    }
}
