package day2;
import java.util.Scanner; 

public class Problem4D2 {

	public static void main(String[] args) {
		
		Scanner inputNumbers = new Scanner(System.in); 
		System.out.println("Enter two numbers as integers:");
		
		int a = inputNumbers.nextInt();
		int b = inputNumbers.nextInt();
		System.out.println("Values before swaping :" +a + " ,"+b);
		
		a=a-b;
		b=a+b;
		a=b-a;
		
		System.out.println("Values after swapping :" +a + " ,"+b);
		
		inputNumbers.close();

	}

}
