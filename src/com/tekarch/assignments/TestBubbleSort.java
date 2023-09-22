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
					int temp = arr[j];  // --> one single temp variable used , hence space complexity is O(n)
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

		int sortedArray[] = { 10, 20, 30, 40, 50 }; // Already sorted - Best Case
		int unSortedArray[] = { 50, 40, 30, 20, 10 }; // Not sorted - Worst Case
		int randomArray[] = { 901, 34, 603, 501, 401 }; // Randomly sorted
		
		System.out.println("Original array: Best Case");
        for (int i=0; i < sortedArray.length; i++)
            System.out.print(sortedArray[i] + " ");
        
        System.out.println("");
		bubbleSort(sortedArray);
		
		System.out.println("Sorted array:");
        for (int i=0; i < sortedArray.length; i++)
            System.out.print(sortedArray[i] + " ");
        
        System.out.println("");

		System.out.println("Number of comparisons: " + comparisons);
		System.out.println("Number of swaps: " + swaps);
		System.out.println("Total operations: " + totalOperations);

		// Analyzing Big O based on total operations
		double ratio = (double) totalOperations / sortedArray.length;
		//System.out.println("The Ratio: " + ratio);
		if (ratio <= 1) {
			System.out.println("The observed Big O notation is close to O(n)");
		
		} else {
			System.out.println("The observed Big O notation is close to O(n square)");
		
		}
		
		System.out.println("Original array: Worst Case");
        for (int i=0; i < unSortedArray.length; i++)
            System.out.print(unSortedArray[i] + " ");
        
        System.out.println("");
		bubbleSort(unSortedArray);
		
		System.out.println("Sorted array:");
        for (int i=0; i < unSortedArray.length; i++)
            System.out.print(unSortedArray[i] + " ");
        
        System.out.println("");

		System.out.println("Number of comparisons: " + comparisons);
		System.out.println("Number of swaps: " + swaps);
		System.out.println("Total operations: " + totalOperations);

		// Analyzing Big O based on total operations
		ratio = (double) totalOperations / unSortedArray.length;
		//System.out.println("The Ratio: " + ratio);
		if (ratio <= 1) {
			System.out.println("The observed Big O notation is close to O(n)");

		} else {
			System.out.println("The observed Big O notation is close to O(n square)");
			
		}
		
		
		System.out.println("Original Random array: Worst Case");
        for (int i=0; i < randomArray.length; i++)
            System.out.print(randomArray[i] + " ");
        
        System.out.println("");
		bubbleSort(randomArray);
		
		System.out.println("Sorted array:");
        for (int i=0; i < randomArray.length; i++)
            System.out.print(randomArray[i] + " ");
        
        System.out.println("");
		System.out.println("Number of comparisons: " + comparisons);
		System.out.println("Number of swaps: " + swaps);
		System.out.println("Total operations: " + totalOperations);

		// Analyzing Big O based on total operations
		ratio = (double) totalOperations / randomArray.length;
		//System.out.println("The Ratio: " + ratio);
		if (ratio <= 1) {
			System.out.println("The observed Big O notation is close to O(n)");
		} else {
			System.out.println("The observed Big O notation is close to O(n square)");
		}


	}
}
