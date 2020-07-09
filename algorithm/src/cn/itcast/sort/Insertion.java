package cn.itcast.sort;

/**
 *  插入排序的实现
 *  date: 2020/7/6
 */
public class Insertion {
    // 对a中元素进行排序
    public static void sort(Comparable[] a) {
        // 获得a数组的长度
        int length = a.length;
        // 找到待排序的元素
        for (int i = 1; i < length; i++) {
            // 倒序遍历已排序的数组
            for (int j = i; j > 0; j--) {
                // 比较索引j处元素和索引j-1处索引值
                // 如果j处索引值小于j-1处索引值，交换两个元素
                // 如果j处索引值大于j-1处索引值，退出循环
                if (greater(a[j-1], a[j])) {
                    // 交换元素
                    exchange(a, j, j-1);
                } else {
                    // 待排序元素已经找到合适的位置，退出循环
                    break;
                }
            }
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
