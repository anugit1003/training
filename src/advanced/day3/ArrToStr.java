package advanced.day3;

import java.util.Arrays;

public class ArrToStr {

	public static void main(String[] args) {
		String strArr[] = { "Hello", "world", "from", "java" };
		StringBuffer sb = new StringBuffer();
		for (int i = 0; i < strArr.length; i++) {
			sb.append(strArr[i]);
		}

		String str = sb.toString();

		System.out.println(str);

	}

}
