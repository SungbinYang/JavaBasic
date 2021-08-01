package me.sungbin.chapter8.ch08_07;

public class FibonacciMemTest {

    int[] value;
    int number;

    public FibonacciMemTest(int number) {
        this.number = number;
        value = new int[number];
    }

    public int fibonacciMem(int n) {
        value[0] = 1;
        value[1] = 1;
        int result = 0;

        if (n == 0) {
            return value[0];
        }

        if (n == 1) {
            return value[1];
        }

        for (int i = 2; i <=n; i++) {
            result = value[i-1] + value[i-2];

            if (value[i] == 0) value[i] = result;
        }
        return result;
    }

    public static void main(String[] args) {
        FibonacciMemTest fibonacciMemTest = new FibonacciMemTest(100);

        int result = fibonacciMemTest.fibonacciMem(10);
        System.out.println(result);
    }
}
