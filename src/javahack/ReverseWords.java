package javahack;

import java.util.Scanner;

public class ReverseWords {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		System.out.println("Enter the string");
		String str = scn.nextLine();
		String words[] = str.split(" ");
		String rev = "";
		for (int i = 0; i < words.length; i++) {
			if (i == words.length - 1)
				rev = words[i] + rev;
			else
				rev = " " + words[i] + rev;

		}
		System.out.println(rev);
		scn.close();
	}

}
