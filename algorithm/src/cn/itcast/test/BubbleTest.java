package cn.itcast.test;

import cn.itcast.sort.Bubble;

import java.util.Arrays;

/**
 *  冒泡排序的测试类
 */
public class BubbleTest {
    public static void main(String[] args) {
        Integer[] arr = {4, 5, 6, 1, 2, 3};
        Bubble.sort(arr);

        System.out.println(Arrays.toString(arr));
    }
}
