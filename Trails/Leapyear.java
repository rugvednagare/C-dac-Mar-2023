import java.util.*;
class Leapyear
{
	 public static void main(String args[])
  
  {
	 Scanner sc=new Scanner(System.in);
	   
	   System.out.println("Enter year");
	   int year=sc.nextInt();
	   
	   if((year%400==0) || (year%4==0))
	   {
		   System.out.println("leap");
	   }
      
	   else
	   {
		   System.out.println("non leap");
	   }
	   
	   
	   
  }
	
}