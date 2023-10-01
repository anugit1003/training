package javahack;

public class MergeTwoArrays {
	
	public static void main(String[] args) {

		int[] array1 = { 1, 2, 4, 6, 9, 10, 0, 0, 0, 0 };
		int[] array2 = { 3, 5, 7, 8 };

		// Merging the two arrays without sorting
		int a = 0;
		for (int k = 0; k < array1.length; k++) {
			if (array1[k] == 0) {
				array1[k] = array2[a];
				a++;
			}
		}
		System.out.println("Merged Array : ");
		for (int nums : array1) {
			System.out.print(nums + " ");
		}
		// Sort the merged array		
		SortIntegers.sortIntegersAscending(array1);
	}
}
