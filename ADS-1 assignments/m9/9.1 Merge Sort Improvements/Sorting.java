class Sorting {
	// Comparable[] arr;
	Sorting() {

	}
// time complexity for this method is O(N^2).
// In first for loop and second loop it iterates through the size of array
	public void insertion(Comparable[] arr, int low, int high) {
		// int i = low;
		// int j = high;
		for (int i = low; i <= high; i++) {
    		for (int j = i; j > low && less(arr[j], arr[j - 1]); j--) {
             	swap(arr, j, j-1);
    		}
		}
	}
// time complexity of this method is O(1). It swaps the elements only once.
	public void swap(Comparable[] arr, int j, int min) {
		Comparable temp = arr[j];
	    arr[j] = arr[min];
	    arr[min] = temp;
	}
// time complexity of this method is O(N). It iterates through
// the array to print all the objects in array.
	public String toString(Comparable[] arr) {
		// System.out.println("in print");
		String str = "[";
		for (int i = 0; i < arr.length - 1; i++) {
			str += arr[i] + ", ";
		}
		str += arr[arr.length - 1] + "]";
		return str;
	}
	public void sort(Comparable[] arr, Comparable[] aux, int low, int high)
    {
        if (high <= low + 7) {
        	insertion(aux, low, high);
        	System.out.println("Insertion sort method invoked...");
        	return;
        }
        int mid = low + (high - low) / 2;
	    sort(aux, arr, low, mid);
	    sort(aux , arr, mid + 1, high);
	    if (!less(arr[mid + 1], arr[mid])) {
            for (int i = low; i <= high; i++) {
                aux[i] = arr[i];
            }
	        System.out.println("Array is already sorted. So, skipped the call to merge...");
	        return;
	    }
	    merge(arr, aux, low, mid, high);
    }
    public void sort(Comparable[] array) {
    	// arr = new Comparable[array.length];
    	Comparable[] aux = array.clone();
    	sort(aux, array, 0, array.length - 1);
    }
    public void merge(Comparable[] arr, Comparable[] aux, int low, int mid, int high) {
    	int i = low;
    	int j = mid + 1;
    	for (int k = low; k <= high; k++) {
    		if (i > mid) {
    			aux[k] = arr[j++];
    		} else if ( j > high) {
    			aux[k] = arr[i++];
    		} else if (less(arr[j], arr[i])) {
    			aux[k] = arr[j++];
    		} else {
    			aux[k] = arr[i++];
    		}
    	}
    }
    public boolean less(Comparable a, Comparable b) {
        return a.compareTo(b) < 0;
    }
}