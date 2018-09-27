package hw1;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/*
 *循序搜尋法：直接用迴圈一個個去比對，找到時就跳出
 */
public class SequentialSearch {

	public static void main(String[] args) {
		// 製造數列
		List<Integer> number = new ArrayList<>();
		for (int i = 1; i < 11; i++) {
			number.add(i);
		}
		// 印出數列
		System.out.println("數列：");
		for (int i = 0; i < number.size(); i++) {
			System.out.print(number.get(i) + "  ");
		}
		System.out.println();
		// 用循序搜尋找出此數
		System.out.print("請輸入要查詢的數：");
		Scanner scanner = new Scanner(System.in);
		int find = scanner.nextInt();
		boolean judgement = false;
		int position = 0;
		for (int i = 0; i < number.size(); i++) {
			if (find == i) {
				judgement = true;
				position = i;
				break;
			}
		}
		// 印出資料
		if (judgement) {
			System.out.println("找到此數，在位置" + position);
		} else {
			System.out.println("找無此數!");
		}

	}

}
