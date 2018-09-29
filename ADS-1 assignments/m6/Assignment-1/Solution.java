import java.util.Scanner;
import java.util.Iterator;
import java.util.LinkedList;
import java.lang.*;
import java.io.*;
class AddLargeNumbers {
	// static LinkedList link;
	// AddLargeNumbers() {

	// }
    public static LinkedList numberToDigits(String number) {
    	LinkedList link = new LinkedList();
    	int n = number.length();
    	// System.out.println(n);
    	for (int i = 0; i < n; i++) {
    		char c = number.charAt(i);
            link.push(c);
    	}
    	// String str = link.displayAll();
    	return link;
    }

    public static String digitsToNumber(LinkedList list) {

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

    // public static LinkedList addLargeNumbers(LinkedList list1, LinkedList list2) {
    // 	LinkedListStack ll1 = new LinkedListStack();
    // 	LinkedListStack ll2 = new LinkedListStack();
    // 	LinkedList resLink = new LinkedList();
    // 	while (!list1.isEmpty()) {
    // 		ll1.push(list1.pop());
    // 	}
    // 	while (!list2.isEmpty()) {
    // 		ll2.push(list2.pop());
    // 	}

    // }
}

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        String p = sc.nextLine();
        String q = sc.nextLine();
        switch(input){
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
            //     LinkedList result = AddLargeNumbers.addLargeNumbers(pDigits, qDigits);
            //     System.out.println(AddLargeNumbers.digitsToNumber(result));
            //     break;
        }
    }

}
