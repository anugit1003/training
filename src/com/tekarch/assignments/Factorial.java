package com.tekarch.assignments;

import java.util.Scanner;

public class Factorial {

	public int factorial(int f) {
		int i;
		int y = 1;
		int m = 1;

		/* Factorial using a for loop */
		for (i = 1; i <= f; i++) {
			y = y * i;

		}

		System.out.println("Factorial of a number using For loop:" + y);

		// Factorial of a number using while loop

		while (f >= 1) {

			m = m * f;
			f--;

		}

		System.out.println("factorial of a number using While loop: " + m);
		return m;
	}

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);

		System.out.println("Enter a number :");

		while (!scn.hasNextInt()) {
			scn.next();
			System.out.println("Enter integers only");
		}

		int fac = scn.nextInt();
		scn.close();

		Factorial f = new Factorial();

		f.factorial(fac);

	}

}
