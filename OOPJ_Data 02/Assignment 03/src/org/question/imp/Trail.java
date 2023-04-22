package org.question.imp;
import java.util.Scanner;

public class Trail {
	static Scanner sc = new Scanner(System.in);
	public static void main(String[] args){
		
		System.out.println("Enter the size of array");
		int size = sc.nextInt();
		int[] arr = new int[size];
		
		System.out.println("Enter array elemnts");
		for (int i = 0; i < size; i++) {
			 arr[i] = sc.nextInt();
		}
			for (int j = 0; j < size; j++) {

				System.out.println(arr[j]);
			}
		}

	}

