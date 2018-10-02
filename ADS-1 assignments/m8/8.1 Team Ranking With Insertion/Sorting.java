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
	public void selection() {
		// System.out.println("in selection");
		for (int i = 0;i < size; i++) {
			// System.out.println(i);
			int min = i;
    		for (int j = i + 1; j < size; j++) {
    			// System.out.println("in for");
         		if (team[j].compareTo(team[min]) > -1) {
         			// System.out.println("in if");
             		min = j;
	            }
    		}
    		Team temp = team[min];
	        team[min] = team[i];
	        team[i] = temp;
		}
	}
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