package javahack;

import java.util.Scanner;

public class IntPalindrome {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		System.out.println("Enter the array size:");
		int size= scn.nextInt();
		int arr[] = new int[size];
		
		System.out.println("Enter the array elements:");
		
		for(int i=0;i<arr.length;i++) {
			arr[i]=scn.nextInt();
		}
		scn.close();		
		int n = arr.length;
		boolean flag = true;
		for (int i = 0; i < n / 2; i++) {
			if (arr[i] != arr[n - 1 - i]) {
				flag = false;
				break;
			}
		}
		if (!flag) {
			System.out.println("Not a palindrome");
		} else
			System.out.println("palindrome");
	}

}
