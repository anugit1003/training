package advanced.day3;
//import java.util.Scanner;

public class RemoveGivenChar {
	
	public static void removeChar(String str,char ch) {
		String newStr = "";
		System.out.println(str);
		
		for(int i=0;i<str.length();i++) {
			
			if(str.charAt(i)!= ch) {
				newStr = newStr + str.charAt(i);
			}
			
		}
		System.out.println(newStr);
	}

	public static void main(String[] args) {
		
		String str= "We live in Virginia";
		char ch='i';
		removeChar(str, ch);

	}

}
