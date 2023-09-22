package advanced.day2;

public class Patterns {
	

	public static void main(String[] args) {
		
		int sum=3;
		for(int n=0;n<4;n++) {
	
			
			 sum=sum+3;
			System.out.print(" "+sum);
			
		}
		System.out.println();
		
		//second question
		
		System.out.println("Series Two=======================");
		int n=1;
		System.out.print(n);
		for(int i=1;i<5;i++) {
			n=n+3;
			System.out.print(","+n);
			
		}
		System.out.println();
		//Third question
		
		System.out.println("Series Three=====================");
		int x=0;
		System.out.print(x);
		for(int i=1;i<5;i++) {
		x=x+4;
		System.out.print(","+x);
		}
		

	}

}
