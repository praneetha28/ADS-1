/**
 * Class for student.
 */
class Student {
	/**.
	 * { var_description }
	 */
	String name;
	String date;
	int marks1;
	int marks2;
	int marks3;
	int total;
	String category;
	/**.
	 * Constructs the object.
	 *
	 * @param      nme      The nme
	 * @param      dte      The dte
	 * @param      m1       The m 1
	 * @param      m2       The m 2
	 * @param      m3       The m 3
	 * @param      tot      The total
	 * @param      categry  The categry
	 */
	Student(String nme, String dte, int m1, int m2, int m3, int tot, String categry) {
		this.name = nme;
		this.date = dte;
		this.marks1 = m1;
		this.marks2 = m2;
		this.marks3 = m3;
		this.total = tot;
		this.category = categry;
	}
	/**.
	 * Gets the name.
	 *
	 * @return     The name.
	 */
	public String getName() {
		return this.name;
	}
	/**.
	 * Gets the date.
	 *
	 * @return     The date.
	 */
	public String getDate() {
		return this.date;
	}
	/**.
	 * Gets the marks 1.
	 *
	 * @return     The marks 1.
	 */
	public int getMarks1() {
		return this.marks1;
	}
	/**.
	 * Gets the marks 2.
	 *
	 * @return     The marks 2.
	 */
	public int getMarks2() {
		return this.marks2;
	}
	/**.
	 * Gets the marks 3.
	 *
	 * @return     The marks 3.
	 */
	public int getMarks3() {
		return this.marks3;
	}
	/**.
	 * Gets the total.
	 *
	 * @return     The total.
	 */
	public int getTotal() {
		return this.total;
	}
	/**.
	 * Gets the category.
	 *
	 * @return     The category.
	 */
	public String getCategory() {
		return this.category;
	}
	// time complexity of this method is O(1) as it checks one time.
	/**
	 * { function_description }
	 *
	 * @param      that  The that
	 *
	 * @return     { description_of_the_return_value }
	 */
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