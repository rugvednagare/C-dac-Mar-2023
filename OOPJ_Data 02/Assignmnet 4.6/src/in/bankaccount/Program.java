package in.bankaccount;
import java.util.Scanner;
public class Program {

	public static Account[] getArray() {
		int size = 5;
		Account[] arr = new Account[size];

		arr[0] = new SavingAccount();
		arr[1] = new CheckingAccount();
		return arr;
	}

	private static void getData (Account []arr) { 
		 Scanner sc=new Scanner(System.in);
		
		CheckingAccount check = new CheckingAccount();
		SavingAccount save = new SavingAccount();
	  int choice;
		
		do {
		System.out.println("1 .SavingAccount");
		System.out.println("2 .CheckingAccount");
		System.out.println("Enter the choice");
		choice=sc.nextInt();
		switch(choice) 
		{
		
		case 1:  arr[choice]=new SavingAccount(); 
			save = (SavingAccount) arr[choice];
		        save.calculateInterest();   
		        
			break;
			
		case 2: arr[choice] =new CheckingAccount();
			check =(CheckingAccount) arr [choice];
		          check.withdrawAmount();
			break;
		}
		}while(choice!=0) ;
}

	
	public static void main(String[] args) {
		SavingAccount save = new SavingAccount();
		Account acc = new Account();
		Account arr1[]=Program.getArray();
		Program.getData(arr1);
	

	}

}
