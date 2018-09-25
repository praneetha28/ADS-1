// public class Percolation {
//    public Percolation(int n)
// create n-by-n grid, with all sites blocked
//    public    void open(int row, int col)
// open site (row, col) if it is not open already
//    public boolean isOpen(int row, int col)
// is site (row, col) open?
//    public boolean isFull(int row, int col)
// is site (row, col) full?
//    public     int numberOfOpenSites()
// number of open sites
//    public boolean percolates()
// does the system percolate?
// }
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
		Percolation p = new Percolation(n);
		while (sc.hasNextLine()) {
			String line = sc.nextLine();
			String[] tokens = line.split(" ");
			p.open(Integer.parseInt(tokens[0]) - 1,
				Integer.parseInt(tokens[1]) - 1);
		}
		System.out.println(p.percolates());
	}
}