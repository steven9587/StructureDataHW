package hw1;

import java.util.ArrayList;
import java.util.List;

/*
 * 選擇排序法：反覆從未排序的數列中取出最小的元素，加入到另一個的數列，結果即為已排序的數列。
 */
public class SelectionSort {

	public static void main(String[] args) {
		List<Integer> startnumber = new ArrayList<>();
		List<Integer> finalnumber = new ArrayList<>();
		// 產生一亂數數列
		startnumber.add(5);
		startnumber.add(3);
		startnumber.add(1);
		startnumber.add(2);
		startnumber.add(4);
		System.out.println("原數列：" + startnumber);
		while (startnumber.size()!=0) {
			int correctnumber = startnumber.get(0);
			int a = 0;
			for (int i = 0; i < startnumber.size(); i++) {
				if (correctnumber > startnumber.get(i)) {
					correctnumber = startnumber.get(i);
					a=i;
				}
			}
			startnumber.remove(a);
			finalnumber.add(correctnumber);
		}
		System.out.println("新數列：" + finalnumber);
	}
}
