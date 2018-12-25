package hw3;

public class QuickSort {
    static int[] data = {31, 85, 72, 20, 51, 88, 92, 90, 22, 58};

    public static void main(String[] args) {
        QuickSort quickSort = new QuickSort();
        System.out.print("原始資料；");
        quickSort.showdata();
        quickSort.quick(0, data.length - 1, data);
        System.out.print("排序結果；");
        quickSort.showdata();
    }

    public void showdata() {
        for (int i = 0; i < data.length; i++) {
            System.out.print(data[i] + " ");
        }
        System.out.println();
    }

    public void quick(int left, int right, int[] data) {
        //代表排序已結束
        if (left > right) {
            return;
        }
        int startIndex = left; //代表最左邊那個數字的起始index
        int endIndex = right;   //代表最右邊那個數字的起始index
        int key = data[left]; //用來儲存要排序的數字陣列最左邊的數字

        while (startIndex != endIndex) {
            //要先從右往左找Kj(小於key)
            while (data[endIndex] >= key && startIndex < endIndex) {
                endIndex--;
            }
            //要先從左往右找Ki(大於key)
            while (data[startIndex] <= key && startIndex < endIndex) {
                startIndex++;
            }
            //i<j => Kj、Ki互換
            if (startIndex < endIndex) {
                int temp = data[startIndex];
                data[startIndex] = data[endIndex];
                data[endIndex] = temp;
            }
            System.out.print("[處理過程]=> ");
            showdata();
        }
        //i>=j => key、Kj互換
        data[left] = data[startIndex];
        data[startIndex] = key;

        //key左邊那堆數再執行一次
        quick(left, startIndex - 1, data);
        //key右邊那堆數再執行一次
        quick(startIndex + 1, right, data);
    }
}
