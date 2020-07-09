package cn.itcast.sort;

/**
 *  选择排序Selection
 *  date: 2020/7/6
 */
public class Selection {
    // 对数组a中的元素进行排序
    public static void sort(Comparable[] a) {
        int length = a.length;
        for (int i = 0; i < length-1; i++) {
            // 假定本次遍历，最小值所在索引时i
            int minIndex = i;
            for (int j = i+1; j < length; j++) {
                // 比较两个索引值，找出最小索引
                if (greater(a[minIndex], a[j])) {
                    // 交换最小值所在的索引
                    minIndex = j;
                }
            }
            // 交换i索引处和minIndex索引处的值
            exchange(a, i, minIndex);
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
