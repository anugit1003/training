package com.tekarch.assignments;

import java.util.Scanner;

public class EndOfFile {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		String str = null;
		//System.out.println("Enter the number of strings:");
		//int t = Integer.parseInt(scn.nextLine());
		int i= 0;
		while (scn.hasNext()){

			System.out.println("Enter the strings:");
			 str = scn.nextLine();
			 i++;
			 System.out.println(i+" "+str);
		}
		
		scn.close();
	}

}
