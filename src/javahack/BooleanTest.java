package javahack;

import java.util.Scanner;

public class BooleanTest {
	public static void closeScannerExit(Scanner scn) {
		scn.close();
		System.err.println("Invalid boolean values 'true' or 'false'");
		System.exit(-1);
	}
	
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		System.out.println("Enter three booleans(true/false)  :");
		boolean a = false;
		boolean b = false;
		boolean c = false;
		if(scn.hasNextBoolean()) {
			a = scn.nextBoolean();
			if(scn.hasNextBoolean()) {
				b = scn.nextBoolean();
				if(scn.hasNextBoolean()) {
					c = scn.nextBoolean();
				}else {
					closeScannerExit(scn);
				}
			} else {
				closeScannerExit(scn);
			}
		}else {
			closeScannerExit(scn);
		}
		
		if ((a && b) || (a && c) || (b && c)) {
			System.out.println("At least two out of three Booleans are true.");
			System.out.println("a = " + a + " b = " + b + " c = " + c);
		} else {
			System.out.println("two Booleans are not true.");
		}

	}

}
