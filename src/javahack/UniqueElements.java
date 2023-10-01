package javahack;

import java.util.Arrays;
import java.util.Scanner;

public class UniqueElements {
	
	public static void displayUniqueElements(int arr[]) {
		Arrays.sort(arr);
		for (int i = 0; i < arr.length; i++) {
			int count = 1;
			while ((i + 1 < arr.length) && (arr[i] == arr[i + 1])) {
				count++;
				i++;
			}
			if (count == 1) {
				System.out.println("Element " + arr[i] + " is unique");
			} else {
				System.out.println("Element " + arr[i] + " has occured " + count + " times");
			}
		}
	}

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		System.out.println("Enter the array size:");
		int size = scn.nextInt();
		int arr[] = new int[size];
		System.out.println("Enter the array elements:");

		for (int i = 0; i < arr.length; i++) {
			arr[i] = scn.nextInt();
		}
		scn.close();
		displayUniqueElements(arr);
	}

}
