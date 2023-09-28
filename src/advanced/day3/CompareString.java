package advanced.day3;
//Compare two strings ignoring cases
public class CompareString {

	public static void main(String[] args) {
		String str1="Java";
		String str2="java";
		String str3="hello";

		System.out.println(	str1.equalsIgnoreCase(str2));
		System.out.println(	str1.equalsIgnoreCase(str3));

	}

}
