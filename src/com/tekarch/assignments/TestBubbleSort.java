package com.tekarch.assignments;

public class TestBubbleSort {

	private static int comparisons = 0;
	private static int swaps = 0;
	private static int totalOperations = 0;

	public static void bubbleSort(int[] arr) {
		int n = arr.length;
		boolean swapped;
		for (int i = 0; i < n - 1; i++) {
			swapped = false;
			for (int j = 0; j < n - i - 1; j++) {
				comparisons++; // Increment comparisons counter
				totalOperations++; // Increment for the comparison operation
				if (arr[j] > arr[j + 1]) {
					// swap arr[j] and arr[j+1]
					int temp = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = temp;
					swaps++; // Increment swaps counter
					totalOperations += 3; // Increment for the three swap operations
					swapped = true;
				}
			}
			if (!swapped) {
				break;
			}
		}
	}

	public static void main(String[] args) {

		int arr1[] = { 10, 20, 30, 40, 50 }; // Already sorted - Best Case
		int arr2[] = { 50, 40, 30, 20, 10 }; // Already sorted - Best Case
		int arr3[] = { 901, 34, 603, 501, 401 }; // Randomly sorted
		
		System.out.println("Original array:");
        for (int i=0; i < arr1.length; i++)
            System.out.print(arr1[i] + " ");
        
        System.out.println("");
		bubbleSort(arr1);
		
		System.out.println("Sorted array:");
        for (int i=0; i < arr1.length; i++)
            System.out.print(arr1[i] + " ");
        
        System.out.println("");

		System.out.println("Number of comparisons: " + comparisons);
		System.out.println("Number of swaps: " + swaps);
		System.out.println("Total operations: " + totalOperations);

		// Analyzing Big O based on total operations
		double ratio = (double) totalOperations / arr1.length;
		System.out.println("The Ratio: " + ratio);
		if (ratio <= 1) {
			System.out.println("The observed Big O notation is close to O(n)");
			System.out.println("*****************************************");
		} else {
			System.out.println("The observed Big O notation is close to O(n^2)");
			System.out.println("*****************************************");
		}
		
		bubbleSort(arr2);

		System.out.println("Number of comparisons: " + comparisons);
		System.out.println("Number of swaps: " + swaps);
		System.out.println("Total operations: " + totalOperations);

		// Analyzing Big O based on total operations
		ratio = (double) totalOperations / arr2.length;
		System.out.println("The Ratio: " + ratio);
		if (ratio <= 1) {
			System.out.println("The observed Big O notation is close to O(n)");
		} else {
			System.out.println("The observed Big O notation is close to O(n^2)");
		}
		
		
		bubbleSort(arr3);

		System.out.println("Number of comparisons: " + comparisons);
		System.out.println("Number of swaps: " + swaps);
		System.out.println("Total operations: " + totalOperations);

		// Analyzing Big O based on total operations
		ratio = (double) totalOperations / arr3.length;
		System.out.println("The Ratio: " + ratio);
		if (ratio <= 1) {
			System.out.println("The observed Big O notation is close to O(n)");
		} else {
			System.out.println("The observed Big O notation is close to O(n^2)");
		}


	}
}
