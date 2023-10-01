package javahack;
import java.util.Scanner;

public class RemoveGivenChar {
	
	public static void removeChar(String str,char charToRemove) {
		String newStr = "";
		System.out.println("Original String: " + str);
		
		for(int i=0;i<str.length();i++) {
			
			if(str.charAt(i)!= charToRemove) {
				newStr = newStr + str.charAt(i);
			}
			
		}
		System.out.println(newStr);
	}

	public static void main(String[] args) {
		
		Scanner scn = new Scanner(System.in);
		System.out.println("Enter the string");
		String str = scn.nextLine();
		System.out.println("Enter the character to be removed");
		String singleString = scn.nextLine();
		scn.close();
		if(singleString.length() > 1 ) {
			System.err.println("Enter the single character to be removed");
			System.exit(-1);
		}
		
		removeChar(str, singleString.charAt(0));
	}

}
