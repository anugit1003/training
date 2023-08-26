package day3;

/*
 * Triangle providing area and perimeter
 */

public class Triangle {

	private double side1;
	private double side2;
	private double side3;

	public Triangle() {
		
		
	}
	


	/* returning perimeter of a triangle */
	public double perimeter() {

		return (side1 + side2 + side3);
	}

	/* returns area of the triangle */
	public double area() {
		double s = (side1 + side2 + side3) / 2;
		// System.out.println(s);
		//Heron's formula
		double areaOfTriangle =  Math.sqrt(s * (s - side1) * (s - side2) * (s - side3));
		return areaOfTriangle; 
	}

	public static void main(String[] args) {
		Triangle t = new Triangle();
		t.side1 = 3.0d;
		t.side2 = 4.0d;
		t.side3 = 5.0d;

		System.out.println("The three sides of Triange are:" + t.side1 + "," + t.side2 + "," + t.side3);
		t.perimeter();
		System.out.println("The perimeter of triangle is:" + t.perimeter());
		t.area();
		System.out.println("The area of triangle :" + t.area());
	}

}
