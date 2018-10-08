/**.
 * { item_description }
 */
import java.util.Arrays;
class PriorityQueue<E extends Comparable<E>> {
	private E[] arr;
    int size;
	PriorityQueue(final E[] array) {
        this.arr = array;
        size = 0;
	}
// time complexity for this method is O(N^2).
// In first for loop and second loop it iterates through the size of array
	// public boolean insert(E[] arr) {
	// 	for (int i = 0; i < arr.length; i++) {
 //            add(arr[i]);
 //        }
	// }
    public void add(E k) {
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
        int left = 2 * k;
        int right = 2 * k + 1;
        if (left <= size && greater(k, left)) {
            return false;
        }
        if (right <= size && greater(k, right)) {
            return false;
        }
        return isMinHeap(left) && isMinHeap(right);
    }
    public boolean greater(int a, int b) {
        return arr[a].compareTo(arr[b]) < 0;
    }
}