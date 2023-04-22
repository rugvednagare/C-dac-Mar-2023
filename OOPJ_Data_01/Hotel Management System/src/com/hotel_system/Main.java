package com.hotel_system;

import java.util.List;
import java.util.ArrayList;
import java.util.Scanner;



class Food {

	int itemno;
	int quantity;
	float price;

	Food(int itemno, int quantity) {

		this.itemno = itemno;
		this.quantity = quantity;
		switch (itemno) {

		case 1:
			price = quantity * 50;
			break;
		case 2:
			price = quantity * 60;
			break;
		case 3:
			price = quantity * 70;
			break;
		case 4:
			price = quantity * 30;

		}

	}
}

class Singleroom {
	
	String name;
	String contact;
	String gender;
	
	Singleroom(){
		
	}
	
	
	public Singleroom(String name, String contact, String gender) {
		this.name = " ";
		this.contact = contact;
		this.gender = gender;
		
		List <Food> food = new ArrayList<>();

	}

class Doubleroom extends Singleroom
{
	
	String name2;
	String contact2;
	String gender;
	
	Doubleroom()
	{	
		this.name=" ";
		this.name2=" ";
		
	}

	public Doubleroom(String name, String contact, String gender, String name2, String contact2, String gender2) {
		super(name, contact, gender);
		this.name2 = name2;
		this.contact2 = contact2;
		gender = gender2;
	}
	
class NotAvailable extends Exception
{
	@Override
	public String toString()
	{
		return "Not Available !";
	}
	
}
	
class Holder 
{
	Doubleroom luxury_Doubleroom[]=new Doubleroom[10];
	Doubleroom deluxe_Doubleroom[]=new Doubleroom[10];
	Singleroom luxury_Singleroom[]=new Singleroom[10];
	Singleroom deluxe_Singleroom[]=new Singleroom[10];
	
}



 class Hotel
{
	 static Scanner sc=new Scanner(System.in);
	static Holder hotel_ob = new Holder();
	
	public void CustomerDetails(int i , int rn) 
	{
		String name,contact,gender ;
		String name2=null; contact2=null;
		String gender2=" ";
		
		System.out.println("Enter Customer name :");
		name=sc.nextLine();
		sc.nextLine();
		System.out.println("Enter contact number :");
		contact=sc.nextLine();
		sc.nextLine();
		System.out.println("Entter gender :");
		gender=sc.nextLine();
		if(i < 3)
		{
			System.out.println("Enter second ustomer name :");
			name2=sc.nextLine();
			sc.nextLine();
			System.out.println("Enter contact number :");
			contact2=sc.nextLine();
			sc.nextLine();
			System.out.println("Enter gender :");
			gender2=sc.nextLine();
		}
		
		switch(i) {
		case 1: hotel_ob.luxury_Doubleroom[rn]=new Doubleroom(name,contact,gender,name2,contact2,gender2);
			break;
		case 2 :hotel_ob.deluxe_Doubleroom[rn]=new 	Doubleroom(name,contact,gender,name2,contact2,gender2);
			break;
		case 3:hotel_ob.luxury_Singleroom[rn]=new Singleroom(name,contact,gender);
			break;
		case 4:hotel_ob.deluxe_Singleroom[rn]=new Singleroom(name,contact,gender);
			break;
		}
	}
	
