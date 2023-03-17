

Class Maxmin{
import java.util.Scanner;
public static void main(String args[])

Scanner sc=new Scanner (System.in);
System.out.println("Enter the 3 number a,b and c");

int a=sc.next();
int b=sc.next();
int c=sc.next();
(a>b?a>c:b>c)









/*import java.util.Scanner;
class maxmin{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.println("enter a,b,c");
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		if(a>b && a>c){
			System.out.println("A is greatest");
		}
		else if(b>c){
			System.out.println("B is greatest");
		}
		else {
			System.out.println("C is greatest");
		}
	}
}*\