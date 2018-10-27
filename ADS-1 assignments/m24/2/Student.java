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
    private int rollNo;
    /**.
     * Constructs the object.
     *
     * @param      name  The name
     * @param      m     { parameter_description }
     */
    Student(final int roll, final String name) {

        this.rollNo = roll;
        this.sname = name;
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
    public int getRoll() {
        return this.rollNo;
    }
    /**.
     * Returns a string representation of the object.
     *
     * @return     String representation of the object.
     */
    public String toString() {
        return this.getRoll() + "," + this.getName();
    }
    public int compareTo(Student that) {
        if (this.getRoll() > that.getRoll()) {
            return 1;
        } else if (this.getRoll() < that.getRoll()) {
            return -1;
        } else if (this.getName().compareTo(that.getName()) > 0) {
            return 1;
        } else if (this.getName().compareTo(that.getName()) < 0) {
            return -1;
        } else {
            return 0;
        }
    }
}
