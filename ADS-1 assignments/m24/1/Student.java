class Student {
	String sname;
	double marks;
	Student(String name, double m) {
		this.sname = name;
		this.marks = m;
	}
	public String getName() {
		return this.sname;
	}
	public double getMarks() {
		return this.marks;
	}
	public String toString() {
		return this.getName() + "," + this.getMarks();
	}
}