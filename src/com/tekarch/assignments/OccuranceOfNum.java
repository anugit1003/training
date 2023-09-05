package com.tekarch.assignments;
//import java.util.Scanner;

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
			//skip
			if (found) {
				continue;
			}

			//Finding loop - improve this code
			for (int j = i; j < arr.length-1; j++) {

				if (currentArraValue == arr[j+1]) {
					count++;
				}

			}

			System.out.println("The Array Value " + currentArraValue + " has been found " + count + " times ");
		}
		//return count;

	}

	public static void main(String[] args) {

		int arr[] = { 20, 20, 20, 50, 20, 12, 60, 12 };
		// int arr[] = { 12, 12, 12, 20, 20, 50, 60 };

		OccuranceOfNum ocn = new OccuranceOfNum();
		ocn.findCount(arr);
		//System.out.println("the number of time each number is in the array:" + value);

	}

}
