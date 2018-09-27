package hw1;

import java.util.Scanner;

public class NFactorial {

	public static void main(String[] args) {
		System.out.print("請輸入階層數：");
		Scanner scanner = new Scanner(System.in);
		int number = scanner.nextInt();
		int answer = 1;
		if (number >= 0) {
			for (int i = 1; i <= number; i++) {
				answer = answer * i;
			}
			System.out.println(number+"!="+answer);
		} else {
			System.out.println("請輸入大於或等於0的數!");
		}
	}
}
