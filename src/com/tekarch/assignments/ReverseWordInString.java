package com.tekarch.assignments;

import java.util.Scanner;

public class ReverseWordInString {

	public void reverseWord(String str) {
		ReverseString rstr = new ReverseString();
		String revSentence = "";
		String words[] = str.split(" ");

		for (int i = 0; i < words.length; i++) {

			String reversedWord = rstr.reversestring(words[i]);

			revSentence = revSentence + reversedWord + " ";

		}
		System.out.println(revSentence);

	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the string ");
		String originalstring = scanner.nextLine();
		scanner.close();

		ReverseWordInString rs = new ReverseWordInString();
		rs.reverseWord(originalstring);

	}

}
