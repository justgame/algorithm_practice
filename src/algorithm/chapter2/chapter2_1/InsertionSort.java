package algorithm.chapter2.chapter2_1;

import java.util.Arrays;

/**
 * Created by xcl on 2017-01-10.
 * 插入排序
 */
public class InsertionSort {
    public static void main(String[] args) {
        int[] data = {7, 3, 5, 1, 2, 8, 4};
        InsertionSort(data);
        System.out.println(Arrays.toString(data));
    }

    public static void InsertionSort(int[] data) {
        if (data == null)
            return;
        int length = data.length;
        for (int j = 1; j <= length - 1; j++) {
            int key = data[j];
            int i = j - 1;
            while (i >= 0 && data[i] > key) {
                data[i + 1] = data[i];
                i--;
            }
            data[i + 1] = key;
        }
    }
}
