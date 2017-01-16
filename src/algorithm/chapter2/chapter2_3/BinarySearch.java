package algorithm.chapter2.chapter2_3;

/**
 * Created by xcl on 2017-01-13.
 * 练习2.3-5
 * 二分查找 递归实现（已排序）
 */
public class BinarySearch {
    public static int binarySearch(int[] data, int p, int r, int key) {
        if (p == r && data[p] == key)
            return p;
        if (r > p) {
            int q = (p + r) / 2;
            if (data[q] == key)
                return q;
            else if (data[q] < key)
                return binarySearch(data, q + 1, r, key);
            else
                return binarySearch(data, p, q - 1, key);
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] data = {1, 2, 3, 4, 5, 6, 7, 8, 8, 11, 22, 55, 66, 77, 78};
        System.out.println(binarySearch(data, 0, data.length - 1, 8));
    }
}
