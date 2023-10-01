package advanced.day3;

import java.util.Scanner;

public class WordsInString {
	
	public int countWords(String str) {

		String words[] = str.split("\\s+");

		return words.length;

	}

	public static void main(String[] args) {
		WordsInString wst = new WordsInString();
		Scanner scn = new Scanner(System.in);
		System.out.println("Enter the string");
		String str = scn.nextLine();
		scn.close();
		//wst.countWords(str);
		System.out.println("Number of words in given string are:" + wst.countWords(str));

	}

}
