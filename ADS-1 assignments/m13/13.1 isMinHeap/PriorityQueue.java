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
// time complexity for this method is O(log N).
    public boolean isMinHeap() {
        for (int i = 1; i < arr.length; i++) {
            if (2 * i < arr.length && less(2 * i, i)) {
                return false;
            }
            if ((2 * i) + 1 < arr.length && less(2 * i + 1, i)) {
                return false;
            }
        }
        return true;
        // if (k > size) {
        //     return true;
        // }
        // int left = 2 * k;
        // int right = 2 * k + 1;
        // if (left <= size && less(left, k)) {
        //     return false;
        // }
        // if (right <= size && less(right, k)) {
        //     return false;
        // }
        // return isMinHeap(left) && isMinHeap(right);
    }
// time complexity for this method is O(1).
    public boolean less(int a, int b) {
        return arr[a].compareTo(arr[b]) < 0;
    }
}