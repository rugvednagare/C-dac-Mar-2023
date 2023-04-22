package in.trail;

public class Calculate implements Cloneable {
int num1;
	int num2;
	
	
	Calculate(int num1,int num2){
		this.num1= num1;
		this.num2= num2;
		
	}
	
	public void Printdata() {
		System.out.println(this.num1+" "+this.num2);
		
		
	
	}

	public static void main(String[] args)  {
		
		try {
			Calculate C1=new Calculate(10,20);
			C1.Printdata();
			
			Calculate C2= (Calculate) C1.clone();
			C2.Printdata();
		} catch (CloneNotSupportedException e) {
			
			e.printStackTrace();
		}
		
	}

}
