package CollectionsAssignment;

import java.util.ArrayList;

public class ArrayListTest {
	
	public void testIntersection(ArrayList<Integer> l1,ArrayList<Integer> l2) {
		
		l1.retainAll(l2);
		System.out.println(l1);
		
	}
	
	public void testMerge(ArrayList<Integer> l1,ArrayList<Integer> l2) {
		
		l1.addAll(l2);
		System.out.println(l1);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayListTest al=new ArrayListTest();
		ArrayList<Integer> l1=new ArrayList<Integer>();
		l1.add(10);
		l1.add(55);
		l1.add(80);
		l1.add(100);
		l1.add(90);
		System.out.println(l1);
		
		ArrayList<Integer> l2=new ArrayList<Integer>();
		l2.add(10);
		l2.add(55);
		l2.add(80);
		l2.add(200);
		l2.add(190);
		System.out.println(l2);
		
		
		ArrayList<Integer> l3=new ArrayList<Integer>();
		l3.add(21);
		l3.add(31);
		l3.add(41);
		l3.add(51);
		l3.add(61);
		System.out.println(l3);
		
		al.testIntersection(l1, l2);
		al.testMerge(l3, l2);

	}

}
