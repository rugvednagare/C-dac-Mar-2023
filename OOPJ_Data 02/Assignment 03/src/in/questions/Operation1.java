package in.questions;

import in.questions.Array1;

import java.util.*;

public class Operation1 {

	private static int size;
	static int arr[];
	private static int j;

	public static void acceptData() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of Array");
		size = sc.nextInt();
		arr = new int[size];

		System.out.println("Enter the Elements");
		for (int i = 0; i < size; i++) {

			arr[i] = sc.nextInt();

		}
	}

	static void printData() {
		for (int j = 0; j < size; j++) {
			System.out.println("Print Elements	:" + arr[j]);
		}

	}

	static int sum() {
		int ssum = 0;
		for (int k = 0; k < size; k++) {
			ssum = ssum + arr[k];
		}

		return ssum;

	}

	public static void average() {
		int Average = (sum() / size);
		System.out.println("Sum	:" + sum());
		System.out.println("Average of array :" + Average);

	}

	public static void largeElement() {
		int max = 0;
		for (int i = 0; i < size; i++) {
			if (max < arr[i])
				max = arr[i];
		}
		System.out.println("Largest element	:" + max);

	}

	public static void smallElements() {
		int min = 0;int i =0;
		min=arr[i];
				for( i=0;i<size;i++) {
				 
				if(arr[i]<min)
					min=arr[i];
				}
			System.out.println("Smallest element	:"+ min);
			
		}

	public static void sortArray() {
		int temp=0;
		for(int i=0; i < size;i++) {
		
			for(int j=(i+1);j<size;j++)
			if(arr[i]>arr[j]) {
		   temp=arr[i];
			arr[i]=arr[j];
			arr[j]=temp;
		}
		}
		for(int i1=0;i1<size;i1++) {
		
		System.out.println("Ascending order  :"+arr[i1]);
		}
	}
	
	}

	