	public void bookroom(int i)
	{
		int rn;
		System.out.println("\nChoose room number from :");
		switch (i) {
		case 1:
			for(int j=0;j<hotel_ob.luxury_Doubleroom.length;j++)
			{
				if(hotel_ob.luxury_Doubleroom[j] == null)
				{
					System.out.println(j+1+",");
				}
			}
			System.out.println("Enter rooom number :");
			try {
				rn=sc.nextInt();
				rn--;
				if(hotel_ob.luxury_Doubleroom[rn] != null)
					throw new NotAvailable();
				CustomerDetails(i, rn);
			}
			catch(Exception e)
			{
				System.out.println("Invalid Option !");
				return;
			}
			break;
		
		case 2:
			for(int j=0;j<hotel_ob.deluxe_Doubleroom.length;j++)
			{
				if(hotel_ob.deluxe_Doubleroom[j] == null)
				{
					System.out.println(j+11+",");
				}
			}System.out.println("\nEner room number :");
			try {
				rn=sc.nextInt();
				rn=rn-11;
				if(hotel_ob.deluxe_Doubleroom[rn] == null)
				
					throw new NotAvailable();
				CustomerDetails(i, rn);
			}
			catch (Exception e)
			{
				System.out.println("Invalid Option");
				return;
			}break;
			
			
		case 3:	for(int j=0;j<hotel_ob.luxury_Singleroom.length;j++)
		{
			if(hotel_ob.luxury_Singleroom[j] == null)
			{
				System.out.println(j+31+",");
			}
		}System.out.println("\nEner room number :");
		try {
			rn=sc.nextInt();
			rn=rn-31;
			if(hotel_ob.luxury_Singleroom[rn] == null)
			
				throw new NotAvailable();
			CustomerDetails(i, rn);
		}
		catch (Exception e)
		{
			System.out.println("Invalid Option");
			return;
		}break;
	
		case 4:
			for(int j=0;j<hotel_ob.deluxe_Singleroom.length;j++)
			{
				if(hotel_ob.deluxe_Singleroom[j] == null)
				{
					System.out.println(j+41+",");
				}
			}System.out.println("\nEner room number :");
			try {
				rn=sc.nextInt();
				rn=rn-41;
				if(hotel_ob.deluxe_Singleroom[rn] == null)
				
					throw new NotAvailable();
				CustomerDetails(i, rn);
			}
			catch (Exception e)
			{
				System.out.println("Invalid Option");
				return;
			}break;
			
			}
		System.out.println("Room Booked !!!");
		
		}
	}

	public void features(int i) 
	{
		switch(i) {
		case 1:System.out.println("Number of double beds : 1\nAC : Yes\nFree breakfast : Yes\nCharge per day:4000 ");
			break;
		case 2 :System.out.println("Number of double beds : 1\nAC : No\nFree breakfast : Yes\nCharge per day:3000 ");
			break;
		case 3:System.out.println("Number of Single beds : 1\nAC : Yes\nFree breakfast : Yes\nCharge per day:2000 ");
			break;
		case 4:System.out.println("Number of Single beds : 1\nAC : No\nFree breakfast : Yes\nCharge per day:1200 ");
			break;
		default:
			System.out.println("Enter Valid Option :");
			break;
			
		}
	}
	
	public void availability(int i)
	{   
		Holder hotel_ob = new Holder();
		int j=0,count=0;
		switch(i) {
		case 1:
			for(j=0;j < hotel_ob.luxury_Doubleroom.length;j++) {
				if( hotel_ob.luxury_Doubleroom[j] ==null)
					count++;
			}break;
		case 2:
			for(j=0;j<hotel_ob.deluxe_Doubleroom.length;j++) {
				if(hotel_ob.deluxe_Doubleroom[j] ==null)
					count++;
			}break;
		case 3: 
			for(j=0;j < hotel_ob.luxury_Singleroom.length;j++)
			{
				if(hotel_ob.luxury_Singleroom[j] == null )
					count ++;
			}break;
		case 4:
			for(j=0; j < hotel_ob.deluxe_Singleroom.length;j++)
			{
				if(hotel_ob.deluxe_Singleroom[j] == null)
					count ++;
			}break;
		default : System.out.println("Enter valid Option !");	
			break;
		}
		System.out.println("Number of rooms AVailable  :"+count);
	}
	
	public void bill(int rn , int rtype)
	{
		double amount=0;
		String list[]= {"Sandwich","Misalpav","Puri bhaji","juice"};
		
	
	
	}
}
	


	




















































}
public class Main {

	
	
	public static void main(String[] args) {
	

	}

}
