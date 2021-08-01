package me.sungbin.chapter8.ch08_07;

public class FibonacciTest {

    public int fibonacci(int n) {
        if (n == 0 || n == 1) {
            return 1;
        }
        return fibonacci(n-1) + fibonacci(n-2);
    }

    public static void main(String[] args) {
        FibonacciTest fibonacciTest = new FibonacciTest();

        int result = fibonacciTest.fibonacci(10);
        System.out.println(result);
    }
}
