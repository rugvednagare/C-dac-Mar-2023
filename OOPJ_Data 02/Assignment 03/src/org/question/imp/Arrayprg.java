package org.question.imp;

import java.util.*;

public class Arrayprg {
	public static void printrecord() {

		int arr[] = new int[] { 45, 3, 67 };
		int arr1[] = { 10, 3, 46, 73, 40 };
		for (int index = 0; index < 3; ++index) {
			System.out.println(arr[index]);
		}
		for (int index1 = 0; index1 < arr1.length; index1++) {
			System.out.println(arr1[index1]);
		}
	}

	static Scanner sc = new Scanner(System.in);

	static void acceptrecord(int[] arr2) {

		System.out.println("Enter the numbers");
		for (int i = 0; i <= 4; i++) {

			arr2[i] = sc.nextInt();

		}
	}

	private static void rerecord(int arr2[]) {

		for (int i = 0; i <= 4; i++) {

			System.out.println("Array Elements	:" + arr2[i]);

		}
	}

	public static void main(String[] args) {
		int arr2[] = new int[5];
		int arr3[] = new int[5];

		Arrayprg.printrecord();
		Arrayprg.acceptrecord(arr2);
		Arrayprg.rerecord(arr2);

	}

}
