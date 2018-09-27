package hw1;

import java.util.Scanner;

public class TwoDimensionalArray {

	public static void main(String[] args) {
		// A矩陣的輸入&存取
		System.out.println("請輸入矩陣A的維數(M,N)：");
		System.out.print("請先輸入矩陣A的M值：");
		Scanner scanner = new Scanner(System.in);
		int m = scanner.nextInt();
		System.out.print("請先輸入矩陣A的N值：");
		scanner = new Scanner(System.in);
		int n1 = scanner.nextInt();
		//
		System.out.println("[請輸入矩陣A的各元素]");
		System.out.println("注意!每輸入一個值按下Enter鍵確認輸入");
		int A[][] = new int[m][n1];
		for (int i = 0; i < m; i++) {
			for (int f = 0; f < n1; f++) {
				System.out.print("a" + i + f + "=");
				scanner = new Scanner(System.in);
				int number = scanner.nextInt();
				A[i][f] = number;
			}
		}

		// B矩陣的輸入&存取
		System.out.println("請輸入矩陣B的維數(N,P)：");
		System.out.print("請先輸入矩陣B的N值：");
		scanner = new Scanner(System.in);
		int n2 = scanner.nextInt();
		System.out.print("請先輸入矩陣B的P值：");
		scanner = new Scanner(System.in);
		int p = scanner.nextInt();
		//
		System.out.println("[請輸入矩陣B的各元素]");
		System.out.println("注意!每輸入一個值按下Enter鍵確認輸入");
		int B[][] = new int[n2][p];
		for (int i = 0; i < n2; i++) {
			for (int f = 0; f < p; f++) {
				System.out.print("a" + i + f + "=");
				scanner = new Scanner(System.in);
				int number = scanner.nextInt();
				B[i][f] = number;
			}
		}
		int answer[][] = new int[m][p];
		if (n1 != n2) {
			System.out.println("無法相乘");
		} else {
			for (int i = 0; i < m; i++) {
				for (int f = 0; f < p; f++) {
					for (int k = 0; k < n1; k++) {
						answer[i][f] += A[i][k] * B[k][f];
					}
				}
			}
		}
		// 印出答案
		System.out.println("[AxB結果是]");
		for (int i = 0; i < m; i++) {
			for (int f = 0; f < p; f++) {
				System.out.print(answer[i][f]+"\t");
			}
			System.out.println();
		}
	}

}
