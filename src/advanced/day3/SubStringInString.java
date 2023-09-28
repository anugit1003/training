package advanced.day3;
import java.util.Scanner;

public class SubStringInString {
	public static void findSubstring(String str) {
		for(int i=0;i<str.length();i++) {
			for(int j=i+1;j<=str.length();j++) {
				System.out.println(str.substring(i, j));
			}
		}
		
	}

	public static void main(String[] args) {
		Scanner scn=new Scanner(System.in);
		System.out.println("Enter the string:");
		String str=scn.nextLine();
		scn.close();
		findSubstring(str);
		

	}

}
