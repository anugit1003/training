package advanced.day3;
import java.util.Scanner;

public class StrToInt {

	public static void main(String[] args) {
		int y=100;
		Scanner scn=new Scanner(System.in);
		System.out.println("Enter the value:");
		
		String str= scn.next();
		scn.close();
		int i=Integer.parseInt(str);
		Integer x=Integer.valueOf(str);
		System.out.println("Testing the value of int:"+(i+y));
		System.out.println("Testing the value of Integer:"+(y+x));
		System.out.println("Testing the value of String:"+(str+y));

	}

}
