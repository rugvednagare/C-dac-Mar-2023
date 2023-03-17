import java.util.*;
class Marks
{
	public static void main(String args[])
	{
    System.out.println("Enter the Marks out of 100");
	
	Scanner sc = new Scanner(System.in);
	int num=sc.nextInt();
		
if (num>=95){
	System.out.println("Distiction");
	}
 else if (num>=85 && num<95)
	{
	System.out.println("First Division");
	
	}
else if (num>=75 && num<85)
{
	System.out.println("Average");
}
else {
	System.out.println("you are below average");
}
	}
}