class Sorting {
	Student[] students;
	int size;

	Sorting() {
		students = new Student[30];
		this.size = 0;
	}
	public void add(Student s) {
		students[size++] = s;
	}
	public int size() {
		return size;
	}
	/**.
	 * { function_description }
	 */
	public void insertion() {
		for (int i = 0;i < size; i++) {
    		for (int j = i; j > 0 && students[j].compareTo(students[j-1]) > -1; j--) {
             	swap(students, j, j-1);
    		}
		}
	}
// time complexity of this method is O(1). It swaps the elements only once.

	/**
	 * { function_description }
	 *
	 * @param      students  The students
	 * @param      j     { parameter_description }
	 * @param      min   The minimum
	 */
	public void swap(Student[] students, int j, int min) {
		Student temp = students[min];
	    students[min] = students[j];
	    students[j] = temp;
	}
// time complexity of this method is O(N). It iterates through the array to
// print all the objects in array.
	/**.
	@return     String representation of the object.
	*/
	public String toString() {
		// System.out.println("in print");
		String str = "";
		for (int i = 0; i < size; i++) {
			str += students[i].getName() + "," + students[i].getTotal() + "," + students[i].getCategory() + "\n";
		}
		return str;
	}
	public void vacancy1(int n) {
		String str = "";
		for (int i = 0; i < n; i++) {
			System.out.println(students[i].getName() + "," + students[i].getTotal() + "," + students[i].getCategory());
		}
	}
	public void vacancy2(int n, int n1) {
		// System.out.println("in bc");
		String str = "";
		String s = "BC";
		int count = 0;
		for (int i = n; i < size; i++) {
			// System.out.println("in for");
			if (n1 == 0) {
				break;
			} else {
				if (students[i].getCategory().equals(s)) {
					System.out.println(students[i].getName() + "," + students[i].getTotal() + "," + students[i].getCategory());
					n1--;
				}
			}
		}
		if (n1 != 0) {
			int c = n1;
			for (int i = n; i < size; i++) {
				if (c == 0) {
					break;
				} else {
					System.out.println(students[i].getName() + "," + students[i].getTotal() + "," + students[i].getCategory());
					c--;
				}
			}
		}
	}
	public void vacancy3(int n, int n1) {
		// System.out.println("in sc");
		String s = "ST";
		for (int i = n; i < size; i++) {
			// System.out.println("in for");
			if (n1 == 0) {
				// System.out.println("in count");
				break;
			} else {
				if (students[i].getCategory().equals(s)) {
					// System.out.println("in if2");
					System.out.println(students[i].getName() + "," + students[i].getTotal() + "," + students[i].getCategory());
					n1--;
				}
			}
		}
		if (n1 != 0) {
			int c = n1;
			for (int i = n; i < size; i++) {
				if (c == 0) {
					break;
				} else {
					System.out.println(students[i].getName() + "," + students[i].getTotal() + "," + students[i].getCategory());
					c--;
				}
			}
		}
	}
	public void vacancy4(int n, int n1) {
		// System.out.println("st");
		String s = "SC";
		int count = 0;
		for (int i =  n; i < size; i++) {
			// System.out.println("for");
			if (n1 == 0) {
				// System.out.println("in count");
				break;
			} else {
				if (students[i].getCategory().equals(s)) {
					System.out.println(students[i].getName() + "," + students[i].getTotal() + "," + students[i].getCategory());
					n1--;
				}
			}
		}
		if (n1 != 0) {
			int c = n1;
			for (int i = n; i < size; i++) {
				if (c == 0) {
					break;
				} else {
					System.out.println(students[i].getName() + "," + students[i].getTotal() + "," + students[i].getCategory());
					c--;
				}
			}
		}
	}
}