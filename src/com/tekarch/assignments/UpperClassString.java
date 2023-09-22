package com.tekarch.assignments;

import java.util.Scanner;

public class UpperClassString {

	public static void main(String[] args) {
		 Scanner scn = new Scanner(System.in);
		 System.out.println("Enter the sentence:");
		 String str = scn.nextLine();
		
		 
		System.out.println("Before capitalizing: " + str);
		char[] mychar = str.toCharArray();
		for (int i = 0; i < mychar.length; i++) {

			mychar[0] = Character.toUpperCase(mychar[0]);
			
			if (mychar[i] == ' ') {
				mychar[i + 1] = Character.toUpperCase(mychar[i + 1]);
				
			}
			
			str = String.valueOf(mychar);
			
			
		}
		System.out.println("After capitalization " + str);

	}
}
