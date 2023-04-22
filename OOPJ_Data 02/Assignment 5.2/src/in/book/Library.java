package in.book;

import java.util.Arrays;
import java.util.Collection;

public class Library extends Book {
	
	
	public Book[]getArray(){
	Book []arr = new Book[5];
	
	  arr[0] = new Book("Core Java" , "James Ghosling" , 1980);
	  arr[1] = new Book("HtmlBook" , "Abdul Razak" ,1995);
	  arr[2] = new Book("Cpos", "Raja Hakim ", 2010);
	  arr[3] = new Book("Advance Java" , "Ram Kadam" , 1992);
	  arr[4] = new Book("Sql" , "Swapnil jahan" , 1998);
	  
	  return arr;
	  
	  
	  
	  }
public static void printRecord(Book []arr) {
		
		for(Book elements : arr) {
			System.out.println(elements);
		}
		System.out.println();
	}

	
	


	}

