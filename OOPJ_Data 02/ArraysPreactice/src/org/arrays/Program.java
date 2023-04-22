package org.arrays;

import java.util.List;
import java.util.ArrayList;
import java.util.Collection;


public class Program {
	

public static List<Integer> getList(){
	
	List<Integer>list1 = new ArrayList<Integer>();
	for(int count = 1; count<=10 ; count++)
		list1.add(count *10);
	System.out.println("List :"+list1);
	return list1;
	}


public static void getList1() {
	
	List<Integer> list = new ArrayList <>();
	Integer key = new Integer(50);
	if (list.contains(key)) {
		list.remove(key);
		
		int index = list.indexOf(key);
		list.remove(index);
		
		System.out.println(list);
	}else
	System.out.println("Key  not Found ");
}




public static void getList2() {
	List<Integer> list = Program.getList();
	Collection<Integer> keys = new ArrayList<>();
	keys.add(20);
	keys.add(30);
	keys.add(40);
	if(list.contains(keys)) {
	  list.remove(keys);
	  System.out.println("After remove  : "+list);
	}else 
		System.out.println("Removal keys not found  :");
	
}

	public static void main(String[] args) {
	
		List<Integer> list = new ArrayList<>();
		list.add(10);
		list.add(20);
		list.add(40);
		list.add(50);
		list.add(30);
		
System.out.println(list);
list.sort(null);
System.out.println(list);

Program.getList();
Program.getList1();
Program.getList2();

	}
	
	
}
