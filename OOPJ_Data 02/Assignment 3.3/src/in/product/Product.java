package in.product;

import java.util.Arrays;
import java.util.Comparator;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

public class Product{
	@Getter@Setter
	
	String name;
	double price;
	String category;
	
	
	public Product(String name, double price, String category) {
		super();
		this.name = name;
		this.price = price;
		this.category = category;
	}
	
	public Product[] getArray() {
		Product []arr = new Product[5];
		
		arr[0] = new Product("Refrigerator" , 10000.0 , "electronics");
		arr[1] = new Product("TV" , 7000.0 , "electronics");
		arr[2] = new Product("Mobile" , 17000.0 , "electronics");
		arr[3] = new Product("Mixer" , 4000.0 , "Appliances");
		arr[4] = new Product("Cupbooard" , 12000.0 , "Furniture");
	
		return arr;
		
	}
	
       public void printArray(Product []arr) {
    	   for (Product elements : arr)
    		   System.out.println(elements);
    	 
       }
      
       
	public String toString () {
		return String.format("%-8s%-7d%-15s% ", this.name,this.price,this.category);
	}


	public static void main(String[] args) {
		Product p = new Product();
		
		p.getArray();
		Comparator<Product> pro= new CompareData();
		Arrays.sort(arr , pro);
		

	}

	
	}


