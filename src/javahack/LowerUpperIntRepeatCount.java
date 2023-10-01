package javahack;

import java.util.Scanner;

public class LowerUpperIntRepeatCount {

	private static final char UNUSED_CHAR = '*';

	public static void displayFrequency(String str) {
		int[] array = new int[str.length()];
		char[] cstring = str.toCharArray();
		for (int i = 0; i < str.length(); i++) {
			array[i] = 1;
			for (int j = i + 1; j < str.length(); j++) {
				if (cstring[i] == cstring[j]) {					
					array[i]++;
					cstring[j] = UNUSED_CHAR;
				}
			}
		}
		int lowerCaseCount = 0;
		int upperCaseCount = 0;
		int digitCount = 0;
		for (int i = 0; i < array.length; i++) {
			if (cstring[i] != UNUSED_CHAR) {
				if(array[i] > 1) {
					if (Character.isLowerCase(cstring[i])) {
						lowerCaseCount++;
					} else if (Character.isUpperCase(cstring[i])) {
						upperCaseCount++;
					} else if (Character.isDigit(cstring[i])) {
						digitCount++;
					}
				}
			}
		}
		System.out.printf("Total number of repeated lower case char count: %d%n", lowerCaseCount);
		System.out.printf("Total number of repeated upper case char count: %d%n", upperCaseCount);
		System.out.printf("Total number of repeated digit count: %d%n", digitCount);
	}

	public static void main(String[] args) {

		Scanner scn = new Scanner(System.in);
		System.out.println("Enter the string");
		String str = scn.nextLine();
		scn.close();
		displayFrequency(str);

	}
}
