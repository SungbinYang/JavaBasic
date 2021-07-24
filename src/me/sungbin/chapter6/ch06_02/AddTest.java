package me.sungbin.chapter6.ch06_02;

public class AddTest {
    public static void main(String[] args) {

        Add sum = Integer::sum;

        System.out.println(sum.add(2, 3));
    }
}
