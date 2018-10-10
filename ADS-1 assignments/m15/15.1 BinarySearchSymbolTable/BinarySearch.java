import java.util.Arrays;
class BinarySearch<Key extends Comparable<Key>, Value> {
	private Key[] keys;
	private Value[] values;
	private int size = 0;

	BinarySearch() {
		keys = (Key[]) new Comparable[30];
		values = (Value[]) new Object[30];
	}
	// time complexity is O(N).
	public void put(Key k, Value v) {
		if (k == null) {
			System.out.println("key is null");
			return;
		}
		if (v == null) {
			delete(k);
			return;
		}
		int index = rank(k);
		if (index < size && keys[index].compareTo(k) == 0) {
			values[index] = v;
			return;
		}
		for (int i = size; i > index; i--) {
			keys[i] = keys[i - 1];
			values[i] = values[i - 1];
		}
		keys[index] = k;
		values[index] = v;
		size++;
	}
	// time complexity is O(log N).
	public boolean contains(Key k) {
    	return get(k) != null;
    }
    // time complexity is O(log N).
    public Value get(Key k) {
    	if (isEmpty()) {
    		return null;
    	}
    	int index = rank(k);
		if (index < size && keys[index].compareTo(k) == 0) {
			return values[index];
		}
		return null;
    }
    // time complexity is O(1).
    public Key max() {
    	return keys[size - 1];
    }
    	// time complexity is O(1).
    public Key min() {
    	return keys[0];
    }
    	// time complexity is O(log N).
    public Key floor(Key k) {
    	if (k == null) {
        	System.out.println("null");
        }
    	int index = rank(k);
		if (index < size && k.compareTo(keys[index]) == 0) {
			return keys[index];
		}
		if (index == 0) {
			return null;
		} else {
			return keys[index - 1];
		}
    }
    	// time complexity is O(log N).
	public int rank(Key k) {
		if (k == null) {
			System.out.println("null");
		}
		int low = 0;
		int high = size - 1;
		while (low <= high) {
			int mid = low + (high - low) / 2;
			int index = k.compareTo(keys[mid]);
			if (index < 0) {
				high = mid - 1;
			} else if (index > 0) {
				low = mid + 1;
			} else {
				return mid;
			}
		}
		return low;
	}
	// time complexity is O(N).
	public void delete(Key k) {
		if (k == null) {
			return;
		}
		int index = rank(k);
		if (index == size || keys[index].compareTo(k) != 0) {
			return;
		}
		for (int i = index; i < size - 1; i++) {
			keys[i] = keys[i + 1];
			values[i] = values[i + 1];
		}
		size--;
		keys[size] = null;
		values[size] = null;
	}
	public void deleteMin() {
		delete(min());
	// 	if (contains(key)) {
	// 		return true;
	// 	}
	// 	return false;
	 }
	public boolean isEmpty() {
        return size() == 0;
    }
    public int size() {
    	return size;
    }
    public String keys() {
    	String str = "";
    	int i =0;
    	for (i = 0; i < size - 1; i++) {
    		if (keys[i] != null) {
    			str += keys[i] + " " + values[i] + "\n";
    		}
    	}
    	str += keys[size - 1] + " " + values[size - 1];
    	return str;
    }
}