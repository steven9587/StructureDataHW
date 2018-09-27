package hw1;

import java.util.ArrayList;
import java.util.List;
/*
 * 交換排序法：從第一個數開始逐一和之後的數做比較，如果大於或是小於就交換。
 * 直到判斷至資料最尾端，才會回到第二個數重新和之後的數做比較。如此反覆動作
 * 後，當已經沒有可以判斷的數時，整個排序法就run完了。
 */
public class ExchangeSort {

	public static void main(String[] args) {
		List<Integer> number = new ArrayList<>();
		// 產生一亂數數列
		number.add(5);
		number.add(3);
		number.add(1);
		number.add(2);
		number.add(4);
		System.out.println("原數列：" + number);
		for (int i = 0; i < number.size(); i++) {
			for (int f = i + 1; f < number.size(); f++) {
				if (number.get(f) < number.get(i)) {
					int a = number.get(f);
					int b = number.get(i);
					number.remove(number.get(f));
					number.remove(number.get(i));
					number.add(i, a);
					number.add(f, b);
					
				}
			}
		}
		System.out.println("新數列：" + number);
	}

}
