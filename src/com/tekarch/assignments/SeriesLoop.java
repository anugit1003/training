package com.tekarch.assignments;
import java.util.Scanner;

public class SeriesLoop {

	public static void main(String[] args) {
		Scanner scn= new Scanner(System.in);
		System.out.println("enter the query number:");
		
		int t=scn.nextInt();
		System.out.println("Enter the values of a and b and n:");
		for(int j=0;j<t;j++) {
		int a= scn.nextInt();
		int b= scn.nextInt();
		int n= scn.nextInt();
		
		int i;
		double res;
		
		
		
		 res=(a+Math.pow(2, 0)*b);
		 int value=(int)res;
		 System.out.print(value);
		 
		for( i=1;i<=n-1;i++) {
			
		double x= Math.pow(2, i)*b;
		res =res+ x;
		int value1=(int)res;
		System.out.print(" "+value1);
		}
		
		}
		
		scn.close();

	}

}
