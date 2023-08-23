package day2;

public class Problem1D2 {

	public static void main(String[] args) {
		System.out.println("For loop,starts here");
		for (int i = 1; i <= 5; i++) {
			System.out.println(i);
		}

		myWhileloop();
		myDowhileloop();
	}

	public static void myWhileloop() {
		System.out.println("While loop starts here");

		int i = 15;
		while (i>=10){
			System.out.println(i);
			i--;
		}
	}
    public static void myDowhileloop() {
    	int a =20;
    	System.out.println("Do while loop starts here");
    	do {
    		System.out.println(a);
    		a++;
    	}
    	while (a<25);
    		
    	
}
}