package day3;

import java.util.Scanner;

public class Problem6 {
	int i;
	float f;
	double d;

	public Problem6(int i, float f, double d) {
		this.i = i;
		this.f = f;
		this.d = d;

	}

	public double calSum() {
		double sum = i + f + d;
		return sum;
	}

	public double calAvg() {
		double avg = (i + f + d) / 3;
		return avg;
	}

	public static void main(String[] args) {

		Scanner scn = new Scanner(System.in);
		System.out.println("Enter an interger,float,double numbers respectively ");
		int i = scn.nextInt();
		float f = scn.nextFloat();
		double d = scn.nextDouble();
		scn.close();
		System.out.println("the three numbers are :" + i + " ," + f + " ," + d);

		Problem6 pro = new Problem6(i, f, d);
		pro.calSum();
		pro.calAvg();

		System.out.println("The sum of three numbers entered is:" + pro.calSum());
		System.out.println("The average of three numbers is :" + pro.calAvg());
		
		
				
		

	}

}
