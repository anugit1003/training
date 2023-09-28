package advanced.day3;

public class SubStringTest {
	
	 public  String str1 = "I l love java and I love python";
	 public  String substr1 = "love";

	public static void main(String[] args) {
		SubStringTest s = new SubStringTest();
		
		int index = s.str1.indexOf(s.substr1);
		System.out.print(index);
		
	 
	

	}

}
