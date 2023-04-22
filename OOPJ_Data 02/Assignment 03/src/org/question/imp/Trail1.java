package org.question.imp;
import java.util.*;
public class Trail1 {

	
	
	public static void acceptarray() {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Array size rows col ");
		int rowsize=sc.nextInt();
		int colsize=sc.nextInt();
		
		int[][]arr=new int [rowsize][colsize];
		
		System.out.println(" Eneter elements");
		int j = 0;
		int row;
		int col;
		for(int i=0;i<rowsize;i++) {
			 
			for( j=0;j<colsize;j++) {
				   arr[i][j] =sc.nextInt();
				
			}
		}
		}
	public static void printarray() {
		int rowsize = 0;
		for(int i=0;i<rowsize;i++) {
			 
			int colsize = 0;
			for( int j = 0;j<colsize;j++) {
				String[][] arr = null;
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		}
}

	public static void main(String[] args) {
		Trail1.acceptarray();
		Trail1.printarray();
		
	
	}
}
