package hw2;

import java.util.Scanner;

public class NFactorial {
	
	public static int answer = 1;

	public static void main(String[] args) {
		System.out.print("清輸入階層數(n):");
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		if(n<0) {
			System.out.println("輸入錯誤,請輸入>=0的數!");
		}else {
			while (n >= 0) {
			if (n == 0) {
				answer = answer * 1;
				n--;
			} else {
				answer = factorial(n);
				n--;
			}
		}
		System.out.println("答案："+answer);
		}
	}
	
	public static int factorial(int n) {
		answer = answer * n ;
		return answer;
	}
}
