package day1;

public class TestOperation {

	public static void main(String[] args) {
		int i = -5;
		int x = 8;
		int y = 6;
		int z = i + x * y;
		System.out.println(z);

		myOperationB();
		myOperationC();
		myOperationD();

	}

	public static void myOperationB() {
		int a = 55;
		int b = 9;
		int c = 9;
		int x = (a + b) % c;

		System.out.println(x);
	}
	
	public static void myOperationC() {
		
		
		float x= -3*5/8.0f;
		float y = 20 + x;
		float z = -3*5/8;
		float m = 20 + z;
		System.out.println("The answer for the above equation if we take 8 as float " + y);
		System.out.println("The value for the above equation if we take 8 as int " + m);
	}
	
	public static void myOperationD() {
		
		int x = 5 + 15/3*2 -8%3;
		System.out.println(x);
	}
	
}
