import java.util.Scanner;
public final class Solution {
	private Solution() {

	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Sorting sort = new Sorting();
		int i = 0;
		while(i < 7) {
			String line = sc.nextLine();
			String[] tokens = line.split(",");
			Team team = new Team(tokens[0], Integer.parseInt(tokens[1]),
			 Integer.parseInt(tokens[2]), Integer.parseInt(tokens[3]));
			// System.out.println(tokens[0]);
			// System.out.println(Integer.parseInt(tokens[1]));
			sort.add(team);
			i++;
		}
		// System.out.println("sort");
		sort.selection();
		// System.out.println("print");
		System.out.println(sort.toString());
	}
}