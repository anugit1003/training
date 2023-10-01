package javahack;

import java.util.Scanner;

public class LowerUpperIntCount {

	public static void displayCount(String str) {
		
		char[] cstring = str.toCharArray();
		int lowerCaseCount = 0;
		int upperCaseCount = 0;
		int digitCount = 0;
		for (int i = 0; i < str.length(); i++) {
			
			if (Character.isLowerCase(cstring[i])) {
				lowerCaseCount++;
			} else if (Character.isUpperCase(cstring[i])) {
				upperCaseCount++;
			} else if (Character.isDigit(cstring[i])) {
				digitCount++;
			}

		}
		System.out.printf("Lower case count: %d%n", lowerCaseCount);
		System.out.printf("Upper case count: %d%n", upperCaseCount);
		System.out.printf("Digit count: %d%n", digitCount);
	}

	public static void main(String[] args) {

		Scanner scn = new Scanner(System.in);
		System.out.println("Enter the string");
		String str = scn.nextLine();
		scn.close();
		displayCount(str);

	}
}
