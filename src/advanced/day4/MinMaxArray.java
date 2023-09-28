package advanced.day4;

import java.util.Scanner;

public class MinMaxArray {

	public void findMax(int arr[]) {
		int max = 0;
		max = arr[0];
		for (int i = 1; i < arr.length; i++) {
			if (arr[i] > max) {
				max = arr[i];
			}
		}
		System.out.println("The maximum value is" + max);

	}

	public void findMin(int arr[]) {
		int min= 0;
		min = arr[0];
		for (int i = 1; i < arr.length; i++) {
			if (arr[i] < min) {
				min = arr[i];
			}
		}
		System.out.println("The minimum value is" + min);

	}

	public static void main(String[] args) {
		MinMaxArray min=new MinMaxArray();
		Scanner scn = new Scanner(System.in);
		
		System.out.println("Enter th size of the array:");
		int size = scn.nextInt();
		int arr[] = new int[size];
		System.out.println("Enter the array elements");
		for (int i = 0; i < arr.length; i++) {
			arr[i] = scn.nextInt();
		}
		scn.close();
		min.findMax(arr);
		min.findMin(arr);
		
		
	}
}
