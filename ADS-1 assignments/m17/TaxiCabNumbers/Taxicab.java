/**.
 * Class for taxicab.
 */
class Taxicab implements Comparable<Taxicab> {
    /**.
     * { var_description }
     */
    private final int i;
    /**.
     * { var_description }
     */
    private final int j;
    /**.
     * variable.
     */
    private final long sum;
    /**.
     * @param i1 value
     * @param j1 value
     */
    Taxicab(final int i1, final int j1) {
        this.sum = (long) i1 * i1 * i1 + (long) j1 * j1 * j1;
        this.i = i1;
        this.j = j1;
    }
    /**
     * @return [description]
     */
    public int geti() {
        return this.i;
    }
    /**
     * @return [description]
     */
    public int getj() {
        return this.j;
    }
    /**
     * @return [description]
     */
    public long getsum() {
        return this.sum;
    }
    // compare by i^3 + j^3, breaking ties by i
    /**
     * @param that value
     * @return value
     * Time complexity is O(1)
     */
    public int compareTo(final Taxicab that) {
        if (this.sum < that.sum) {
            return -1;
        } else if (this.sum > that.sum) {
            return 1;
        } else if (this.i < that.i) {
            return -1;
        } else if (this.i > that.i) {
             return 1;
         } else {
            return 0;
        }
    }
    /**
     * @return value
     * Time complexity is O(1)
     */
    public String toString() {
        return sum + " = " + i + "^3 + " + j + "^3";
    }

}
