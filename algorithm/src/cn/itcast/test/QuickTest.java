package cn.itcast.test;

import cn.itcast.sort.Quick;

import java.util.Arrays;

/**
 *  快速排序的测试类
 *  date: 2020/7/8
 */
public class QuickTest {
    public static void main(String[] args) {
        // 原始数据
        Integer[] arr = {6, 1, 2, 7, 9, 3, 4, 5, 8};

        // 调用快排函数，对数组进行排序
        Quick.sort(arr);

        // 输出排序后的数组
        System.out.println(Arrays.toString(arr));
    }
}
