package best.prg;

import java.util.Scanner;

class Shape{
	  protected float area;
	 Shape(){
		 
	 }
	
	void printArea(){
		 System.out.println("area"+area);
	 }
}
class Rectangle extends Shape{
	
	private float length;
	private float breadth;
	
	Scanner sc=new Scanner(System.in);
	 void acceptRecord(){
	
		System.out.println("Enter the legnth and Bredth");
		length =sc.nextFloat();
		this.length=length;
		breadth=sc.nextFloat();
		this.breadth=breadth;
	}
	 
	 void calculateArea() {
		 this.area= this.length * this.breadth;
	 }
}
class Circle extends Shape{
	
	 float radius;
	Circle(){
		
	}
	
	void acceptRecord() {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the radius");
		this.radius=sc.nextFloat();
		
	}
	
	void calculateArea() {
		this.area=(float) ((float)Math.PI * Math.pow(this.radius*2,area));	 
		
	}
}

public class Program {

	public static void main(String[] args) {
		Shape shape=new Shape();
		
		Rectangle rect=new Rectangle();
		rect.acceptRecord();
		rect.calculateArea();
		rect.printArea();
		Circle Cir=new Circle();
		Cir.acceptRecord();
		Cir.calculateArea();
		Cir.printArea();

	}

}
