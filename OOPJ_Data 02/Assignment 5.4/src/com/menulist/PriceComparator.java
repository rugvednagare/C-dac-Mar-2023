package com.menulist;

import java.util.Comparator;

public class PriceComparator implements Comparator<Menulist>{

	@Override
	public int compare(Menulist o1, Menulist o2) {
	
		return (int)(o1.getPrice() - (o2.getPrice()));
	}

	
}
