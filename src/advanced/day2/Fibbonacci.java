package advanced.day2;
import java.util.Scanner;

public class Fibbonacci {
	
	public int Fibbonaci(int N) {

	int num1 = 0;
	int num2 = 1;
	int num3 = 0;
	System.out.println(num1);
	System.out.println(num2);

	for
	(int i = 0;i<N;i++)
	{
		 num3 = num1 + num2;
		System.out.println(num3);
		num1 = num2;
		num2 = num3;
		
		
		

	}
	return num3;
	
	}
	

	public static void main(String[] args) {
		
		Scanner scn = new Scanner(System.in);
		System.out.println("Enter the size for the Fibbonacci series:");
		int N= scn.nextInt();
		scn.close();
		Fibbonacci fb= new Fibbonacci();
		fb.Fibbonaci(N);

	}
}
