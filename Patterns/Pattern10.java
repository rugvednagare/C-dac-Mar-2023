import java.util.*;
class Pattern10{
	
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the number of Rows");
		int n = sc.nextInt();
	int d=64;
		for(int i=n;i>=1;i--)
		{ 
	        for (int k=1;k<=i;k++)
			{
				System.out.print(" ");
			}
			for (int j=i;j<=n;j++)
			{
				System.out.print((char)(d+j)+" ");
			}   
			System.out.println();		
		}
	
	}
}
	