package day4;

public class Minmax {

	public static int CalcMin(int inputarr[]) {
		int min = inputarr[0];

		for (int i = 1; i < inputarr.length; i++) {

			if (inputarr[i] < min) {
				min = inputarr[i];

			}

		}
		return min;

	}

	public static int CalcMax(int inputarr[]) {

		int max = inputarr[0];
		for (int i = 1; i <inputarr.length; i++) {

			if (inputarr[i] > max) {
				max = inputarr[i];
			}
		}

		return max;
	}

	public static void main(String[] args) {
		int arr[] = { 25, 56, 34, 89, 230 };

		int value = CalcMin(arr);
		int value1 = CalcMax(arr);
		System.out.println("The smallest value in the array is:" + value);
		System.out.println("The largest value in the array is:" + value1);

	}

}
