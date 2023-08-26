package day3;

public class Rectangle {

	int l;
	int b;
	int a;

	public Rectangle(int length, int breadth) {
		l = length;
		b = breadth;

	}

	public int area() {

		a = l * b;
		return a;
	}

	void display() {
		System.out.println("The length and width of a rectangle are :" + l + " & " + b);

	}

	public static void main(String[] args) {

		/* First Rectangle */ 
		Rectangle rectangle1 = new Rectangle(4, 5);
		rectangle1.area();
		rectangle1.display();
		
		System.out.println("Area of rectangle is: " + rectangle1.area()+"\n\n");
		
		/* Second  Rectangle */ 
		Rectangle rectangle2 = new Rectangle(5, 8);
		rectangle2.area();
		rectangle2.display();
		
		System.out.println("Area of rectangle is: " + rectangle2.area());


	}

}
