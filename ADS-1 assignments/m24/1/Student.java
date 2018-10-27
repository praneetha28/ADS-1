/**.
 * Class for student.
 */
class Student {
	/**.
	 * { var_description }
	 */
	private String sname;
	/**.
	 * { var_description }
	 */
	private double marks;
	/**.
	 * Constructs the object.
	 *
	 * @param      name  The name
	 * @param      m     { parameter_description }
	 */
	Student(final String name, final double m) {
		this.sname = name;
		this.marks = m;
	}
	/**.
	 * Gets the name.
	 *
	 * @return     The name.
	 */
	public String getName() {
		return this.sname;
	}
	/**.
	 * Gets the marks.
	 *
	 * @return     The marks.
	 */
	public double getMarks() {
		return this.marks;
	}
	/**.
	 * Returns a string representation of the object.
	 *
	 * @return     String representation of the object.
	 */
	public String toString() {
		return this.getName() + "," + this.getMarks();
	}
}