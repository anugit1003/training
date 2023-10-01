package javahack;

import java.util.Scanner;

public class DisplayDuplicateChar {

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
		System.out.println("The duplicate characters in the given string:");
		for (int i = 0; i < array.length; i++) {
			if (cstring[i] != UNUSED_CHAR) {
				if (array[i] > 1) {
					System.out.println(cstring[i]);
				}
			}
		}
	}

	public static void main(String[] args) {

		Scanner scn = new Scanner(System.in);
		System.out.println("Enter the string");
		String str = scn.nextLine();
		scn.close();
		displayFrequency(str);

	}
}
