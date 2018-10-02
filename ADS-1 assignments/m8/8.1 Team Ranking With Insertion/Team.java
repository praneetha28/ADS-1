class Team {
	String name;
	int wins;
	int loses;
	int draws;
	Team(String nme, int win, int loose, int draw) {
		this.name = nme;
		this.wins = win;
		this.loses = loose;
		this.draws = draw;
	}
	public String getName() {
		return this.name;
	}
	public int getWins() {
		return this.wins;
	}
	public int getLoses() {
		return this.loses;
	}
	public int getDraws() {
		return this.draws;
	}
// time complexity of this method is O(1) as it checks one time.
	public int compareTo(Team that) {
	    if (this.getWins() > that.getWins()) {
	        return 1;
	    } else if (this.getWins() < that.getWins()) {
	        return -1;
	    } else {
	    	if (this.getLoses() > that.getLoses()) {
		        return -1;
		    } else if (this.getLoses() < that.getLoses()) {
		        return 1;
		    } else {
		    	if (this.getDraws() > that.getDraws()) {
			        return 1;
			    } else if (this.getDraws() < that.getDraws()) {
				    return -1;
				} else {
					return 0;
				}
		    }
	    }
	}
}