package hw2;

//題目:N項資料任意排列
import java.util.ArrayList;
import java.util.Random;

public class RandomArrangement {
	public static int select;
	public static int[] number = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
	public static ArrayList<Integer> usenumber = new ArrayList<>();
	public static int[] answer = new int[number.length];

	public static void main(String[] args) {
		// 印出原先資料
		System.out.print("排列前:");
		for (int i = 0; i < number.length; i++) {
			System.out.print(number[i] + " ");
			// 將陣列轉換為Arraylist (因為Arraylist才能把select資料刪除)
			usenumber.add(number[i]);
		}
		System.out.println();
		System.out.print("排列後:");
		// 印出排列後資料
		for (int i = 0; i < answer.length; i++) {
			// 利用random方法任意排序資料
			random(i);
			System.out.print(answer[i] + " ");
		}
	}

	public static void random(int n) {
		Random random = new Random();
		select = random.nextInt(usenumber.size());
		answer[n] = usenumber.get(select);
		usenumber.remove(usenumber.get(select));
	}
}
