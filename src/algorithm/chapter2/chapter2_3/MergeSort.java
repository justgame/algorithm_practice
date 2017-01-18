package algorithm.chapter2.chapter2_3;

import java.util.Arrays;
import java.util.Random;

/**
 * Created by xcl on 2017-01-12.
 * 合并排序
 */
public class MergeSort {
    public static void merge(int[] data, int p, int q, int r) {
        int len1 = q - p + 1;
        int len2 = r - q;
        int[] data1 = new int[len1];
        int[] data2 = new int[len2];
        int i = -1;
        int j = -1;
        while (++i < len1)
            data1[i] = data[p + i];
        while (++j < len2)
            data2[j] = data[q + 1 + j];
        i = 0;
        j = 0;
        int k = p - 1;
        while (++k <= r) {
            if (i >= len1) {
                for (; j < len2; j++, k++) {
                    data[k] = data2[j];
                }
                break;
            }
            if (j >= len2) {
                for (; i < len1; i++, k++) {
                    data[k] = data1[i];
                }
                break;
            }
            if (data1[i] <= data2[j]) {
                data[k] = data1[i];
                i++;
            } else {
                data[k] = data2[j];
                j++;
            }
        }
    }

    public static void mergeSort(int[] data, int p, int r) {
        if (p < r) {
            int q = (p + r) / 2;
            mergeSort(data, p, q);
            mergeSort(data, q+1, r);
            merge(data, p, q, r);
        }
    }

    public static void main(String[] args) {
        int n = 20;
        int[] data = new int[n];
        for (int i = 0; i < n; i++) {
            Random random = new Random();
            data[i] = random.nextInt(100);
        }
        mergeSort(data,0, n-1);
        System.out.println(Arrays.toString(data));
    }
}
