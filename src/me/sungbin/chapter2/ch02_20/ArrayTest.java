package me.sungbin.chapter2.ch02_20;

public class ArrayTest {
    public static void main(String[] args) {

        int[] arr = new int[10];
        int total = 0;

        for (int i = 0, num = 1; i < arr.length; i++) {
            arr[i] = num++;
        }

        for (int num : arr) {
            total += num;
        }

        System.out.println(total);
    }
}
