package javahack;

import java.util.Scanner;

public class ReverseWordInString {

	public void reverseWord(String str) {

		String revSentence = "";
		String words[] = str.split(" ");
		for (int i = 0; i < words.length; i++) {
			String reversedWord = reversestring(words[i]);
			revSentence = revSentence + reversedWord + " ";
		}
		System.out.println(revSentence);
	}

	public String reversestring(String originalStr) {

		String reversedStr = "";
		for (int i = 0; i < originalStr.length(); i++) {
			reversedStr = originalStr.charAt(i) + reversedStr;
		}
		return reversedStr;
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
