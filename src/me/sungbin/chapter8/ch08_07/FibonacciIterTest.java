package me.sungbin.chapter8.ch08_07;

public class FibonacciIterTest {

    public int fibonacciIter(int n) {
        int prep = 1;
        int pre = 1;
        int current = 0;

        if (n == 0 || n == 1) return 1;

        for (int i = 2; i <= n; i++) {
            current = prep + pre;
            prep = pre;
            pre = current;
        }

        return current;
    }

    public static void main(String[] args) {
        FibonacciIterTest fibonacciIterTest = new FibonacciIterTest();

        int result = fibonacciIterTest.fibonacciIter(10);
        System.out.println(result);
    }
}
