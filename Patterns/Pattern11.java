import java.util.Scanner;
class Pattern11{
	public static void main(String args[]) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("enter the row count");
		int n=sc.nextInt();
		
for(int i=1;i<=n;i++)
{
	for(int j=n;j>i;j--)
	{
		System.out.print("  ");
	}
	for(int k=1;k<=2*i-1;k++)
	{
		System.out.print("* ");
	}
	System.out.println();
}	

}
}












