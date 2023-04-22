package org.example;

import java.util.Scanner;

import ListTest;

public class Program {
	private static Scanner sc = new Scanner(System.in);

	public static Book[] getArray() {

		Book[] arr = new Book[10];
		arr[0] = new Book(1083, "The Alchemist", "Paulo Coelho", "HarperCollins", 901.14f);
		arr[1] = new Book(461, "The Da Vinci Code", "Dan Brown", "Doubleday", 1065.13f);
		arr[2] = new Book(932, "Harry Potter and the Philosopher's Stone", "J.K. Rowling", "Bloomsbury", 819.14f);
		arr[3] = new Book(1159, "The Hunger Games", "Suzanne Collins", "Scholastic Press", 737.15f);
		arr[4] = new Book(691, "The Girl with the Dragon Tattoo", "Stieg Larsson", "Norstedts Förlag", 1229.13f);
		arr[5] = new Book(115, "The Lord of the Rings", "J.R.R. Tolkien", "George Allen & Unwin", 1639.11f);
		arr[6] = new Book(574, "The Catcher in the Rye", "J.D. Salinger", "Little, Brown and Company", 983.14f);
		arr[7] = new Book(230, "The Fault in Our Stars", "John Green", "Dutton Books", 1147.13f);
		arr[8] = new Book(864, "Gone Girl", "Gillian Flynn", "Crown Publishing Group", 901.14f);
		arr[9] = new Book(383, "Pride and Prejudice", "Jane Austen", "T. Egerton, Whitehall", 655.15f);
		return arr;

	}

	public static int menuList() {

		System.out.println("0. Exit");
		System.out.println("1. Add Book");
		System.out.println("2. Find Book");
		System.out.println("2. Remove Book");
		System.out.println("4. Print Books [Sorted]");
		System.out.println(" Enter Choice");
		return sc.nextInt();

	}

	public static void printArray(Book[] arr) {
		for (Book book : arr) {
			System.out.println(book);
		}
	}

	private static void acceptRecord(int[] bookid) {

		if (bookid != null) {
			System.out.println("Enter BookId :");
			bookid[0] = sc.nextInt();
		}
	}

	public static void main(String[] args) {
		ListTest test = new ListTest();
	int []bookid = new int [1];
	int choice;
	Book []arr = Program.getArray();
	
	while 	((choice = Program.menuList())  != 0){
		switch (choice){
		     case 1 :   ListTest.addBooks();
		    	 break;
		     case 2 : 
		    	 break;
		     case 3 :    Program.acceptRecord(bookid);
		    	 break;
		     case 4 :   ListTest.printBooks();
		    	 break;
		    	 
		}
	}
	
}


}