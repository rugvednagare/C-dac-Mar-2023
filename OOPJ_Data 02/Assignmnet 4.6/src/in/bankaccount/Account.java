package in.bankaccount;
import java.util.Scanner;
public class Account {
	protected static String accountNumber;
	protected static double balance;
	
	Account(){
		this ("10027625",2000);
	}
	public Account(String accountNumber, double balance) {
		
		 Account.accountNumber = accountNumber;
		Account.balance=balance;
	}
	
	public  static String getAccountNumber() {
		return accountNumber;
	}

	public static  void setAccountNumber(String accountNumber) {
		Account.accountNumber = accountNumber;
	}

	public static double getBalance() {
		return balance;
	}

	public static void setBalance(double balance) {

		Account.balance = balance;
	}

	
	static Scanner sc=new Scanner(System.in);
	
	public static void deposit() {
		System.out.println("Enter the account number for deposite  :");
		Account.setAccountNumber(sc.nextLine());
		sc.nextLine();
		System.out.println("Enter the Amount to Deposite  :");
		Account.setBalance(sc.nextDouble()+Account.balance);
		sc.nextLine();
		System.out.println("Your Total Balace  :"+Account.getBalance());
		
	}
	
	public static void withdraw() {
		System.out.println("Enter the account number  to withdraw:");
		Account.setAccountNumber(sc.nextLine());
		sc.nextLine();
		System.out.println("Enter the Amount to Withdraw :");
		Account.setBalance(Account.balance - sc.nextDouble());
		sc.nextLine();
		System.out.println("Your Remaining Balance   :"+Account.getBalance());
		
		
		
		
	}

  
	

}
