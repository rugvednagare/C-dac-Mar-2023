package com.menulist;

import java.util.Comparator;


public class nameComparator implements Comparator <Menulist>{

	@Override
	public int compare(Menulist o1, Menulist o2) {
		   
		return (o1.getName().compareTo (o2.getName()));
		
	}

}
