package com.tekarch.assignments;

import java.util.Scanner;

public class OccuranceOfNum {

	public void findCount(int[] arr) {

		int currentArraValue;
		int count = 0;

		for (int i = 0; i < arr.length; i++) {
			currentArraValue = arr[i];
			count = 1;
			boolean found = false;

			// loop backwards to check
			for (int k = i; k > 0; --k) {

				if (currentArraValue == arr[k - 1]) {
					found = true;
					break;
				}

			}
			// skip
			if (found) {
				continue;
			}

			for (int j = i; j < arr.length - 1; j++) {

				if (currentArraValue == arr[j + 1]) {
					count++;
				}

			}

			System.out.println("The Array Value " + currentArraValue + " has been found " + count + " times ");
		}

	}

	public static void main(String[] args) {

		Scanner scn = new Scanner(System.in);
		System.out.println("enter the size of array");
		int arrsize=0;
		if(scn.hasNextInt()) {
			 arrsize =scn.nextInt();
		}
		int arr[] = new int[arrsize];
		System.out.println("Enter the values of the array");
		for(int i=0;i<arrsize;i++) {
			arr[i]=scn.nextInt();
		}
		scn.close();

		OccuranceOfNum ocn = new OccuranceOfNum();
		ocn.findCount(arr);

	}

}
