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
    public boolean isMinHeap() {
        for (int i = 1; i < arr.length; i++) {
            if (2 * i < arr.length && less(2 * i, i)) {
                return true;
            }
            if ((2 * i) + 1 < arr.length && less(2 * i + 1, i)) {
                return true;
            }
        }
        return false;
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
    public boolean less(int a, int b) {
        return arr[a].compareTo(arr[b]) < 0;
    }
}