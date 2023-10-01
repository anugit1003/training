package javahack;

import java.util.Scanner;

public class InputType {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		System.out.println("Enter the type of input(for example:string,integer,boolean");
		String inputType = scn.next();
		if (inputType.toLowerCase().equals("string")) {
			System.out.println("Enter a string:");
			String inputString = scn.next();
			System.out.println("User enetered: " + inputString);
		} else if (inputType.toLowerCase().equals("integer")) {
			System.out.println("Enter the integer");
			if (scn.hasNextInt()) {
				int inputNum = scn.nextInt();
				System.out.println("user entered the integer : " + inputNum);
			} else {
				System.err.println("Invalid input");
			}
		} else if (inputType.toLowerCase().equals("boolean")) {
			System.out.println("Enter the boolean value(true/false)");
			if (scn.hasNextBoolean()) {
				boolean inputBool = scn.nextBoolean();
				System.out.println("user entered the boolean : " + inputBool);
			}else {
				System.err.println("Invalid input");
			}
		}

		else {
			System.err.println("invalid entry");
		}

	}

}
