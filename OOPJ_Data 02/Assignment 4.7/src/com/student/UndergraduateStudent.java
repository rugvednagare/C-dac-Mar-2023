package com.student;
import java.util.Scanner;
public class UndergraduateStudent extends Student {
	int creditHours;
	double tuitionRate;


UndergraduateStudent(){
	
}

public UndergraduateStudent(int creditHours, double tuitionRate) {
	super();
	this.creditHours = 50;
	this.tuitionRate = 500.0;
}

void calculateTuition() {
	Scanner sc=new Scanner(System.in);
	Student s=new Student();
	
	System.out.println("Enter your gpa :" );
	this.setGpa(sc.nextDouble());
	if (this.getGpa() > 3.5) {
		
		System.out.println("Congo , you get 20% discount on tutuin fee");
		double Tuitionfee =( this.creditHours+ this.tuitionRate *0.2);
		System.out.println("Your Tution Fee including Credit hours is  :"+Tuitionfee);
	}else {
		
		System.out.println("Your Tuition fee is  :"+this.tuitionRate);
	}
	
}


}