package javahack;

import java.util.Scanner;

public class SortIntegers {

	public static void sortIntegersAscending(int arr[]) {
		int temp = 0;
		for (int i = 0; i < arr.length; i++) {
			for (int j = 1; j < arr.length - i; j++) {
				if (arr[j] < arr[j - 1]) {
					temp = arr[j];
					arr[j] = arr[j - 1];
					arr[j - 1] = temp;
				}
			}
		}
		System.out.println(" \nArray elements in ascending order:");
		for (int a = 0; a < arr.length; a++) {
			System.out.print(arr[a] + " ");
		}
	}
	
	public static void sortIntegerDescending(int arr[]) {
		int temp = 0;
		for (int i = 0; i < arr.length; i++) {
			for (int j = 1; j < arr.length - i; j++) {
				if (arr[j] > arr[j - 1]) {
					temp = arr[j];
					arr[j] = arr[j - 1];
					arr[j - 1] = temp;
				}
			}
		}
		System.out.println("Array elements in descending order:");
		for (int a = 0; a < arr.length; a++) {
			System.out.print(arr[a] + " ");
		}
	}
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		System.out.println("Enter the array size:");
		int n = scn.nextInt();
		int arr[] = new int[n];
		System.out.println("Enter the array elements:");
		for (int i = 0; i < arr.length; i++) {
			arr[i] = scn.nextInt();
		}
		scn.close();
		System.out.println("Array before sorting:");
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println();
		sortIntegersAscending(arr);
		System.out.println();
		sortIntegerDescending(arr);

	}

}
