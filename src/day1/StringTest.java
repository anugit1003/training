package day1;

public class StringTest {

	public static void main(String[] args) {
		String str = "I am learning java";
		String str1 = str.substring(3);
		System.out.println(str.subSequence(4, 12));
		System.out.println(str1);
		
		
		
		String words[] = str.split("\s");
		for (int a = 0; a < words.length; a++) {
			System.out.print(words[a] + "\n");
		}

	}

}
