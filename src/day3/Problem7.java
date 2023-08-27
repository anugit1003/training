package day3;

import java.util.Scanner;

public class Problem7 {
	
	
	public static void main(String args[]) {

		Scanner scn = new Scanner(System.in);
		System.out.println("Enter the name of the person,age,Gender,Address respectively:");
		String name = scn.nextLine();
		int age = Integer.parseInt(scn.nextLine());
		String gen = scn.nextLine();
		String address = scn.nextLine();
		scn.close();
		
		System.out.println("Name:" + name);
		System.out.println("Age:" + age);
		System.out.println("Gender:" + gen);
		System.out.println("Address:" + address);
		
		
		String myName = "1234567";
		int x = Integer.parseInt(myName);
		char firstChar = myName.charAt(0);

	}

}
