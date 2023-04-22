package com.menulist;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Set;
import java.util.Scanner;

public class Program extends Menulist {

	public Program(String name, double price, int calories) {
		super(name, price, calories);
		// TODO Auto-generated constructor stub
	}

	public static Menulist[] getArray() {
		Menulist[] arr = new Menulist[5];

		arr[0] = new Menulist("Pavbhaji", 100, 40);
		arr[1] = new Menulist("Pulao", 80, 35);
		arr[2] = new Menulist("ChikenHandi", 250, 60);
		arr[3] = new Menulist("Chiken Biryani", 180, 45);
		arr[4] = new Menulist("Veg bhaji", 120, 50);

		return arr;

	}

	private static void printRecord(Menulist[] arr) {

		for (Menulist elements : arr) {
			System.out.println(elements);
		}
		System.out.println();
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Menulist[] arr = Program.getArray();

		int choice;
		do {
			
			System.out.println("Enter the choice  :");
			System.out.println("1. Print Default Menu  :");
			System.out.println("2. Menu Sort by Name  :");
			System.out.println("3 .Menu sort by price  :");
			choice = sc.nextInt();

			
			//System.out.println(" Menu sort by Categories  :");
                                                                                       

			switch (choice) {

			case 1:
				Comparator<Menulist> menu = new nameComparator();
				Arrays.sort(arr, menu);
				Program.printRecord(arr);
			case 2:
				Comparator<Menulist> menu1 = new PriceComparator();
				Arrays.sort(arr, menu1);
				Program.printRecord(arr);
			}

		} while (choice != 0);

	}

}
