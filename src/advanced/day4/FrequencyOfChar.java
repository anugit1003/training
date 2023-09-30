package advanced.day4;
import java.util.Scanner;

public class FrequencyOfChar {

	public static void main(String[] args) {
		
		Scanner scn=new Scanner(System.in);
		System.out.println("Enter the string");
		String str=scn.nextLine();
		int[] array = new int[str.length()];
		char[] cstring =str.toCharArray();
		for(int i=0;i<str.length();i++) {
			array[i]=1;
			for(int j=i+1;j<str.length();j++) {
				if(cstring[i]==cstring[j]) {
					array[i]++;
					
					cstring[j]='0';
					scn.close();
				}
				
			}
			
		}
		System.out.println("The characters and their frequencies:");
		for(int i=0;i<array.length;i++) {
			if(cstring[i]!='0') {
				System.out.println(cstring[i]+" "+array[i]);
				
			}
		}
				
		

	}

}
