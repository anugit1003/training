package day1;

public class Problem5 {

	static int a = 5;
	static int b = 6;
	static int c;
	

	public static void main(String[] args) {

		System.out.println("the values before swapping " + a + " " + b);

		c = a;
		a = b;
		b = c;
		
		System.out.println("Value of a after swapping :" + a);
		System.out.println("value of b after swapping : " + b);
		System.out.println(c);

	}
}