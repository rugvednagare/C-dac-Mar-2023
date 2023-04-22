package org.example;
import java.util.Set;
import java.util.HashSet;
import java.util.Collection;
import java.util.ArrayList;
import java.util.LinkedHashSet;

public class SetTrail {

	public static void main(String[] args) {
		
		
		Set<Double> set = new HashSet<>();
		
		set.add(20.0);
		set.add(30.20);
		set.add(50.10);
		System.out.println(set);
		boolean b1 =set.contains(30.10);
		System.out.println(b1);
		
		boolean b2 = set.contains(100);
		System.out.println(b2);
		
		Set <String> str = new LinkedHashSet<>();
		str.add("Rugved");
		str.add("Srushti");
		str.add(" marathi");
		System.out.println(str.toString());
		
		Collection <String> col = new ArrayList<>();
		col.add("Dnyanada");
		col.add("Arjun");
		
		str.addAll(col);
		System.out.println(col);
		
		boolean b = col.isEmpty();
		boolean b3 = str.isEmpty();
		System.out.println(b +" "+b3+" "+ str.size());
		

	}

}
