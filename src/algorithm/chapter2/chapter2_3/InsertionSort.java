package algorithm.chapter2.chapter2_3;

import java.util.Arrays;
import java.util.Random;

/**
 * Created by xcl on 2017-01-13.
 * 练习2.3-4
 * 插入排序 递归实现
 */
public class InsertionSort {
    public static void insert(int[] data, int n) {
        int i = n;
        int key = data[n];
        while (--i >= 0 && data[i] > key)
            data[i + 1] = data[i];
        data[i + 1] = key;
    }

    public static void insertSort(int[] data, int n) {
        if (data == null || data.length == 0)
            return;
        if (n > 0) {
            insertSort(data, n - 1);
            insert(data, n);
        }
    }

    public static void main(String[] args) {
        Random random = new Random();
        int[] data = new int[10];
        for (int i = 0; i < 10; i++) {
            data[i] = random.nextInt(100);
        }
        insertSort(data, data.length - 1);
        System.out.println(Arrays.toString(data));
    }

}
