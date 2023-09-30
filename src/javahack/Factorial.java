package javahack;

import java.util.Scanner;

public class Factorial {

	public long factorial(long f) {
		long i;
		long y = 1;

		/* Factorial using a for loop */
		for (i = 1; i <= f; i++) {
			y = y * i;
			System.out.printf("Fatorial: %d%n", y);

		}
		System.out.printf("Fatorial value : %d%n", y);
		return y;
	}

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		System.out.println("Enter a positive number :");
		long fac = scn.nextLong();
		scn.close();
		if (fac < 0) {
			System.err.println("Enter a positive number");
			System.exit(-1);
		}
		Factorial f = new Factorial();
		f.factorial(fac);

	}

}
