package me.sungbin.chapter6.ch06_03;

public class MyNumberTest {
    public static void main(String[] args) {

        MyNumber myNumber = (x, y) -> Math.max(x, y);
        System.out.println(myNumber.getMax(10, 20));
    }
}
