package advanced.day2;
import java.util.Scanner;

public class Leapyear {
	
	public static void isleapyear(int year) {
		boolean is_leap_year=false;
		
		if(year % 4==0) {
			is_leap_year=true;
			
			if(year % 100==0) {
				if(year % 400==0)
					is_leap_year=true;
				else
					is_leap_year=false;	
			}
			
		}else
			is_leap_year=false;
		
			
			if(is_leap_year) {
				System.out.println(year+"Is leap year");
			}
			else {
				System.out.println(year+"is not leap year");
			}
		
		
		
	}

	public static void main(String[] args) {
		Scanner scn=new Scanner(System.in);
		System.out.println("Enter the year:");
		int n=scn.nextInt();
		scn.close();
		isleapyear(n);

	}

}
