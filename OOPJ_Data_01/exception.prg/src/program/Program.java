package program;

import java.util.Arrays;
import java.util.Scanner;

public class Program {
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {

		try {
			int[] arr = new int[10];

			for (int i = 0; i < arr.length; i++) {
				System.out.println("Enter the number");
				arr[i] = sc.nextInt();
			}
			System.out.println(Arrays.toString(arr));
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
}
