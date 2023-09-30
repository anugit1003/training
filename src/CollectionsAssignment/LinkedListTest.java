package CollectionsAssignment;

import java.util.LinkedList;

public class LinkedListTest {

	public static void main(String[] args) {
		LinkedList<Integer> ls= new LinkedList<Integer>();
		ls.add(20);
		ls.add(90);
		ls.add(200);
		ls.add(50);
		ls.add(10);
		
		System.out.println(ls);
		System.out.println(ls.descendingIterator());
		

	}

}
