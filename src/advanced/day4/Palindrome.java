package advanced.day4;
import java.util.Scanner;

public class Palindrome {

	public static void main(String[] args) {
		Scanner scn =new Scanner(System.in);
		System.out.println("Enter the string");
		String str=scn.nextLine();
		scn.close();
		char ch[]=str.toCharArray();
		int n= ch.length;
		boolean flag=true;
		for(int i=0;i<n/2;i++) {
			if(ch[i]!=ch[n-1-i]) {
				flag=false;
				break;
			}
		}
if(flag==false) {
	System.out.println("Not a palindrome");
}
else
	System.out.println("palindrome");
	}

}
