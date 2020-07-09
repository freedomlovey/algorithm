package cn.itcast.sort;

/**
 *  归并排序算法的实现
 *  date: 2020/7/7
 */
public class Merge {
    // 归并所需要的辅助数组
    private static Comparable[] assist;

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

    // 对数组a中元素进行排序
    public static void sort(Comparable[] a) {
        // 1.初始化辅助数组assist
        assist = new Comparable[a.length];

        // 2.定义low变量和high变量，分别记录数组中的最小索引和最大索引
        int low = 0;
        int high = a.length - 1;

        // 3.调用sort重载方法，完成a数组中从索引low到high的元素的排序
        sort(a, low, high);

    }

    // 对数组a中从low到high的元素进行排序
    private static void sort(Comparable[] a, int low, int high) {
        // 做安全校验
        if (high <= low) {
            return;
        }

        // 对low到high之间的数据进行分组
        int mid = low + (high-low)/2;

        // 分别对每一组数据进行排序
        sort(a, low, mid);
        sort(a, mid+1, high);

        // 再把两个组中的数据进行归并
        merge(a, low, mid, high);

    }

    // 对数组中元素，从low到mid为一组，从mid+1到high为一组，对这两组数据进行归并
    private static void merge(Comparable[] a, int low, int mid, int high) {
        // 定义三个指针
        int i = low;
        int left = low;
        int right = mid+1;

        // 遍历，移动left和right指针，比较对应索引处的值，找出小的那个，放到辅助数组的对应索引处
        while (left <= mid && right <= high) {
            // 将小的元素放到辅助数组的对应索引处
            if (less(a[left], a[right])) {
                // 将left组的元素放到辅助数组的对应索引处
                assist[i] = a[left];
                // 元素放到辅助数组中之后，移动对应指针
                i = i + 1;
                left = left + 1;
            } else {
                // 将right组的元素放到辅助数组的对应索引处
                assist[i] = a[right];
                // 元素放到辅助数组中之后，移动对应指针
                i = i + 1;
                right = right + 1;
            }
        }

        // 遍历，如果left指针没走完，那么顺序移动left指针，把对应的元素放到辅助数组的对应索引处
        while (left <= mid) {
            // 将left组的元素放到辅助数组的对应索引处
            assist[i] = a[left];
            // 元素放到辅助数组中之后，移动对应指针
            i = i + 1;
            left = left + 1;
        }

        // 遍历，如果right指针没走完，那么顺序移动right指针，把对应的元素放到辅助数组的对应索引处
        while (right <= high) {
            // 将right组的元素放到辅助数组的对应索引处
            assist[i] = a[right];
            // 元素放到辅助数组中之后，移动对应指针
            i = i + 1;
            right = right + 1;
        }

        // 把辅助数组中的元素拷贝到原数组中
        for (int index = 0; index <= high; index++) {
            a[index] = assist[index];
        }

    }
}
