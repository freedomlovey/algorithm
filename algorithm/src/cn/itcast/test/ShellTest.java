package cn.itcast.test;

import cn.itcast.sort.Shell;

import java.util.Arrays;

/**
 *  希尔排序的测试类
 *  date: 2020/7/6
 */
public class ShellTest {
    public static void main(String[] args) {
        // 原始数据
        Integer[] arr = {9, 1, 2, 5, 7, 4, 8, 6, 3, 5};
        Shell.sort(arr);

        // 输出排序后的结果
        System.out.println(Arrays.toString(arr));
    }
}
