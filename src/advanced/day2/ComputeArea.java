package advanced.day2;

import java.util.Scanner;

public class ComputeArea {

	private int length;
	private int width;

	public ComputeArea(int _length, int _width) {

		length = _length;
		width = _width;
	}

	public ComputeArea(int _length) {
		length = _length;
		width = _length;
	}

	public int area() {

		return length * width;

	}

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);

		System.out.println("Enter the length and width:");
		int input_length = scn.nextInt();
		int input_width = scn.nextInt();
		scn.close();

		ComputeArea square = new ComputeArea(input_length);

		System.out.println("Area of square is:" + square.area());
		ComputeArea rec = new ComputeArea(input_length, input_width);

		System.out.println("Area of Rectangle is:" + rec.area());

	}

}
