package hw3;

public class HeapSort {
    static int[] data = {0, 5, 6, 4, 8, 3, 2, 7, 1};
    static int size = data.length;

    public static void main(String[] args) {
        HeapSort heapSort = new HeapSort();
        System.out.print("原始陣列:");
        heapSort.showdata();
        HeapSort.outPut(data, size);
        System.out.print("排序結果:");
        heapSort.showdata();
    }

    public static void showdata() {
        for (int i = 1; i < size; i++) {
            System.out.print("[" + data[i] + "] ");
        }
        System.out.println();
    }

    public static void outPut(int[] data, int size) {
        //建立堆積樹節點
        for (int i = (size / 2); i > 0; i--) {
            HeapSort.heapTree(data, i, size - 1);
        }
        System.out.print("堆積內容:");
        showdata();
        System.out.println();
        //堆積排序
        for (int i = size - 2; i > 0; i--) {
            int tmp = data[i + 1];
            data[i + 1] = data[1];
            data[1] = tmp;
            HeapSort.heapTree(data, 1, i);
            System.out.print("處理過程:");
            showdata();
        }
    }

    public static void heapTree(int[] data, int i, int size) {
        int j = 2 * i;
        int tmp = data[i];
        int post = 0;
        while (j <= size && post == 0) {
            if (j < size) {
                // 找最大節點
                if (data[j] < data[j + 1]) {
                    j = j + 1;
                }
            }
            if (tmp >= data[j]) {
                // 若樹跟較大,結束比較過程
                post = 1;
            } else {
                // 若樹根較小，則繼續比較
                data[j / 2] = data[j];
                j = 2 * j;
            }
        }
        // 指定樹根為父節點
        data[j / 2] = tmp;
    }
}