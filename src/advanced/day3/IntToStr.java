package advanced.day3;
import java .util.Scanner; 

public class IntToStr {

	public static void main(String[] args) {
		int x=200;
		Scanner scn = new Scanner(System.in);
		System.out.println("Enter the value:");
		int i= scn.nextInt();
		scn.close();
		String str=String.valueOf(i);
		System.out.println("Testing the value with int:"+(i+x));
		System.out.println("Testing the value with String:"+(str+x));
	}

}
