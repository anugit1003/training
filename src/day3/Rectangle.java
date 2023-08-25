package day3;

public class Rectangle {
	
	int l;
	int b;
	int a;
	
	
	public Rectangle(int length,int breadth) {
		l=length;
		b=breadth;
		
	}
	public int Area() {
		
		 a= l*b;
		 return a;
	}
	 
		
	
	void display() {
		System.out.println("The length and width of a rectangle are :"+l + " & " +b);	
		
	}

	public static void main(String[] args) {
		
		Rectangle r =new Rectangle(4,5);
		r.Area();
		
		r.display();
		
		System.out.println("Area of rectangle is: "+ r.Area());
		
		

	}

}
