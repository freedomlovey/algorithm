package cn.itcast.sort;

/**
 *  希尔排序的实现
 *  date: 2020/7/6
 */
public class Shell {
    // 对a中元素进行排序
    public static void sort(Comparable[] a) {
        // 获得数组的长度
        int length = a.length;

        // 确定增长量h的最大值
        int h = 1;
        while (h < length/2) {
            h = 2 * h + 1;
        }

        // h小于1，循环结束
        while (h >= 1) {
            // 找到待插入的元素
            for (int i = h; i < length; i++) {
                // 将待插入元素插入到已排好序的数组中
                for (int j = i; j >= h; j = j-h) {
                    // 待插入的元素a[j]，比较a[j]和a[j-h]
                    if (greater(a[j-h], a[j])) {
                        // 交换元素
                        exchange(a, j-h, j);
                    } else {
                        // 待插入的元素已经找到合适的位置，结束循环
                        break;
                    }
                }
            }
            // 减小h的值
            h = h / 2;
        }
    }

    // 比较v元素和w元素
    private static boolean greater(Comparable v, Comparable w) {
        return v.compareTo(w) > 0;
    }

    // 交换两个元素
    private static void exchange(Comparable[] a, int i, int j) {
        Comparable temp;
        temp = a[i];
        a[i] = a[j];
        a[j] = temp;
    }
}
