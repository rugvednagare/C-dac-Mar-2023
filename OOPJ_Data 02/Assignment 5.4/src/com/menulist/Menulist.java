package com.menulist;

public class Menulist {
	String name;
	double price;
	int calories;
	
	public Menulist(String name, double price, int calories) {
		this.name = name;
		this.price = price;
		this.calories = calories;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public int getCalories() {
		return calories;
	}

	public void setCalories(int calories) {

		this.calories = calories;
	}
	
	
	

	@Override
	public String toString() {
		return String.format( "%-20s%-20.2f%-20d",this.name , this.price , this.calories);
	}

	
	
	
	
}
