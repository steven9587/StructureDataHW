package hw2;

//題目:阿克曼函數的運算
import java.util.Scanner;

public class AckermannNumber {

	public static void main(String[] args) {
		System.out.print("請輸入A(n,m):");
		// 讀取輸入資料
		Scanner scanner = new Scanner(System.in);
		String line = scanner.nextLine();
		String[] tokens = line.split(",");
		int n = Integer.parseInt(tokens[0]);
		int m = Integer.parseInt(tokens[1]);
		if (n < 0 || m < 0) {
			System.out.println("輸入錯誤!n,m必須>=0");
		} else {
			int answer = 0;
			answer = answer + operation(n, m);
			System.out.print("A(" + n + "," + m + ") = " + answer);
		}
	}

	// 遞迴方法(自己呼叫自己)
	public static int operation(int a, int b) {
		if (a == 0) {
			return b + 1;
		} else if (b == 0) {
			// 自己呼叫自己
			return operation(a - 1, 1);
		} else {
			// 自己呼叫自己
			return operation(a - 1, operation(a, b - 1));
		}
	}

}
