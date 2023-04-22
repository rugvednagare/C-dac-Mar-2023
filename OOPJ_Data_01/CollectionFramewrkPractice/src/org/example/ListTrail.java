package org.example;

import java.util.List;
import java.util.LinkedList;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.Vector;
class ListTrail{

		
	public static void main(String[] args) {
/*
		List <Integer>list = new ArrayList<>();
		list.add(10);
		list.add(30);
		list.add(40);
		list.add(50);
		list.add(35);
	 list.add(2 , 70);
	// list.add("RUgved");         //String cannot resoved in Integer type 
	 
		System.out.println(list);
		list.sort(null);
		System.out.println(list);
*/	
	/*	
		List <Integer> list1 = new LinkedList<>();
		list1.add(40);
		list1.add(30);
		list1.add(50);
		list1.add(10);
	    list1.add(20);
	    list1.add(2 , 100);
	    list1.remove(3);
	    
	System.out.println("List :"+ list1);
	for(Integer elements : list1) {
		System.out.println(elements.toString());
	}
	list1.sort(null);
	System.out.println(list1);
*/
		List<Integer> vector= new Vector<>();
		vector.add(40);
		vector.add(50);
		vector.add(20);
		System.out.println(vector);
		 vector.remove(1);
		 vector.add(0 , 70);
		 List<Double> stack = new Stack<>();
		 
		 Collection<Integer> coll = new ArrayList();
		 coll.add(100);
		 coll.add(200);
		 
		 vector.addAll(coll);
		 boolean b1 = coll.contains(100);
		boolean b2 = vector.containsAll(coll);
		 System.out.println(b1+" "+b2);
		 System.out.println(vector.toString());
		
	
	}
	
}
