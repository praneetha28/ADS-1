/**.
 * { item_description }
 */
import java.util.Scanner;
/**.
 * { item_description }
 */
import java.util.Iterator;
/**.
 * { item_description }
 */
import java.util.LinkedList;
/**.
 * Class for add large numbers.
 */
class AddLargeNumbers {
	/**.
	 * { function_description }
	 *
	 * @param      number  The number
	 *
	 * @return     { description_of_the_return_value }
	 */
    public static LinkedList numberToDigits(final String number) {
    	LinkedList link = new LinkedList();
    	int n = number.length();
    	// System.out.println(n);
    	for (int i = 0; i < n; i++) {
    		Character c = number.charAt(i);
            link.push(c);
    	}
    	// String str = link.displayAll();
    	return link;
    }
    /**.
     * { function_description }
     *
     * @param      list  The list
     *
     * @return     { description_of_the_return_value }
     */
    public static String digitsToNumber(final LinkedList list) {

    	String str = new String();
            // Node temp = head;
            Iterator it = list.iterator();
			while (it.hasNext()) {
    			str += it.next();
			}
			char[] c = str.toCharArray();
			String s = "";
            for (int i = c.length - 1; i >= 0; i--) {
            	s += c[i];
            }
            return s;
    }
    /**.
     * Adds large numbers.
     *
     * @param      list1  The list 1
     * @param      list2  The list 2
     *
     * @return     { description_of_the_return_value }
     */
    // public static LinkedList addLargeNumbers(final LinkedList list1, final LinkedList list2) {
    // 	LinkedListStack ll1 = new LinkedListStack();
    // 	LinkedListStack ll2 = new LinkedListStack();
    // 	LinkedList resLink = new LinkedList();
    // 	while (!list1.isEmpty()) {
    // 		ll1.push((Character) list1.pop());
    // 		// System.out.println(c);
    // 	}
    // 	while (!list2.isEmpty()) {
    // 		ll2.push((Character) list2.pop());
    // 		// System.out.println(c);
    // 	}

	   //  int carry = 0;
    // 	while(!ll1.isEmpty())
    // 	{
	   //      int sum = ((ll1.pop()-'0') + (ll2.pop()-'0') + carry);
	   //      System.out.println(sum);
	   //      resLink.push(sum%10 + '0');
	   //      carry = sum/10;
    // 	}

	   //  while (!ll2.isEmpty())
	   //  {
	   //      int sum = ((ll2.pop()-'0')+carry);
	   //      System.out.println(sum);
	   //      resLink.push(sum%10 + '0');
	   //      carry = sum/10;
	   //  }
	   //  while (carry != 0)
	   //      resLink.push(carry+'0');

	   //  return resLink;
    // }
}
/**.
 * Class for solution.
 */
public final class Solution {
	/**.
	 * Constructs the object.
	 */
	private Solution() {

	}
	/**.
	 * { function_description }
	 *
	 * @param      args  The arguments
	 */
    public static void main(final String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        String p = sc.nextLine();
        String q = sc.nextLine();
        switch (input) {
            case "numberToDigits":
                LinkedList pDigits = AddLargeNumbers.numberToDigits(p);
                LinkedList qDigits = AddLargeNumbers.numberToDigits(q);
                // System.out.println(pDigits.displayAll());
                System.out.println(AddLargeNumbers.digitsToNumber(pDigits));
                System.out.println(AddLargeNumbers.digitsToNumber(qDigits));
                break;

            // case "addLargeNumbers":
            //     pDigits = AddLargeNumbers.numberToDigits(p);
            //     qDigits = AddLargeNumbers.numberToDigits(q);
            //     LinkedList result = AddLargeNumbers.addLargeNumbers(
            //     pDigits, qDigits);
            //     System.out.println(AddLargeNumbers.digitsToNumber(result));
            //     break;
            default:
            	break;
        }
    }

}
