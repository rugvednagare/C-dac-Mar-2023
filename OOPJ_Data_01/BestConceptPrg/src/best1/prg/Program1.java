package best1.prg;



import java.util.Scanner;

class Shape{
	  protected float area;
	 Shape(){
		 
	 }
	public float getArea() {
		 return this.area;
	 }
	

}
class Rectangle extends Shape{
	
	private float length;
	private float breadth;
	
	void setLength(float length) {
		
		this.length=length;
	}
	void setBreadth(float breadth) {
		
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
	
	void setRadius(float radius)
	{
		this.radius=radius;
	}
	
	void calculateArea() {
		this.area=(float) ((float)Math.PI * Math.pow(this.radius*2,area));	 
		
	}
}

public class Program1 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		Shape shape=new Shape();
		
		Rectangle rect=new Rectangle();
		System.out.println("Enter Length") ;
		rect.setLength(sc.nextFloat());
		System.out.println("Enter Breadth") ;
		rect.setBreadth(sc.nextFloat());
		rect.calculateArea();
		System.out.println("rect area  :"+rect.getArea());
		
		Circle Cir=new Circle();
		System.out.println("Enter Radius") ;
		Cir.setRadius (sc.nextFloat());
		Cir.calculateArea();
		System.out.println("Circle Area	:"+Cir.getArea());
		
		

	}

}
