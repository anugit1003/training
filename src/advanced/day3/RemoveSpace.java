package advanced.day3;
import java.util.Scanner;

public class RemoveSpace {
	String str;
	String res="";
	public void builtInFunc1(String str) {
		//using string class built in function
				str=str.replaceAll("\\s", "");
				System.out.println(str);
		
	}
	
	public void builtInFunc2(String str) {
		//using Character class built in function
		for(int i=0;i<str.length();i++) {
			char ch=str.charAt(i);
			if(!Character.isWhitespace(ch)) {
				res=res+ch;
				
			}
		}
		
		System.out.println(res);
	}

	public static void main(String[] args) {
		Scanner scn=new Scanner(System.in);
		RemoveSpace rs =new RemoveSpace();
		System.out.println("Enter the string");
		String str=scn.nextLine();
		scn.close();
		rs.builtInFunc1(str);
		rs.builtInFunc2(str);
		
		

	}

}
