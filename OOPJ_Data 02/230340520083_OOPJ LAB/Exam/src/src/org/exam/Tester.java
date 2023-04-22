package org.exam;

import java.util.Scanner;

public class Tester {

	public static Bank[] getarray() {

		Bank[] bank = new Bank[5];
		bank[0] = new Bank(123456789, "Rugved", "Rugvednagare@gmail.com", 735826732, 2000.0);

		return bank;

	}

	Scanner sc = new Scanner(System.in);

	public static void addAccount() {
		Scanner sc = new Scanner(System.in);
		Bank b2 = new Bank();
		Bank[] b1 = Tester.getarray();

		if (b2 != null) {
			System.out.println("Enter account number");
			b2.setAccountNumber(sc.nextLong());
			sc.nextLine();
			System.out.println("Enter Email Id :");
			b2.setEmail(sc.nextLine());
			System.out.println("Enter Phone nO : :");
			b2.setPhoneNo(sc.nextLong());
			System.out.println("Enter Amount to deposite First :");
			b2.setBalance(sc.nextDouble());
		}

	}

	public static void withdrawAmount() {
		Scanner sc = new Scanner(System.in);
		Bank b2 = new Bank();
		// if (b2.balance > 500 ) {
		System.out.println(" Enter Amount to withdraw if Balance above 500 :");
		double withdrwamount = sc.nextDouble();
		double Remaining_Balanceb = b2.getAccountNumber() - withdrwamount;
		System.out.println(" Your Remaining Balance is :" + Remaining_Balanceb);
	}

	public static void depositAmount() {
		Scanner sc = new Scanner(System.in);
		Bank b21 = new Bank();

		System.out.println(" Enter Amount to Deposit");
		double wamount = sc.nextDouble();
		double Total_Balance = b21.getBalance() + wamount;
		System.out.println(" Your Remaining Balance is :" + Total_Balance);
	}

	static void showDetails() {
		Bank[] b1 = Tester.getarray();
		System.out.println(b1.toString());

	}
}
