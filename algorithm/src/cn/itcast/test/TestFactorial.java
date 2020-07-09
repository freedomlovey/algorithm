package cn.itcast.test;

/**
 *  联系一下递归程序
 *  date: 2020/7/7
 */
public class TestFactorial {
    public static void main(String[] args) {
        // 调用递归函数
        long result = factorial(10);
        // 输出N的阶乘
        System.out.println(result);
    }

    // 定义一个递归函数，求N的阶乘
    public static long factorial(int n) {
        // 递归函数的出口
        if (n == 1) {
            return 1;
        }
        // 执行递归
        return n*factorial(n-1);
    }
}
