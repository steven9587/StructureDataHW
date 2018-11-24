package hw2;

//題目:印出最大最小值
public class MaxAndMin {

	public static void main(String[] args) {
		// 產生一數列
		int[] number = { 10, 20, 30, 40, 50, 60, 70, 80, 90, 100 };
		int max = number[0];
		int min = number[0];
		// 求出最大值
		for (int i = 0; i < number.length; i++) {
			if (number[i] > max) {
				max = number[i];
			}
		}
		// 求出最小值
		for (int i = 0; i < number.length; i++) {
			if (number[i] < min) {
				min = number[i];
			}
		}
		// 印出答案
		// 數列
		System.out.print("數列:");
		for (int i = 0; i < number.length; i++) {
			System.out.print(number[i] + " ");
		}
		System.out.println();
		// 最大值
		System.out.println("最大值：" + max);
		// 最小值
		System.out.println("最小值：" + min);
	}
}
