package CollectionsAssignment;

import java.util.HashSet;
import java.util.List;
import java.util.Scanner;
import java.util.Set;
import java.util.stream.Collectors;

public class RemoveDuplicates {

	public void removeDuplicates(String str) {
		/* Convert String to Character List */
		List<Character> cList = str.chars().mapToObj(c -> (char) c).collect(Collectors.toList());
		System.out.println(cList);
		/* Add all to a Set to remove duplicates */
		Set<Character> cSet = new HashSet<Character>();
		cSet.addAll(cList);
		System.out.println(cSet);

	}

	public static void main(String[] args) {

		Scanner scn = new Scanner(System.in);
		System.out.println("Enter the string");
		String str = scn.nextLine();
		scn.close();
		RemoveDuplicates rd = new RemoveDuplicates();
		rd.removeDuplicates(str);

	}

}
