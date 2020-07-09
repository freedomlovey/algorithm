package cn.itcast.sort;

/**
 *  快速排序的实现
 *  date: 2020/7/8
 */
public class Quick {

    // 比较v元素是否小于w元素
    private static boolean less(Comparable v, Comparable w) {
        return v.compareTo(w) < 0;
    }

    // a数组中的索引i和j对应的数组元素交换位置
    private static void exchange(Comparable[] a, int i, int j) {
        Comparable temp;
        temp = a[i];
        a[i] = a[j];
        a[j] = temp;
    }

    // 对数组内元素进行排序
    public static void sort(Comparable[] a) {
        // 对数组a中所有的元素进行排序
        int low = 0;
        int high = a.length - 1;
        // 调用函数对数组a中从索引low到索引high的元素排序
        sort(a, low, high);
    }

    // 对数组a中从索引low到索引high之间的元素进行排序
    public static void sort(Comparable[] a, int low, int high) {
        // 安全性校验,如果左边界大于右边界，直接退出
        if (high <= low) {
            return;
        }

        // 对数组a中从low索引到high索引的元素进行分组（左子组和右子组）
        int partition = partition(a, low, high);

        // 对分组后的两组元素进行排序
        // 让左子组有序
        sort(a, low, partition-1);

        // 让右子组有序
        sort(a, partition+1, high);

    }

    // 对数组a中从索引low到索引之间的元素进行分组，并返回分组界限对应的索引值
    public static int partition(Comparable[] a, int low, int high) {
        // 选定分界值
        Comparable key = a[low];

        // 定义两个指针，分别指向带切分元素的最小索引和最大索引的下一个位置
        int left = low;
        int right = high+1;

        // 分组
        while (true) {
            // 从右往左扫描，移动right指针，找到一个比分界值小的元素，停止
            while (less(key, a[--right])) {
                // 如果right指针移动到左边界，循环结束
                if (right == low) {
                    break;
                }
            }

            // 从左往右扫描，移动left指针，找到一个比分界值大的元素，停止
            while (less(a[++left], key)) {
                // 如果left指针移动到右边界，循环结束
                if (left == high) {
                    break;
                }
            }

            // 判断left>=right，如果是，则证明元素扫描完毕，结束循环。如果不是，则交换元素。
            if (left >= right) {
                break;
            } else {
                // 交换元素，将大的元素放到分界值的右边，小的元素放到分界值的左边
                exchange(a, left, right);
            }
        }

        // 交换元素，将分组的界限值移动到两组的中间
        exchange(a, low, right);

        // 返回值为界限值的位置
        return right;
    }
}
