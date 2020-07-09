package cn.itcast.test;

import cn.itcast.sort.Insertion;

import java.util.Arrays;

/**
 *  插入排序的测试类
 *  date: 2020/7/6
 */
public class InsertionTest {
    public static void main(String[] args) {
        // 原始数据
        Integer[] arr = {4, 3, 2, 10, 12, 1, 5, 6};
        Insertion.sort(arr);

        // 输出排序后的结果
        System.out.println(Arrays.toString(arr));
    }
}
