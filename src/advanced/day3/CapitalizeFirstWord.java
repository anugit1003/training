package advanced.day3;

public class CapitalizeFirstWord {

	public static void main(String[] args) {
		String str = "i am learning java from tekarch";
		char[] mychar = str.toCharArray();
		System.out.println("Before capitalizing:" + str);
		
		mychar[0] = Character.toUpperCase(mychar[0]);
		
		for (int i = 0; i < mychar.length; i++) {
			
			if (Character.isWhitespace(mychar[i])) {

				mychar[i + 1] = Character.toUpperCase(mychar[i + 1]);
			}
		}
		str = String.valueOf(mychar);
		System.out.println("After capitalization:" + str);
	}

}
