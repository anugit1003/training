package com.tekarch.assignments;

import java.util.HashMap;

public class HashMapDemo1 {

	public static void main(String[] args) {
		
		HashMap<Character,Integer> hm = new HashMap<Character,Integer>();
		hm.put('c',2);
		hm.put('h',2);
		hm.put('i',2);
		hm.put('l',2);
		hm.put('a',2);
		hm.put('t',1);
		hm.put('k',1);
		
		System.out.println(hm);

	}

}
