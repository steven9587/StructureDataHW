package hw2;

//題目:費氏數列第N項
import java.util.Scanner;

public class FibonacciNumber {
	public static int answer = 0;

	public static void main(String[] args) {
		// 輸入&讀取資料
		System.out.print("請輸入欲求費氏數列第N項：");
		Scanner scanner = new Scanner(System.in);
		int number = scanner.nextInt();
		//費氏數列運算
		if (number < 0) {
			System.out.println("輸入錯誤,請輸入>=0的數!");
		} else {
			answer = answer + Fibonacci(number);
			System.out.println("答案：" + answer);
		}
	}
	// 遞迴方法(自己呼叫自己)
	public static int Fibonacci(int n) {
		if (n == 0) {
			return 0;
		}
		if (n == 1) {
			return 1;
		} else {
			//自己呼叫自己
			return Fibonacci(n - 1) + Fibonacci(n - 2);
		}
	}
}
