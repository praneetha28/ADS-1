/**.
 * Class for stock.
 */
class Stock {
    /**.
     * { var_description }
     */
    private String name;
    /**.
     * { var_description }
     */
    private Float value;
    /**.
     * Constructs the object.
     *
     * @param      nme   The name
     * @param      vlue  The value
     */
    Stock(final String nme, final Float vlue) {
        this.name = nme;
        this.value = vlue;
    }
    /**.
     * Gets the name.
     *
     * @return     The name.
     */
    public String getName() {
        return this.name;
    }
    /**.
     * Gets the value.
     *
     * @return     The value.
     */
    public Float getValue() {
        return this.value;
    }
    /**.
     * { function_description }
     *
     * @param      that  The that
     *
     * @return     { description_of_the_return_value }
     */
    public int compareTo(final Stock that) {
        if (this.getValue() > that.getValue()) {
            return 1;
        } else if (this.getValue() < that.getValue()) {
            return -1;
        } else if (this.getName().compareTo(that.getName()) > 0) {
            return 1;
        } else if (this.getName().compareTo(that.getName()) < 0) {
            return -1;
        } else {
            return 0;
        }
    }
    /**.
     * Returns a string representation of the object.
     *
     * @return     String representation of the object.
     */
    public String toString() {
        return this.getName() + " " + this.getValue();
    }
}
