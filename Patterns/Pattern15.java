import java.util.*;
class Pattern15{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the count of rows");
		int n=sc.nextInt();
		
		for(int i=n;i>=1;i--)
		{
			//System.out.print();
		
		for(int j=n;j<=i;j--)
		{
			System.out.print(j);
		}
		
		System.out.println();
		}
		
	}
}