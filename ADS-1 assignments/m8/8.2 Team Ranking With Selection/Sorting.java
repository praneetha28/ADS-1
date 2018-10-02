class Sorting {
	// Team teams;
	Team[] team;
	int size;
	Sorting() {
		team = new Team[20];
		this.size = 0;
	}
	public void add(Team t) {
		// System.out.println("in add");
		team[size++] = t;
		// System.out.println(team[size - 1]);
	}
	public int size() {
		return size;
	}
// time complexity for this method is O(N^2).
// In first for loop and second loop it iterates through the size of array
	public void insertion() {
		for (int i = 0;i < size; i++) {
    		for (int j = i; j > 0 && team[j].compareTo(team[j-1]) > -1; j--) {
             	swap(team, j, j-1);
    		}
		}
	}
// time complexity of this method is O(1). It swaps the elements only once.
	public void swap(Team[] team, int j, int min) {
		Team temp = team[min];
	    team[min] = team[j];
	    team[j] = temp;
	}
// time complexity of this method is O(N). It iterates through
// the array to print all the objects in array.
	public String toString() {
		// System.out.println("in print");
		String str = "";
		for (int i = 0; i < size - 1; i++) {
			str += team[i].getName() + ",";
		}
		str += team[size - 1].getName();
		return str;
	}
}