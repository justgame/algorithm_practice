package algorithm.chapter2.chapter2_2;

import java.util.Arrays;

/**
 * Created by xcl on 2017-01-11.
 * 练习2.2-2
 * 选择排序
 */
public class ChooseSort {
    public static void chooseSort(int[] data) {
        if (data == null)
            return;
        for (int i = 0, j = data.length; i < j; i++) {
            int min = data[i];
            int k = i;
            while (++k < j)
                if (min > data[k]) {
                    int temp = data[k];
                    data[k] = min;
                    min = temp;
                }
            data[i] = min;
        }
    }

    public static void main(String[] args) {
        int[] data = {7, 3, 5, 1, 2, 8, 4};
        chooseSort(data);
        System.out.println(Arrays.toString(data));
    }
}
