package cn.itcast.sort;

/**
 * 冒泡排序
 * date: 2020/7/6
 */
public class Bubble {
    /**
     * 对a中元素进行排序
     */
    public static void sort(Comparable[] a) {

        /*for (int i = 0; i < a.length; i++) {
            for (int j = 1; j < a.length - i; j++) {
                if (greater(a[j-1], a[j])) {
                    exchange(a, j-1, j);
                }
            }
        }*/

        for (int i = a.length - 1; i > 0; i--) {
            for (int j = 0; j < i; j++) {
                // 比较索引j和j+1处的值
                if (greater(a[j], a[j+1])) {
                    // 交换两个值
                    exchange(a, j, j+1);
                }
            }
        }
    }

    /**
     *  比较v元素是否大于w元素
     */
    private static boolean greater(Comparable v, Comparable w) {
        return v.compareTo(w) > 0;
    }

    /**
     *  数组元素i和j交换位置
     */
    private static void exchange(Comparable[] a, int i, int j) {
        Comparable temp;
        temp = a[i];
        a[i] = a[j];
        a[j] = temp;
    }
}
