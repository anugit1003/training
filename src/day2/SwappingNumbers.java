package day2;

import java.util.Scanner;

public class SwappingNumbers {

	public void swapnum(int num1, int num2) {

		num1 = num1 - num2;
		num2 = num1 + num2;
		num1 = num2 - num1;

		System.out.println("Values after swapping :" + num1 + " ," + num2);

	}

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter two numbers as integers:");

		int firstNumber = scanner.nextInt();
		int secondNumber = scanner.nextInt();
		scanner.close();
		System.out.println("Values before swaping :" + firstNumber + " ," + secondNumber);

		SwappingNumbers sw = new SwappingNumbers();
		sw.swapnum(firstNumber, secondNumber);

	}

}
