package algorithm.chapter2.chapter2_1;

/**
 * Created by xcl on 2017-01-11.
 * 练习2.1-3
 * 在一个数组中找出给定数出现的第一个位置的下标，没找到返回null
 */
public class NumSearch {
    public static Integer numSearch(int[] data, int key) {
        if (data == null)
            return null;
        int i = -1;
        int j = data.length;
        while (++i < j && data[i] != key);
        return i < j ? i : null;
    }

    public static void main(String[] args) {
        int[] data = {4, 6, 1, 3, 24, 5, 77, 33, 42, 55, 73, 24};
        int key = 24;
        System.out.println(numSearch(data, key));
    }
}
