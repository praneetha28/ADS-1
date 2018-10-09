class HeapSort {
	/**.
	 * { var_description }
	 */
	Student[] students;
	/**.
	 * { var_description }
	 */
	int size;
	/**.
	 * Constructs the object.
	 */
	HeapSort() {
		students = new Student[40];
		this.size = 0;
	}
	/**.
	 * { function_description }
	 *
	 * @param      s     { parameter_description }
	 */
	public void add(Student s) {
		students[size++] = s;
	}
	/**.
	 * { function_description }
	 *
	 * @return     { description_of_the_return_value }
	 */
	public int size() {
		return size;
	}
	/**.
	 * { function_description }
	 */
	// time complexity of this method is O(N^2). It access the array elements twice
	public void sort() {
        int n = size;
        for (int k = n/2; k >= 1; k--) {
            sink(students, k, n);
        }
        while (n > 1) {
            swap(students, 1, n--);
            sink(students, 1, n);
        }
    }

    public void sink(Student[] students, int k, int n) {
        while (2*k <= n) {
            int j = 2*k;
            if (j < n && less(students, j, j+1)) j++;
            if (!less(students, k, j)) break;
            swap(students, k, j);
            k = j;
        }
    }
    public boolean less(Student[] students, int i, int j) {
        return students[i - 1].compareTo(students[j-1]) >= 0;
    }
// time complexity of this method is O(1). It swaps the elements only once.
	/**.
	 * { function_description }
	 *
	 * @param      students  The students
	 * @param      j     { parameter_description }
	 * @param      min   The minimum
	 */
	public void swap(Student[] students, int j, int min) {
		Student temp = students[j - 1];
	    students[j - 1] = students[min - 1];
	    students[min - 1] = temp;
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
	/**.
	 * { function_description }
	 *
	 * @param      n     { parameter_description }
	 */
	// time complexity of this method is O(N). It iterates through the array to
// print all the objects in array.
	public void vacancy1(int n) {
		String str = "";
		for (int i = 0; i < n; i++) {
			System.out.println(students[i].getName() + "," + students[i].getTotal() + "," + students[i].getCategory());
		}
	}
	/**.
	 * { function_description }
	 *
	 * @param      n     { parameter_description }
	 * @param      n1    The n 1
	 */
	// time complexity of this method is O(N). It iterates through the array to
// print all the objects in array.
	public void vacancy2(int n, int n1) {
		// System.out.println("in bc");
		String str = "";
		String s = "BC";
		int count = 0;
		for (int i = n; i < size; i++) {
			// System.out.println("in for");
				if (students[i].getCategory().equals(s) && n1 > 0) {
					System.out.println(students[i].getName() + "," + students[i].getTotal() + "," + students[i].getCategory());
					n1--;
				}
			}
		if (n1 != 0) {
			for (int i = n; i < size; i++) {
					if (students[i].getCategory().equals("Open") && n1 > 0) {
						System.out.println(students[i].getName() + "," + students[i].getTotal() + "," + students[i].getCategory());
						n1--;
					}
			}
		}
	}
	/**.
	 * { function_description }
	 *
	 * @param      n     { parameter_description }
	 * @param      n1    The n 1
	 */
	// time complexity of this method is O(N). It iterates through the array to
// print all the objects in array.
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
					if (students[i].getCategory().equals("Open")) {
						System.out.println(students[i].getName() + "," + students[i].getTotal() + "," + students[i].getCategory());
						c--;
					}
				}
			}
		}
	}
	/**.
	 * { function_description }
	 *
	 * @param      n     { parameter_description }
	 * @param      n1    The n 1
	 */
	// time complexity of this method is O(N). It iterates through the array to
// print all the objects in array.
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
					if (students[i].getCategory().equals("Open")) {
						System.out.println(students[i].getName() + "," + students[i].getTotal() + "," + students[i].getCategory());
						c--;
					}
				}
			}
		}
	}
}

