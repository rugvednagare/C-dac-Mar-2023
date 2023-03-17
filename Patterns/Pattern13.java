import java.util.Scanner;
class Pattern13{
	public static void main(String args[]) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("enter the row count");
		int n=sc.nextInt();
		
		char r=64;
for(int i=1;i<=n;i++)
{
	for(int j=n;j>i;j--)
	{
		System.out.print(" ");
	}
	for(int k=1;k<=i;k++)
	{
		System.out.print((char)(r+i)+" ");
	}
	System.out.println();
}	

}
}