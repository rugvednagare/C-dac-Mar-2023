package org.exam;

import java.util.Scanner;

public class Bank {
	
	private long accountNumber;
	private String name;
	private String email;
	private long phoneNo;
	private double balance;
	
	Bank(){
	
	}

	public Bank(long accountNumber, String name, String email, long phoneNo, double balance) {
		this.accountNumber = accountNumber;
		this.name = name;
		this.email = email;
		this.phoneNo = phoneNo;
		this.balance = balance;
	}

	
	@Override
	public String toString() {
		return String.format("%-15l%-10s%-15s%-20l%-15f",this.accountNumber,this.name,this.email,this,phoneNo,this.balance);
	}

	public long getAccountNumber() {
		return accountNumber;
	}

	public void setAccountNumber(long accountNumber) {
		this.accountNumber = accountNumber;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public long getPhoneNo() {
		return phoneNo;
	}

	public void setPhoneNo(long phoneNo) {
		this.phoneNo = phoneNo;
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

	
	
public static void main(String[] args) {
		
		Scanner sc = new Scanner (System.in);
		Tester test = new Tester();
		
		
		int choice;
       do{
   		System.out.println("1 .Add Account :");
   		System.out.println("2 .Withdraw Money");
   		System.out.println("3 .Deposite Money");
   		System.out.println("4 .Show account details");
   		System.out.println("0 .Exit");
		System.out.println("Enter choice");
		choice = sc.nextInt();

		switch(choice) {
		case 1 : Tester.addAccount();
		break ;
		
		case 2 : Tester.withdrawAmount();
		break;
		
		case 3 :Tester.depositAmount();
		break;
		
		case 4 : Tester.showDetails();
		break ;
		}
		}while (choice != 0);
		
       }

	
	}

