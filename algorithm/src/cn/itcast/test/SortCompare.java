package cn.itcast.test;

import cn.itcast.sort.Insertion;
import cn.itcast.sort.Merge;
import cn.itcast.sort.Shell;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

/**
 *  测试希尔排序和插入排序的效率
 *  date: 2020/7/6
 *
 *  date: 2020/7/7
 *  增加归并排序的测试
 */
public class SortCompare {
    // 调用不同的测试方法完成测试
    public static void main(String[] args) throws Exception {
        // 1.创建一个ArrayList集合，保存读取出来的整数
        ArrayList<Integer> list = new ArrayList<>();

        // 2.创建缓存读取流BufferedReader读取数据，并存到ArrayList中
        BufferedReader reader = new BufferedReader(new InputStreamReader(SortCompare.class.getClassLoader().getResourceAsStream("reverse_arr.txt")));
        String line = null;
        while ((line = reader.readLine()) != null) {
            // line是字符串，把line转换成Integer，存储到集合中
            int i = Integer.parseInt(line);
            list.add(i);
        }

        // 关闭流
        reader.close();

        // 3.把ArrayList集合转换为数组
        Integer[] arr = new Integer[list.size()];
        list.toArray(arr);

        // 4.调用测试代码，完成测试
        // testInsertion(arr); //57271毫秒
         testShell(arr); //40毫秒
        // testMerge(arr);
    }

    // 希尔排序的测试
    public static void testShell(Integer[] a) {
        // 1、获取执行之前的时间
        long start = System.currentTimeMillis();

        // 2、执行算法代码
        Shell.sort(a);

        // 3、获取执行之后的时间
        long end = System.currentTimeMillis();

        // 4、计算得程序执行的时间，并输出
        System.out.println("希尔排序执行的时间：" + (end - start) + "毫秒");
    }

    // 插入排序的测试
    public static void testInsertion(Integer[] a) {
        // 1、获取执行之前的时间
        long start = System.currentTimeMillis();

        // 2、执行算法代码
        Insertion.sort(a);

        // 3、获取执行之后的时间
        long end = System.currentTimeMillis();

        // 4、计算得程序执行的时间，并输出
        System.out.println("插入排序执行的时间：" + (end - start) + "毫秒");
    }

    // 归并排序的测试
    public static void testMerge(Integer[] a) {
        // 1、获取执行之前的时间
        long start = System.currentTimeMillis();

        // 2、执行算法代码
        Merge.sort(a);

        // 3、获取执行之后的时间
        long end = System.currentTimeMillis();

        // 4、计算得程序执行的时间，并输出
        System.out.println("归并排序执行的时间：" + (end - start) + "毫秒");
    }
}
