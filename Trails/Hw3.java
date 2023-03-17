import java.util.*;

class Hw3{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Number");
		
	int num1=sc.nextInt();
	int num2=sc.nextInt();	
	
	int num3= (num1>num2)?num1+num2:num1-num2;
		System.out.println("Answer="+num3);
		
	}
	
};