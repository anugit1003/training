package CollectionsAssignment;

import java.util.HashMap;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import java.util.Scanner;
import java.util.stream.Collectors;

public class FindFrequency {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		System.out.println("Enter the string");
		String str = scn.nextLine();
		scn.close();
		
		List<Character> cList = str.chars().mapToObj(c -> (char) c).collect(Collectors.toList());
		System.out.println(cList);
		Map<Character, Integer> cMap = new HashMap<Character, Integer>();  //Empty Map
		
		ListIterator<Character> iterator = cList.listIterator(); //get Iterator
		
		while(iterator != null && iterator.hasNext()) {
			int count = 1;
		    Character ch = iterator.next();
		    if(!cMap.containsKey(ch)) {
		    	cMap.put(ch, count);
		    }else {
		    	count = cMap.get(ch);
		    	count++;
		    	cMap.put(ch, count);
		    }
		    
		}
		System.out.println(cMap); 
		

	}

}
