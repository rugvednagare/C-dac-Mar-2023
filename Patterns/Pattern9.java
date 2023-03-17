import java.util.*;
class Pattern9{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the number of Rows");
		int n = sc.nextInt();
	int d=64;
		for(int i=1;i<=n;i++)
		{ 
	        for (int k=1;k<=n-i;k++)
				System.out.print(" ");
			
			for (int j=1;j<=i;j++)
			{
				System.out.print((char)(d+j)+" ");
			}   
			System.out.println();		
		}
	
	}
}