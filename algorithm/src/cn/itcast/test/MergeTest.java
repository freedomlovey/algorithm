package cn.itcast.test;

import cn.itcast.sort.Merge;

import java.util.Arrays;

/**
 *  归并排序的测试类
 *  date: 2020/7/7
 */
public class MergeTest {
    public static void main(String[] args) {
        // 原始数据
        Integer[] arr = {8, 4, 5, 7, 1, 3, 6, 2};
        // 调用归并排序函数
        Merge.sort(arr);

        // 输出排好序的数组
        System.out.println(Arrays.toString(arr));

    }
}
