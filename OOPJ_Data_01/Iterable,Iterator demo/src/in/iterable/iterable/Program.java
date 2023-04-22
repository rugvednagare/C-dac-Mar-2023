package in.iterable.iterable;
import java.util.LinkedList;
import java.util.Iterator;

public class Program {
	
public static void main(String[] args) {
		
	
	LinkedList<Integer> list = new LinkedList<Integer>(); 
	
	list.add(10);
	list.add(20);
	list.add(30);
	list.add(40);
	
//	int element;
//	Iterator <Integer> itr = list.iterator();      //Traversing using Iterator
//	 while(itr.hasNext()) {
//		 element =itr.next();
//	 System.out.println("  "+element );
//	 }
	for(Integer arr :list) {                 //Traversing using for Each Loop
		System.out.println(arr);
		
	}


}

	}

	
