package com.tekarch.assignments;

import java.util.Scanner;


public class CompareThreeNumbers {

	public void findLargestNumber(int num1, int num2, int num3) {

		// if condition to check if any two are equal you exit with a message
		if (num1 == num2 || num1 == num3 || num2 == num3) {

			System.out.println("All 3 integers must be different");
			System.exit(-1);
		}

		if (num1 > num2 && num1 > num3) {

			System.out.println("The greatest number is :" + num1);

			if (num2 > num3) {
				System.out.println("Second biggest number is :" + num2);
				System.out.println("Third biggest number is :" + num3);
			} else {
				System.out.println("Second biggest number is :" + num3);
				System.out.println("Third biggest number is :" + num2);
			}

		}
		if (num2 > num1 && num2 > num3) {

			System.out.println("The greatest number is :" + num2);

			if (num1 > num3) {
				System.out.println("Second biggest number is :" + num1);
				System.out.println("Third biggest number is :" + num3);

			} else {
				System.out.println("Second biggest number is :" + num3);
				System.out.println("Third biggest number is :" + num1);

			}

		}

		if (num3 > num1 && num3 > num2) {

			System.out.println("The greatest number is :" + num3);
			if (num1 > num2) {
				System.out.println("Second biggest number is :" + num1);
				System.out.println("Third biggest number is :" + num2);

			} else {
				System.out.println("Second biggest number is :" + num2);
				System.out.println("Second biggest number is :" + num1);

			}
		}

	}

	public static void main(String args[]) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the three numbers:");

		int number1 = scanner.nextInt();
		int number2 = scanner.nextInt();
		int number3 = scanner.nextInt();

		scanner.close();
		CompareThreeNumbers cn = new CompareThreeNumbers();
		cn.findLargestNumber(number1, number2, number3);

	}

}
