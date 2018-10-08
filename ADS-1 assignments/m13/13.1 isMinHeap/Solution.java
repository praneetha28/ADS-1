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
        String type = sc.nextLine();
        int testcases = sc.nextInt();
        sc.nextLine();
        switch(type) {
            case"String":
                for (int i = 0; i < testcases; i++) {
                    String line = sc.nextLine();
                    String[] tokens = line.split(",");
                    PriorityQueue<String> pq = new PriorityQueue<String>(tokens);
                    if (tokens[0].equals("")) {
                        System.out.println("false");
                    } else {
                        System.out.println(pq.isMinHeap(1));
                    }
                }
                break;
            case"Integer":
                for (int i = 0; i < testcases; i++) {
                    String line = sc.nextLine();
                    String[] tokens = line.split(",");
                    Integer[] intArray = new Integer[tokens.length];
                    if (tokens[0].equals("")) {
                        System.out.println("false");
                    } else {
                        for (int j = 0; j < tokens.length; j++) {
                            intArray[j] = Integer.parseInt(tokens[j]);
                        }
                        PriorityQueue<Integer> pq = new PriorityQueue<Integer>(intArray);
                        System.out.println(pq.isMinHeap(1));
                    }
                }
                break;
            case"Float":
                for (int i = 0; i < testcases; i++) {
                    String line = sc.nextLine();
                    String[] tokens = line.split(",");
                    Float[] fltArray = new Float[tokens.length];
                    if (tokens[0].equals("")) {
                        System.out.println("false");
                    } else {
                        for (int j = 0; j < tokens.length; j++) {
                            fltArray[j] = Float.parseFloat(tokens[j]);
                        }
                        PriorityQueue<Float> pq = new PriorityQueue<Float>(fltArray);
                        System.out.println(pq.isMinHeap(1));
                    }
                }
                break;
            case"Double":
                for (int i = 0; i < testcases; i++) {
                    String line = sc.nextLine();
                    String[] tokens = line.split(",");
                    Double[] dbleArray = new Double[tokens.length];
                    if (tokens[0].equals("")) {
                        System.out.println("false");
                    } else {
                        for (int j = 0; j < tokens.length; j++) {
                            dbleArray[j] = Double.parseDouble(tokens[j]);
                        }
                        PriorityQueue<Double> pq = new PriorityQueue<Double>(dbleArray);
                        System.out.println(pq.isMinHeap(1));
                    }
                }
                break;
            default:
            break;
        }
    }
}
