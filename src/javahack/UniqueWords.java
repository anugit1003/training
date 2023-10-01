package javahack;

import java.util.Scanner;

public class UniqueWords {

	public static void displayUniqueWords(String str) {

		String words[] = str.split("\\s+");
		String uniqueWords[] = new String[words.length];
		for (int i = 0; i < words.length; i++) {
			if (!uniqueWords(words[i], uniqueWords)) {
				System.out.println(words[i]);
				uniqueWords[i] = words[i];
			}
		}
	}

	public static boolean uniqueWords(String word, String arr[]) {
		boolean isDuplicate = false;
		for (int i = 0; i < arr.length; i++) {
			if (word.equals(arr[i])) {
				isDuplicate = true;
			}
		}
		return isDuplicate;
	}

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		System.out.println("Enter the string");
		String str = scn.nextLine();
		scn.close();
		displayUniqueWords(str);
	}

}
