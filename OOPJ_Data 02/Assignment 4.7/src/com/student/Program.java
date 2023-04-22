package com.student;

import java.util.Scanner;

public class Program{
	

	public static Student[] getArray() {
		
		Student []arr= new Student[5];
		
		arr[0]=new UndergraduateStudent(50, 500.0);
		arr[1]=new GraduateStudent(700.0);
		return arr;
	}
	
	static void getChoice(  Student arr[]) {
		//UndergraduateStudent under1=new UndergraduateStudent();
		 Scanner sc=new Scanner(System.in);
		int choice = 0;
		
		do {
		System.out.println("0. Undergraduate Student Info");
		System.out.println("1. Graduate Student Info");
		System.out.println("2. Exit");
		choice=sc.nextInt();
		
		
			switch(choice) {
			case 0:  UndergraduateStudent under= (UndergraduateStudent) arr[choice];
			         under.calculateTuition();
				break;
				
			case 1:  GraduateStudent graduate=(GraduateStudent) arr [choice];
			         graduate.calculateTuition();			     
				break;
			}	
			}while(choice != 2);
		
	}

	public static void main(String[] args) {
		
		Student arr1 []= Program.getArray();
		Program.getChoice(arr1);

	}

}
