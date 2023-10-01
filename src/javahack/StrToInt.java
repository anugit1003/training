package javahack;

import java.util.Scanner;

public class StrToInt {
	public static void convertToStr(int i) {
		int x = 100;
		String str = String.valueOf(i);
		System.out.println("Converting integer to String " + (str + x));
	}

	public static void convertToInt(String str) {
		int y = 100;
		int i = Integer.parseInt(str);
		Integer x = Integer.valueOf(str);
		System.out.println("Converting String to int:" + (i + y));
		System.out.println("Converting String to Wrapper Integer:" + (x + y));
	}

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		System.out.println("Enter two positive numerical values:");
		int i = scn.nextInt();
		String str = scn.next();
		scn.close();
		convertToStr(i);
		convertToInt(str);
	}

}
