package com.tekarch.assignments;

public class Factorial {

	public static void main(String[] args) {

		int i = 1;
		int y = 1;
		int m = 1;
		int n = 5;

		/* comment is what is this */
		for (i = 1; i <= 5; i++) {
			y = y * i;

		}

		System.out.println("Factorial of 5 is:" + y);

		while (n >= 1) {

			m = m * n;
			n--;
		}
		System.out.println("factorial of 5 using while loop = " + m);

	}

}
