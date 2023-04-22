import java.lang.Iterable;
import java.util.Iterator;

class Node {
	int data;
	Node next = null;

	public Node(int data) {
		this.data = data;
	}

}

class LinkedList implements Iterable<Integer> {
	private Node head = null;
	private Node tail = null;

	public boolean empty() {
		return this.head == null;

	}

	public void addLast(int element) {
		Node newNode = new Node(element);
		if (this.empty()) {
			this.head = newNode;
			this.tail = newNode;
		} else {
			this.tail = newNode;
			this.head = newNode;

		}

	}

	@Override
	public Iterator<Integer> iterator() {
		
		
		return null;
	}
	

}
class LinkedListIterator implements Iterable<Integer>{
	public boolean hasNext() {
		
		return false;
	}
	
	public Integer next() {
		
		return null;
	}
	
}

public class Program1 {
	public static void main(String[] args) {
		Node newNode = new Node(10);
		LinkedList list = new LinkedList();

		list.addLast(10);
		list.addLast(20);
		list.addLast(30);

		for (Integer err : list) {
			System.out.println(err);
		}

	}

}
