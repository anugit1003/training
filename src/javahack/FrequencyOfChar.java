package javahack;

import java.util.Scanner;

public class FrequencyOfChar {

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
		System.out.println("The characters and their frequencies:");
		for (int i = 0; i < array.length; i++) {
			if (cstring[i] != UNUSED_CHAR) {
				System.out.println(cstring[i] + " " + array[i]);
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
