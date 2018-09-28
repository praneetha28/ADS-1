/**.
 * { item_description }
 */
import java.util.Scanner;
/**.
 * List of linked lists.
 */
class Dequeue {
	LinkedList dequeue;
	int size;
	Dequeue() {
		dequeue = new LinkedList();
		size = 0;
	}
	public void addFirst(int item) {
		// System.out.println("in dequeue");
		dequeue.insertFront(item);
	}
	public void addLast(int item) {
		dequeue.insertBack(item);
	}
	public void deleteFirst() {
		dequeue.deleteFront();
	}
	public void deleteLast() {
		dequeue.deleteBack();
	}
	public boolean isEmpty() {
		return dequeue.isEmpty();
	}
	public int size() {
		return dequeue.size();
	}
	public String display() {
		return dequeue.displayAll();
	}
}