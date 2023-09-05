package com.tekarch.assignments;

import java.util.Scanner;

public class Reversewordinstring {

	public void reverseWord(String str) {
		ReverseString rstr = new ReverseString();
		String revSentence="";
		String words[] = str.split(" ");
		
		for (int i = 0; i < words.length; i++) {
			//System.out.println("the split words:" + words[i]);
			String reversedWord = rstr.reversestring(words[i]);
			System.out.println("Reversed string :" + reversedWord);
			
			revSentence= revSentence + reversedWord+ " ";
			
			

		}
		System.out.println(revSentence);
		
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the string ");
		String originalstring = scanner.nextLine();
		scanner.close();

		Reversewordinstring rs = new Reversewordinstring();
		rs.reverseWord(originalstring);

	}

}
