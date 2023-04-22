
package info.cdac;

import java.util.*;

 class Program {
	String account_name;
	public static long Account_number;
	private double account_balance;
	

	public Program() {
		String account_name = " ";
		 long Account_number = 1234567891;
		double account_balance = 10000.0;
	}

	public String getAccount_name() {
		return account_name;
	}

	public void setAccount_name(String account_name) {
		this.account_name = account_name;
	}

	public static Long getAccount_number() {
		return getAccount_number();
	}

	public void setAccount_number( long Account_number) {
		Program.Account_number = Account_number;
	}

	public double getAccount_balance() {
		return account_balance;
	}

	public void setAccount_balance(double account_balance) {
		this.account_balance = account_balance;
	}

}

class Data {
	Program prg1 = new Program();
	Scanner sc = new Scanner(System.in);

	void New_account() {
		System.out.println("Create New Account 	:");
		System.out.println("Account Holder's Name 	:");
		prg1.setAccount_name(sc.nextLine());
		System.out.println("Your account number is	:" + Program.Account_number + 1);
		System.out.println("Your Initial Balance is	00.0	:");
	}

	void DepositeMoney() {
		System.out.println("Enter your Account Number for Deposite Money	:");
		prg1.setAccount_number(sc.nextLong());

		if (Program.getAccount_number() == Program.Account_number) {
			System.out.println("Enter Value for Deposite	:");
			double value = sc.nextLong();
			double Total = (value + (prg1.getAccount_balance()));
			System.out.println("Total Balance	:" + value);
		} else
			System.out.println("Invalid Account Number");
	}

	void WithdrawMoney() {
		System.out.println("Enter your Account Number for Withdraw Money	:");
		prg1.setAccount_number(sc.nextLong());

		if (Program.getAccount_number() == Program.Account_number) {
			System.out.println("Enter Value for Withdraw Money	:");
			double value = sc.nextLong();
			double Total = (prg1.getAccount_balance() - value);
			System.out.println("Total Balance	:" + Total);
		}
			else
			System.out.println("Invalid Account Number");
	}

	void AccountBalance() {
		System.out.println("Enter your Account Number for balance	:");
		prg1.setAccount_number(sc.nextLong());

		if (Program.getAccount_number() == Program.Account_number) {
			System.out.println("Yor Account Balance" + (prg1.getAccount_balance()));
		} else
			System.out.println("Invalid Account Number	:");
	}

}

public class Bankinfo {
	private static int choice;
	public static void main(String[] args) {
		Data D1 = new Data();
		
		
		Scanner sc = new Scanner(System.in);
	
		 do {
			System.out.println("1  .Create New Account 	    :");
			System.out.println(" 2 .Deposite Money	        :");
			System.out.println(" 3 .Withdraw Money	        :");
			System.out.println(" 4. Check Account Balance	:");
			System.out.println(" 5.Exit	                    :");
		 
			
		 int choice=sc.nextInt();
			
		switch (choice) {
		case 1:
			
			D1.New_account();
			break;
		case 2:
			
			D1.DepositeMoney();
			break;
		case 3:
			
			D1.WithdrawMoney();
			break;
		case 4:
			D1.AccountBalance();
			break;
		case 5: 
			break;

		}
		}while(choice != 5);
	
	}

}
