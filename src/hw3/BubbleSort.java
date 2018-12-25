package hw3;

public class BubbleSort {
    int data[] = {4, 6, 2, 7, 8, 9};

    public static void main(String[] args) {
        System.out.print("原始資料為:");
        BubbleSort bubbleSort = new BubbleSort();
        bubbleSort.showdata();
        bubbleSort.bubble();
        System.out.print("排序後結果為:");
        bubbleSort.showdata();
    }

    public void showdata() {
        for (int i = 0; i < data.length; i++) {
            System.out.print(data[i] + " ");
        }
        System.out.println();
    }

    public void bubble() {
        //n個資料最多做(n-1)次
        for (int i = data.length - 1; i >= 0; i--) {
            int flag = 0;
            //資料交換
            for (int j = 0; j < i; j++) {
                //若後面比前面小則交換
                if (data[j + 1] < data[j]) {
                    int tmp = data[j];
                    data[j] = data[j + 1];
                    data[j + 1] = tmp;
                    flag = flag + 1;
                }
            }
            //交換完後利用flag判斷是否有交換
            //若無則代表排序完成所以break跳出迴圈
            if (flag == 0) {
                break;
            }
            //若有責印出該次交換結果，然後再次進入迴圈
            System.out.print("第" + (6 - i) + "次排序:");
            showdata();
        }
    }
}
