/**.
 * { item_description }
 */
import java.util.Arrays;
class PriorityQueue {
	Comparable[] arr;
    int size;
	PriorityQueue() {
        arr = new Comparable[10];
        size = 0;
	}
// time complexity for this method is O(N^2).
// In first for loop and second loop it iterates through the size of array
	public boolean insert(Comparable[] arr) {
		for (int i = 0; i < arr.length; i++) {
            add(arr[i]);
        }
        if (isMinHeap(1)) {
            return true;
        } else {
            return false;
        }
	}
    public void add(Comparable k) {
        if (size == arr.length - 1) {
            resize();
        }
        arr[++size] = k;
    }
    public void resize() {
        arr = Arrays.copyOf(arr, arr.length * 2);
    }
    public boolean isMinHeap(int k) {
        if (k > size) {
            return true;
        }
        if (2 * k <= size && less(2 * k + 1, k - 1)) {
            return false;
        }
        if (2 * k <= size && less(2 * k + 2, k - 1)) {
            return false;
        }
        return isMinHeap(2 * k) && isMinHeap(2 * k);
    }
    public boolean less(int a, int b) {
        return arr[a].compareTo(arr[b]) < 0;
    }
}