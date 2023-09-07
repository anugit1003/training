package com.tekarch.assignments;

import java.util.Scanner;

public class DigitsToString {

	public static void printNumber(int digit) {
		switch (digit) {
		case 0:
			System.out.print("Zero ");
			break;
		case 1:
			System.out.print("One ");
			break;
		case 2:
			System.out.print("Two ");
			break;
		case 3:
			System.out.print("Three ");
			break;
		case 4:
			System.out.print("Four ");
			break;
		case 5:
			System.out.print("Five ");
			break;
		case 6:
			System.out.print("Six ");
			break;
		case 7:
			System.out.print("Seven ");
			break;
		case 8:
			System.out.print("Eight ");
			break;
		case 9:
			System.out.print("Nine ");
			break;

		}
	}

	public void printWord(String N) {
		int num;
		for (int i = 0; i < N.length(); i++) {
			char a = N.charAt(i);
			num = Character.getNumericValue(a);
			printNumber(num);
		}

	}

	public static void main(String[] args) {
		DigitsToString dst = new DigitsToString();

		Scanner scn = new Scanner(System.in);
		System.out.println("Enter any number");
		String str = scn.nextLine();
		scn.close();

		dst.printWord(str);

	}

}
