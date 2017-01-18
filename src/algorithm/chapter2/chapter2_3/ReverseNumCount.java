package algorithm.chapter2.chapter2_3;

import java.util.Arrays;
import java.util.Random;

/**
 * Created by xcl on 2017-01-18.
 * 思考2-4
 * 逆序对计算  使用合并排序修改
 */
public class ReverseNumCount {
    public static int merge(int[] data, int p, int q, int r) {
        int count = 0;
        int len1 = q - p + 1;
        int len2 = r - q;
        int[] arr1 = new int[len1];
        int[] arr2 = new int[len2];
        int i = -1;
        int j = -1;
        while (++i < len1)
            arr1[i] = data[p + i];
        while (++j < len2)
            arr2[j] = data[q + 1 + j];
        i = 0;
        j = 0;
        int k = p - 1;
        while (++k <= r) {
            if (i >= len1) {
                for (; j < len2; j++, k++)
                    data[k] = arr2[j];
                break;
            }

            if (j >= len2) {
                for (; i < len1; i++, k++)
                    data[k] = arr1[i];
                break;
            }

            if (arr1[i] <= arr2[j]) {
                data[k] = arr1[i];
                i++;
            } else {
                data[k] = arr2[j];
                j++;
                count += (len1 - i);
            }
        }
        return count;
    }

    public static int mergeSort(int[] data, int p, int r) {

        if (r > p) {
            int q = (r + p) / 2;
            int count = mergeSort(data, p, q) + mergeSort(data, q + 1, r);
            return count + merge(data, p, q, r);
        }

        return 0;
    }

    public static void main(String[] args) {
        int n = 5;
        int[] data = new int[n];
        for (int i = 0; i < n; i++) {
            Random random = new Random();
            data[i] = random.nextInt(100);
        }
        System.out.println(Arrays.toString(data));
        System.out.println(mergeSort(data,0, n-1));
        System.out.println(Arrays.toString(data));

    }
}
