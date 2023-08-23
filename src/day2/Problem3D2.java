package day2;

import java.util.Scanner;

import com.tekarch.assignments.CompareNumbers;

public class Problem3D2 {

	public static void main(String[] args) {
		
		
		Scanner inputNumbers = new Scanner(System.in);
		System.out.println("Enter the three numbers:");

		int number1 = inputNumbers.nextInt();
		int number2 = inputNumbers.nextInt();
		int number3 = inputNumbers.nextInt();

		if (number1 > number2 && number1 > number3) {

			System.out.println("The greatest number is :" + number1);
			
			if(number2 > number3){
				System.out.println("Second biggest number is :"+ number2);
				System.out.println("Third biggest number is :"+ number3);
			}
			else {
				System.out.println("Second biggest number is :"+ number3);
				System.out.println("Third biggest number is :"+ number2);
			}
			
		} if (number2 > number1 && number2 > number3) {

			System.out.println("The greatest number is :" + number2);
			if(number1> number3) {
				System.out.println("Second biggest number is :" +number1);
				System.out.println("Third biggest number is :" +number3);
				
			}
			else {
				System.out.println("Second biggest number is :" +number3);
				System.out.println("Third biggest number is :" +number1);
				
			}
			
		} 
		
		
		 if (number3 > number1 && number3 > number2) {

			System.out.println("The greatest number is :" + number3);
			if(number1 >number2) {
				System.out.println("Second biggest number is :"+ number1);
				System.out.println("Third biggest number is :" + number2);
				
			}
			else {
				System.out.println("Second biggest number is :"+ number2);
				System.out.println("Second biggest number is :"+ number1);
				
			}
		}
		
		inputNumbers.close();
		
		CompareNumbers obj =new CompareNumbers();
		int x = obj.largestNum(10, 2 ,3);
		
		System.out.println(x);
		
		
		
	}

}
