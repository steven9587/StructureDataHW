package hw2;

import java.util.Scanner;

public class Combination {

	public static void main(String[] args) {
		System.out.print("請輸入C(n,m):");
		// 讀取輸入資料
		Scanner scanner = new Scanner(System.in);
		String line = scanner.nextLine();
		String[] tokens = line.split(",");
		int n = Integer.parseInt(tokens[0]);
		int m = Integer.parseInt(tokens[1]);
		int answer = 0;
		answer = answer + operation(n, m);
		System.out.print("(" + n + "," + m + ") = " + answer);
	}

	public static int operation(int a, int b) {
		if (a == b || b == 0) {
			return 1;
		} else {
			return operation(a - 1, b) + operation(a - 1, b - 1);
		}
	}

}
