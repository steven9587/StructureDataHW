package hw1;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
/*
 *二元搜尋法：需要先把要搜尋的數列先排序，由小到大，規則是先取前後二索引數，相加除二，也就是取中間數當索引值，
 *然後跟要搜尋的數字做比較，如果一樣就是找到了，如果中間的數比要搜尋的數大，代表要搜尋的數在左邊數列，右邊數列
 *則放棄，相反之，如果中間數比要搜尋的數小，代表要搜尋的數在右邊數列，左邊數列則放棄
 */

public class BinarySearch {

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
		// 用二元搜尋找出此數
		System.out.println("請輸入要查詢的數：");
		Scanner scanner = new Scanner(System.in);
		int find = scanner.nextInt();
		boolean judgement = false;
		int position = 0;
		int left = 0;
		int right = number.size() - 1;
		while (right > left) {
			// 找到了
			if (find == number.get((left + right) / 2)) {
				position = (left + right) / 2;
				judgement = true;
				break;
			}
			// 欲找數大於假設數(放棄左邊)
			if (find > number.get((left + right) / 2)) {
				left = ((left + right) / 2) + 1;
			}
			// 欲找數小於假設數(放棄右邊)
			if (find < number.get((left + right) / 2)) {
				right = ((left + right) / 2) - 1;
			}
		}
		// 印出資料
		if (judgement) {
			System.out.println("找到此數，在位置" + (position+1) + "!");
		} else {
			System.out.println("找無此數!");
		}

	}

}
