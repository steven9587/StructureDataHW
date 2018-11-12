package hw2;

import java.util.ArrayList;

public class Test {
	public static String temp;

	public static void main(String[] args) {
		String finaltemp = "";
		int[] collection = { 1, 2, 3, 4, 5 };
		String binaryNumber = "00011";
		String[] finaltrans = binaryNumber.split("");
		for (int i = 0; i < finaltrans.length; i++) {
			if (finaltrans[i].equals("1")) {
				finaltemp = finaltemp +" "+ collection[i];
			}
		}
		System.out.println("["+finaltemp+" ]");
	}

}
