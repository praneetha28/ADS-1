/**
 * Class for sorting.
 */
class Sorting {

    /**.
     * Constructs the object.
     */
    Sorting() {
        /**.
         * { item_description }
         */
    }
// time complexity for this method is O(N^2).
// In first for loop and second loop it iterates through the size of array
/**.
     * { function_description }
     *
     * @param      arr  The arguments
     * @param      low  The arguments
     * @param      high  The arguments
     */
    public void insertion(final Comparable[] arr, final int low,
     final int high) {
        // int i = low;
        // int j = high;
        for (int i = low; i <= high; i++) {
            for (int j = i; j > low && less(arr[j], arr[j - 1]); j--) {
                swap(arr, j, j - 1);
            }
        }
    }
// time complexity of this method is O(1). It swaps the elements only once.
/**.
     * { function_description }
     *
     * @param      arr  The arguments
     * @param      j  The arguments
     * @param      min  The arguments
     */
    public void swap(final Comparable[] arr, final int j, final int min) {
        Comparable temp = arr[j];
        arr[j] = arr[min];
        arr[min] = temp;
    }
// time complexity of this method is O(N). It iterates through
// the array to print all the objects in array.

    /**.
     * Returns a string representation of the object.
     *
     * @param      arr   The arr
     *
     * @return     String representation of the object.
     */
    public String toString(final Comparable[] arr) {
        // System.out.println("in print");
        String str = "[";
        for (int i = 0; i < arr.length - 1; i++) {
            str += arr[i] + ", ";
        }
        str += arr[arr.length - 1] + "]";
        return str;
    }
// time complexity is O(log N)
/**.
     * { function_description }
     *
     * @param      arr  The arguments
     * @param      low  The arguments
     * @param      high  The arguments
     * @param      cutOff  The arguments
     */
    public void sort(final Comparable[] arr, final int low,
     final int high, final int cutOff) {
        if (high <= low + cutOff - 1) {
            insertion(arr, low, high);
            System.out.println("insertionSort called");
            return;
        }
        int k = partition(arr, low, high);
        System.out.println(toString(arr));
        sort(arr, low, k - 1, cutOff);
        sort(arr, k + 1, high, cutOff);
    }
//time complexity is O(1)

    /**.
     * { function_description }
     *
     * @param      array   The array
     * @param      cutOff  The cut off
     */
    public void sort(final Comparable[] array, final int cutOff) {
        sort(array, 0, array.length - 1, cutOff);
    }
// time complexity is O(N)

    /**.
     * { function_description }
     *
     * @param      arr   The arr
     * @param      low   The low
     * @param      high  The high
     *
     * @return     { description_of_the_return_value }
     */
    public int partition(final Comparable[] arr,
     final int low, final int high) {
        int i = low;
        int j = high + 1;
        while (true) {
            while (less(arr[++i], arr[low])) {
                if (i == high) {
                    break;
                }
            }
            while (less(arr[low], arr[--j])) {
                if (j == low) {
                    break;
                }
            }
            if (i >= j) {
                break;
            }
            swap(arr, i, j);
        }
        swap(arr, low, j);
        // System.out.println(toString(arr));
        return j;
    }
// time complexity is O(1)

    /**.
     * { function_description }
     *
     * @param      a     { parameter_description }
     * @param      b     { parameter_description }
     *
     * @return     { description_of_the_return_value }
     */
    public boolean less(final Comparable a, final Comparable b) {
        return a.compareTo(b) < 0;
    }
}
