package advanced.jardemo;

import java.util.Scanner;

public class CalculatorDemo {
	
	public double add(double x, double y) {
		
		return (x + y);
	}
	
	public double sub(double x, double y) {
		
		return (x-y);
	}
	
	public double multiply(double x, double y) {
		
		return (x*y);
	}
	
	public double divide(double x, double y) {
		
		return (x/y);
	}
	
	

	public static void main(String[] args) {
		
		CalculatorDemo calculator = new CalculatorDemo();
		
		System.out.println("Select an option and hit enter:");
		System.out.println("1. Add two numbers");
		System.out.println("2. Subtract two numbers");
		System.out.println("3. Multiply two numbets");
		System.out.println("4. Divide two numbers");
		Scanner scn = new Scanner(System.in);
		int option = scn.nextInt();
		
		if(option < 1 || option > 4){
			System.err.println("Select a valid option");
			System.exit(option);
		}
		
		System.out.println("Enter two numbers one by one and hit enter:");
		
		double x = scn.nextDouble();
		double y = scn.nextDouble();
		
		scn.close();
		
		if(option == 1) {
			System.out.println(calculator.add(x, y));
		}else if(option == 2){
			System.out.println(calculator.sub(x, y));
		}else if(option == 3) {
			System.out.println(calculator.multiply(x, y));
		}else {
			//option 4
			System.out.println(calculator.divide(x, y));
			
		}
		
	}

}
