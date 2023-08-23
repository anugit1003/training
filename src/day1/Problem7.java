package day1;

public class Problem7 {

	public static void main(String[] args) {
		int a = 10;
		int b = 116;
		int c = 160;
		

		if (a > b && a > c) {
			System.out.println("1. The greatest of three numbers is :" + a);
		}

		else if (b > a && b > c) {
			System.out.println("2. The greatest of three numbers is :" + b);
		} else if (c > a && c > b) {
			System.out.println("3. The greatest of three numbers is :" + c);
		}

		else {
			System.out.println("none of the numbers are great");
		}
		myLoop();
	}

	public static void myLoop() {
		int x = 100;
		int y = 150;
		int z = 200;
		if (x > y && x > z) {
			System.out.println("1.The greatest number is :" + x);

			if (y > x && y > z) {

				System.out.println("2.The greatest number is :" + y);
			}

			if (z > x && z > y) {
				System.out.println("3.The greatest number is :" + z);
			}
		} 
		else {
			System.out.println("None is the greatest");
		}
	}
}
