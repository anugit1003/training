package javahack;

import java.util.Arrays;
import java.util.Scanner;

public class BinarySearch {
	
	public static void binarySearch(int searchValue, int arr[]) {
		int low = 0;
		int high = arr.length - 1;
		int mid =0;
		
		while (low <= high) {
			mid = (low + high) / 2;			
			if (arr[mid] == searchValue) {
				System.out.println("Element is present " + arr[mid]);
				break;
			} else if (arr[mid] > searchValue) {
				high = mid - 1;
			}else if(arr[mid] < searchValue){
				low = mid + 1;
			}
			if (low > high)
				System.out.println("Element not present in the list");
		}
	}

	public static void main(String[] args) {

		int key = 0;
		Scanner scn = new Scanner(System.in);
		System.out.println("Enter the size of the array");
		int n = scn.nextInt();
		int arr[] = new int[n];
		System.out.println("Enter the array elements in ");
		for (int i = 0; i < arr.length; i++) {
			arr[i] = scn.nextInt();
		}
		System.out.println("Enter the key value");
		key = scn.nextInt();
		scn.close();
		Arrays.sort(arr);
		//System.err.println("elements in ascending order"+arr);
		binarySearch(key, arr);
	}

}
