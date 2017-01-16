package algorithm.chapter2.chapter2_3;

import java.util.Arrays;

/**
 * Created by xcl on 2017-01-16.
 * 练习2.3-7
 * 给定一个整数集合S和另一个整数x，判断集合S中是否存在两个数使得它们的和等于x
 */
public class FindSumEqual {
    public static int searchLess(int[] data, int x) {
        if (data == null || data.length == 0)
            return -1;
        int j = 0;
        for (int i = 0, k = data.length; i < k; i++) {
            if (data[i] <= x) {
                if (i != j ) {
                    data[j] = data[i];
                    j++;
                } else j++;
            }
        }
        return j - 1;
    }

    public static boolean findSumEqual(int[] data, int p, int r, int x2, int x) {
        if (data == null || data.length == 0)
            return false;
        if (p >= r)
            if (data[p] + x2 == x)
                return true;
            else
                return false;
        int q = (p + r) / 2;
        if (data[q] + x2 == x)
            return true;
        else if (data[q] + x2 < x)
            return findSumEqual(data, q + 1, r, x2, x);
        else
            return findSumEqual(data, p, q - 1, x2, x);
    }

    public static void main(String[] args) {
        int[] data = {3, 44, 4, 22, 8, 17, 1, 0, 5, 22, 15, 11};
        int x = 13;
        int i = searchLess(data, x);
        InsertionSort.insertSort(data, i);
        System.out.println(Arrays.toString(data));
        boolean flag = false;
        for (int j = i; j > 0; j--) {
            flag = findSumEqual(data, 0, j - 1, data[j], x);
            if (flag) break;
        }
        if (flag)
            System.out.println("true");
        else
            System.out.println("false");
    }
}
