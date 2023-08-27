package day4;

//Test if an array contains a specific value//

public class Problem2d4 {

	public  int findIndex(int[] arr, int value) {

		for (int i = 0; i < arr.length; i++) {

			if (arr[i] == value) {

				return i;
			}

		}
		return -1;
	}

	
}
