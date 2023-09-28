package advanced.day3;

import java.util.Arrays;

public class Anagrams {

	public static boolean areAnagrams(String str1, String str2) {

		char mychar1[] = str1.toCharArray();
		char mychar2[] = str2.toCharArray();

		int n1 = mychar1.length;
		int n2 = mychar2.length;

		/* If lengths of the given strings are not equal, not anagrams  */
		if (n1 != n2) {
			return false;
		}
		Arrays.sort(mychar1);
		Arrays.sort(mychar2);

		System.out.println(mychar1);
		System.out.println(mychar2);

		/* compare chars  */
		for (int i = 0; i < n1; i++) {

			if (mychar1[i] != mychar2[i]) {
				return false;
			}

		}

		return true;

	}

	public static void main(String[] args) {
		String str1 = "triangle";
		String str2 = "integral";
		if (areAnagrams(str1, str2)) {
			System.out.println("the words are anagrams");

		} else
			System.out.println("they are not anagrams");

	}

}
