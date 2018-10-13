/**.
 * Class for stock.
 */
class Stock {
	/**.
	 * { var_description }
	 */
	String name;
	/**.
	 * { var_description }
	 */
	Float value;
	/**.
	 * Constructs the object.
	 *
	 * @param      name   The name
	 * @param      value  The value
	 */
	Stock(final String name, final Float value) {
		this.name = name;
		this.value = value;
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