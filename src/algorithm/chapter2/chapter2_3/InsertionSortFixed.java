package algorithm.chapter2.chapter2_3;

import java.util.Arrays;
import java.util.Random;

/**
 * Created by xcl on 2017-01-14.
 * 练习2.3-6
 * 插入排序 修改版
 */
public class InsertionSortFixed {

    public static void insert(int[] data, int p, int n) {
        int key = data[n];
        while (n > p)
            data[n] = data[--n];
        data[p] = key;
    }

    public static int binarySearch(int[] data, int p, int r, int key) {
        if (p >= r) {
            if (data[p] <= key)
                return p + 1;
            else
                return p;
        }
        int q = (p + r) / 2;
        if (data[q] == key)
            return q + 1;
        else if (data[q] > key)
            return binarySearch(data, p, q - 1, key);
        else
            return binarySearch(data, q + 1, r, key);
    }

    public static void insertionSort(int[] data) {
        if (data == null || data.length == 0)
            return;
        for (int i = 1, j = data.length; i < j; i++) {
            int p = binarySearch(data, 0, i - 1, data[i]);
            insert(data, p, i);
        }
    }

    public static void main(String[] args) {
        Random random = new Random();
        int[] data = new int[10];
        for (int i = 0; i < 10; i++) {
            data[i] = random.nextInt(100);
            System.out.println(data[i]);
        }
        // int[] d = {87,0 ,34 ,54 ,48 ,58 ,3 ,14 ,58 ,36};
        insertionSort(data);
        System.out.println(Arrays.toString(data));
    }
}
