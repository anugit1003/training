package com.tekarch.assignments;

import java.util.Scanner;

public class ReverseString {
	String originalStr;

	public String reversestring(String originalStr) {

		String reversedStr = "";
		for (int i = 0; i < originalStr.length(); i++) {
			reversedStr = originalStr.charAt(i) + reversedStr;
		}

		return reversedStr;

	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the string value");
		String str1 = sc.nextLine();

		sc.close();

		System.out.println("Original string: " + str1);

		ReverseString strObject = new ReverseString();

		String reversedS = strObject.reversestring(str1);
		System.out.println("Reversed string: " + reversedS);

	}

}
