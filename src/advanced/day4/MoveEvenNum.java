package advanced.day4;

import java.util.Scanner;

public class MoveEvenNum {

	public static void main(String[] args) {
		int i = 0;

		Scanner scn = new Scanner(System.in);
		System.out.println("Enter the array size:");
		int size = scn.nextInt();
		int arr[] = new int[size];
		System.out.println("Enter the array elements:");
		for (i = 0; i < arr.length; i++) {
			arr[i] = scn.nextInt();
		}
		scn.close();
		int evenNoEncountered = 0;

		for (int j = 0; j < arr.length; j++) {

			if (arr[j] % 2 == 0) {

				evenNoEncountered++;
				int temp = arr[j];
				arr[j] = arr[evenNoEncountered - 1];
				arr[evenNoEncountered - 1] = temp;
			}
		}

		System.out.println("Resultant array is:");
		for (int j = 0; j < arr.length; j++) {
			System.out.print(arr[j] + " ");
		}

	}

}
