package day3;
import java.lang.Math;

public class Triangle {
	double side1;
	double side2;
	double side3;
	
	
	
	
	
	public Triangle() {
		
	}
	 
	public double perimeter() {
		return side1+side2+side3;
	}
	
	public double area() {
		 double s= (side1+side2+side3)/2;
		 //System.out.println(s);
		 double a= Math.sqrt(s*(s-side1)*(s-side2)*(s-side3));
		 return a;
		}
	
	

	public static void main(String[] args) {
		Triangle t=new Triangle();
		t.side1=3.0d;
		t.side2=4.0d;
		t.side3=5.0d;
		
		System.out.println("The three sides of Triange are:" +t.side1 + "," + t.side2 + "," + t.side3); 
		t.perimeter();
		System.out.println("The perimeter of triangle is:" +t.perimeter());
		t.area();
		System.out.println("The area of triangle :" +t.area());
	}

}
