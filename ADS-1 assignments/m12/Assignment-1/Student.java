class Student {
	String name;
	String date;
	int marks1;
	int marks2;
	int marks3;
	int total;
	String category;
	Student(String nme, String dte, int m1, int m2, int m3, int tot, String categry) {
		this.name = nme;
		this.date = dte;
		this.marks1 = m1;
		this.marks2 = m2;
		this.marks3 = m3;
		this.total = tot;
		this.category = categry;
	}
	public String getName() {
		return this.name;
	}
	public String getDate() {
		return this.date;
	}
	public int getMarks1() {
		return this.marks1;
	}
	public int getMarks2() {
		return this.marks2;
	}
	public int getMarks3() {
		return this.marks3;
	}
	public int getTotal() {
		return this.total;
	}
	public String getCategory() {
		return this.category;
	}
	// time complexity of this method is O(1) as it checks one time.
	public int compareTo(Student that) {
	    if (this.getTotal() > that.getTotal()) {
	        return 1;
	    } else if (this.getTotal() < that.getTotal()) {
	        return -1;
	    } else {
	    	if (this.getMarks3() > that.getMarks3()) {
		        return 1;
		    } else if (this.getMarks3() < that.getMarks3()) {
		        return -1;
		    } else {
		    	if (this.getMarks2() > that.getMarks2()) {
			        return 1;
			    } else if (this.getMarks2() < that.getMarks2()) {
				    return -1;
				} else {
					if (this.getDate().compareTo(that.getDate()) < 0){
						return -1;
					} else if (this.getDate().compareTo(that.getDate()) > 0) {
						return 1;
					} else {
						return 0;
					}
				}
		    }
	    }
	}
}