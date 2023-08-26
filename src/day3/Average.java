package day3;

import java.util.Scanner;

public class Average {
	float a;
	float b;
	float c;

	public Average(float num1, float num2, float num3) {
		a = num1;
		b = num2;
		c = num3;
	}

	public float calcAvg() {

		float d = (a + b + c) / 3;
		return d;
	}

	public static void main(String[] args) {

		Scanner inputNum = new Scanner(System.in);
		System.out.println("Enter the three numbers");

		float a = inputNum.nextFloat();
		float b = inputNum.nextFloat();
	    float c = inputNum.nextFloat();
		inputNum.close();

		Average avg = new Average(a, b, c);
		avg.calcAvg();

		System.out.println("The avarage of three numbers is:" + avg.calcAvg());

	}

}
