package cn.itcast.test;

import cn.itcast.sort.Selection;

import java.util.Arrays;

/**
 *  选择排序的测试类
 */
public class SelectionTest {
    public static void main(String[] args) {
        // 原始数据
        Integer[] arr = {4, 6, 8, 7, 9, 2, 10, 1};
        Selection.sort(arr);

        System.out.println(Arrays.toString(arr));
    }
}
