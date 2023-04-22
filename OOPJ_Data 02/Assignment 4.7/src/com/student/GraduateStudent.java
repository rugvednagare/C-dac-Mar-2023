package com.student;
import java.util.Scanner;
public class GraduateStudent extends Student{
	double reasearchFee;
	double tuitionRate;

	GraduateStudent(){
		
	}

	public GraduateStudent(double reasearchFee) {
		super();
		this.reasearchFee = 700.0;
		this.tuitionRate = 500.0 ;
	}
	
	public double getReasearchFee() {
		return reasearchFee;
	}

	public void setReasearchFee(double reasearchFee) {
		this.reasearchFee = reasearchFee;
	}

	
void calculateTuition() {
	Scanner sc=new Scanner(System.in);
	 UndergraduateStudent under= new UndergraduateStudent();
	 
	System.out.println ("Enter your Research Fees  :");
	this.setReasearchFee(sc.nextDouble());
	 if(this.reasearchFee > 5000) {
		 System.out.println("Congo You get 10% discount  ");
		 double Tuitionfee= (under.tuitionRate-(under.tuitionRate * 0.1) );	 
	System.out.println(" Your Tution Fee is  :"+Tuitionfee);
	 }
	 else {
		 System.out.println(" Your Tuition fee is  :"+this.tuitionRate);
	
	}


}

}
