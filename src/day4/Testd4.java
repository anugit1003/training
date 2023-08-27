package day4;

public class Testd4 {

	public static void main(String[] args) {

		findIndexTest();

	}

	public static void findIndexTest() {
		Problem2d4 p = new Problem2d4();
		int[] a1 = { 20, 30, 45, 70, 45, 90 };
		int value = 700;
		int index = p.findIndex(a1, value);

		if (index >= 0) {
			System.out.println(value + " is found in this array at index - " + index);
		} else {
			System.out.println(value + " value is not found in the given array");
		}
		int value1 = 45;
		int index1 = p.findIndex(a1, value1);

		if (index1 >= 0) {
			System.out.println(value1 + " is found in this array at index  " + index1);
		} else {
			System.out.println(value1 + " value is not found in the given array");
		}
	}

}
