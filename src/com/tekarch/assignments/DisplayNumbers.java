package com.tekarch.assignments;

public class DisplayNumbers {

	public void displaynumbers() {
		int i;

		for (i = 1; i <= 100; i++)

			System.out.println(i);

	}

	public static void main(String[] args) {

		DisplayNumbers d = new DisplayNumbers();
		d.displaynumbers();

	}

}
