package best2;

import java.util.Scanner;

class Shape {
	protected float area;

	Shape() {

	}

	public float getArea() {
		return this.area;
	}

}

class Rectangle extends Shape {

	private float length;
	private float breadth;

	void setLength(float length) {

		this.length = length;
	}

	void setBreadth(float breadth) {

		this.breadth = breadth;
	}

	void calculateArea() {
		this.area = this.length * this.breadth;
	}
}

class Circle extends Shape {

	float radius;

	Circle() {

	}

	void setRadius(float radius) {
		this.radius = radius;
	}

	void calculateArea() {
		this.area = (float) ((float) Math.PI * Math.pow(this.radius * 2, area));

	}
}

class Shapetest {
	Scanner sc = new Scanner(System.in);

	private Shape shape;

	void setShape(Shape shape) {
		this.shape = shape;
	}

	public void acceptRecord() {
		if (this.shape instanceof Rectangle) { // check which instance in ref.

			Rectangle rect = (Rectangle) this.shape; // Downcasting
			System.out.println("Enter Length");
			rect.setLength(sc.nextFloat());
			System.out.println("Enter Breadth");
			rect.setBreadth(sc.nextFloat());

			rect.calculateArea();
			System.out.println("Arear of Rect   :" + rect.getArea());

		} else {

			Circle cir = (Circle) this.shape; // Downcasting
			System.out.println("Enter Radius   :");
			cir.setRadius(sc.nextFloat());

			cir.calculateArea();
			System.out.println("Area of Circle		:" + cir.getArea());

		}

	}

}

public class Program {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		Shapetest test = new Shapetest();
		
		System.out.println("Enter the choice");
		System.out.println("1 . Rectangle");
		System.out.println("2 . Circle");
		System.out.println("0 . Exit");
		int choice=sc.nextInt();
		
	while (choice != 0) {
		switch(choice) {
		case 1: test.setShape(new Rectangle()); // upcasting
		         test.acceptRecord();
		         break;
		case 2: test.setShape(new Circle());
				test.acceptRecord();      
				break;
		case 3: break;	
		}

		}
}
	}


