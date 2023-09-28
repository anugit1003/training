package advanced.day4;

import java.util.Scanner;

public class SumOfElements {

	public static void main(String args[]) {
		Scanner scn = new Scanner(System.in);
		System.out.println("Enter the array size:");
		int size = scn.nextInt();
		int arr[] = new int[size];
		int sum = 0;
		int total;
		System.out.println("Enter the array elements:");
		for (int i = 0; i < arr.length; i++) {
			arr[i] = scn.nextInt();
			sum = sum + arr[i];

		}
		scn.close();
		System.out.println("The sum of the elements enetered:" + sum);
		for (int j = 0; j < arr.length; j++) {
			total = sum + arr[j];
			System.out.println("Value after adding the sum to each element:" + total);
		}
	}

}
