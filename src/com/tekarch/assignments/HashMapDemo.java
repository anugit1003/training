package com.tekarch.assignments;
import java.util.HashMap;

public class HashMapDemo {

	public static void main(String[] args) {
		
		// Heterogeneous way 
		//HashMap m = new HashMap();
		
		//Another way of declaring the object.takes integer key and string value
		HashMap<Integer,String > m = new HashMap<Integer,String>();
		
		m.put(101,"Anu");
		m.put(102,"Ram");
		m.put(103,"Akshita");
		m.put(104,"Atmika");
		//m.put(102,"Anu");overides Ram
		m.put(105,"Anu");//Anu duplicate values
		
		System.out.println(m);
		System.out.println(m.get(102));//prints the value of the key
		m.remove(105);
		System.out.println(m);
		//System.out.println(m.containsKey(105));//false because 105 key is removed
        //System.out.println(m.containsValue("Ram"));//true
        
        
        for(int i:m.keySet()) {
        	
        	System.out.println(i);
        }
        
        for(String str:m.values()) {
        	System.out.println(str);
        }
        
        for(int i :m.keySet()) {
        	
        	System.out.println(i+"   "+m.get(i));
        }
        
       //System.out.println(m.values()); Prints all the values
        //System.out.println(m.keySet());//returns keys
        //System.out.println(m.entrySet());//returns entries
	}

}
