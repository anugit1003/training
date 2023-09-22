package advanced.day3;
import java.util.Scanner;

public class StrToChar {

	public static void main(String[] args) {
		Scanner scn=new Scanner(System.in);
		System.out.println("Enter the string:");
		String str=scn.nextLine();
		scn.close();
		
		char ch[]=str.toCharArray();
		for(int i=0;i<ch.length;i++) {
			System.out.println(ch[i]);
		}
	}

}
