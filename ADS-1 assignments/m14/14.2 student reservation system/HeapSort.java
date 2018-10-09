import java.util.Arrays;
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
	// time complexity of this method is O(N log N). It access the array elements twice
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
    // time complexity of this method is O(log N). It access the array elements twice
    public void sink(Student[] students, int k, int n) {
        while (2*k <= n) {
            int j = 2*k;
            if (j < n && less(students, j, j+1))  {
            	j++;
            }
            if (!less(students, k, j)) {
            	break;
            }
            swap(students, k, j);
            k = j;
        }
    }
    // time complexity of this method is O(1).
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
			str += students[i].getName() + "," + students[i].getTotal() +
			 "," + students[i].getCategory() + "\n";
		}
		return str;
	}
	// time complexity of this method is O(N). It iterates through the array to
	public boolean contains(int[] arr, int s) {
		for (int i : arr) {
			if (s == i) {
				return true;
			}
		}
		return false;
	}
	/**.
	 * { function_description }
	 *
	 * @param      n     { parameter_description }
	 */
	// time complexity of this method is O(N). It iterates through the array to
// print all the objects in array.
	public void vacancy1(int n) {
		for (int i = 0; i < n; i++) {
			System.out.println(students[i].getName() + "," + students[i].getTotal() +
			 "," + students[i].getCategory());
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
	public void vacancy2(int n, int n1, int n2, int n3) {
		int[] array = new int[n1 + n2 + n3];
       	int i = 0;
        for(int k = n;k < size; k++) {
            if(students[k].getCategory().equals("BC") && n1 > 0) {
                array[i++] = k;
                n1--;
            }
            else if(students[k].getCategory().equals("SC") && n2 > 0) {
                array[i++] = k;
                n2--;
            }
            else if(students[k].getCategory().equals("ST") && n3 > 0) {
                array[i++] = k;
                n3--;
            }
        }
        if (n1 > 0) {
           for (int k = n; k < size; k++) {
           if (students[k].getCategory().equals("Open") && n1 > 0) {
                   if (!contains(array, k)) {
                       array[i++] = k;
                       n1--;
                   }
               }
           }
       }
       if (n2 > 0) {
           for (int k = n; k < size; k++) {
           if (students[k].getCategory().equals("Open") && n2 > 0) {
                   if (!contains(array, k)) {
                       array[i++] = k;
                       n2--;
                   }
               }
           }
       }
       if (n3 > 0) {
           for (int k = n; k < size; k++) {
           if (students[k].getCategory().equals("Open") && n3 > 0) {
                   if (!contains(array, k)) {
                       array[i++] = k;
                       n3--;
                   }
               }
           }
       }
       Arrays.sort(array);
       for (int k = 0; k < array.length; k++) {
           System.out.println(students[array[k]].print());
       }
	}
}

