package algorithm.chapter2.chapter2_3;

import java.util.Random;

/**
 * Created by xcl on 2017-01-16.
 */
public class Test {
    public static void main(String[] args) {
        int n = 10000;
        int[] data1 = new int[n];
        int[] data2 = new int[n];
        for (int i = 0; i < n; i++) {
            Random random = new Random();
            data1[i] = data2[i] = random.nextInt(n);
        }
        long start1 = System.currentTimeMillis();
        InsertionSort.insertSort(data1, n - 1);
        long end1 = System.currentTimeMillis();
        System.out.println(end1 - start1);

        long start2 = System.currentTimeMillis();
        InsertionSortFixed.insertionSort(data2);
        long end2 = System.currentTimeMillis();
        System.out.println(end2 - start2);
    }
}
