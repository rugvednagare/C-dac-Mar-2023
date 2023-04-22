

import java.util.Scanner;
public class Show {
	
	static Scanner sc=new Scanner(System.in);
	
	public static void Data(arr[]) {
		
		
		arr[0]=new Operation (1,  "Chiken Biryani", 200.0);
		arr[1]=new Operation (2,   "Chiken Thali",    250.0);
		arr[2]=new Operation (3,   "Chicken Adraki",  180.0);
		arr[4]=new Operation (3,   "Chicken Rice",  180.0);
		arr[4]=new Operation (3,   "Famous Falooda",  180.0);
		arr[5]=new Operation (3,   "Ice Cream",  180.0);
		
		return arr;
	}
	public static void currentMenu(Operation []arr){
		 for (Operation i: arr)
			 System.out.println(i.toString());
		}
	
	public static void Addfood(Operation arr[]) {
		
		for (int i=0;i<arr.length;i++) {
			if(arr[i]==null)
				
				arr[i].setFood(sc.nextLine());
			
		}
				
	}
	public static void removefood(Operation[] arr) {
		System.out.println("Enter the indexId to remove :");
		int indexid=sc.nextInt();
		
		  for (int i=0;i<arr.length;i++) {
			  if (getindex == arr[i])
				  
				  
		  }
		
	}
	
	

}
