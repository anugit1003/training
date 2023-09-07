package com.tekarch.assignments;

import java.util.Scanner;

public class RomanNumbers {

	public int displayNumbers(char chr) {

		int num = -1;
		switch (chr) {
		case 'I':
			num = 1;
			break;
		case 'V':
			num = 5;
			break;
		case 'X':
			num = 10;
			break;
		case 'L':
			num = 50;
			break;
		case 'C':
			num = 100;
			break;
		case 'D':
			num = 500;
			break;
		case 'M':
			num = 1000;
			break;

		}
		return num;
	}

	public int romanToInt(String str) {
		int sum = 0;
		for (int i = 0; i < str.length(); i++) {

			
			int firstIntRoman = displayNumbers(str.charAt(i));
			int secondIntRoman = 0;
			int lastChar = str.length() - 1;
			

			if (i != lastChar) {
				secondIntRoman = displayNumbers(str.charAt(i + 1));

				if (firstIntRoman >= secondIntRoman) {
					sum = sum + firstIntRoman;
				} else {
					sum = sum - firstIntRoman;

				}
			
			} else {
				sum = sum + firstIntRoman;
			}

		}

		return sum;
	}

	public static void main(String[] args) {

		Scanner scn = new Scanner(System.in);
		System.out.println("Enter a number in Roman values");
		String str = scn.nextLine();
		scn.close();
		RomanNumbers rn = new RomanNumbers();

		int num = rn.romanToInt(str);

		System.out.println("the value of roman number is:" + num);

	}

}
