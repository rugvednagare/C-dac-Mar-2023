package in.book;
import java.util.Arrays;
public class Book implements Comparable<Book>{
	
	String title;
	String author;
	int publicationYear;
	
	Book(){
		
	}

	public Book(String title, String author, int publicationYear) {
		super();
		this.title = title;
		this.author = author;
		this.publicationYear = publicationYear;
	}


	public static void main(String[] args) {
		Library lib=new Library();
	
		Book []arr =lib.getArray();
		Library.printRecord(arr);
		Arrays.sort(arr);
		Library.printRecord(arr);
	}

	@Override
	public String toString() {
		return String.format( "%-20s%-20s%-20d" ,this.title , this.author , this.publicationYear);
				
	}
	
	
	

	@Override
	public int compareTo(Book o) {
		return this.publicationYear - o.publicationYear ;
		
	}
		
	}
	
	
