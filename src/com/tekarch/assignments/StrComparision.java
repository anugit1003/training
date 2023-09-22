package com.tekarch.assignments;

public class StrComparision {

	public static void main(String[] args) {
		String str1="tekarch";
		String str2="tekarch";
		String str3="Anuradha";
		String str4= new String("tekarch");
		String str5= new String("tekarch");
		System.out.println("testing string comp");
		System.out.println(str1.equals(str2));
		System.out.println(str1==str4);
		System.out.println(str1.equals(str4));
		System.out.println(str1==str2);		
		System.out.println(str4==str5);

	}

}
