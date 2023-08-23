package com.tekarch.assignments;

public class CompareNumbers {


	public int largestNum(int x, int y, int z) {
		int largest;

		if (x > y && x > z)
			largest = x;
		else if (y > x && y > z)
			largest = y;
		else
			largest = z;
		return largest;
	}

}
