package me.sungbin.chapter1.ch01_12;

public class LogicalTest {
    public static void main(String[] args) {

        int num1 = 10;
        int i = 2;

        // short circuit Evaluation
        boolean val = ((num1 += 10) < 10) && ((i += 2) < 10);
        System.out.println(val);
        System.out.println(num1);
        System.out.println(i);
    }
}
