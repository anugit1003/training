package javahack;

import java.util.Scanner;

public class IntStrPalindrome {
	
	public static void palindrome(String str) {		
		boolean flag = true;
		char arr[] = str.toCharArray();	
		int n = arr.length;
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

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		System.out.println("Enter a string");
		String str = scn.nextLine();
			
		scn.close();	
		palindrome(str);
	}

}
