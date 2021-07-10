package me.sungbin.chapter2.ch02_22;

public class TwoDimensionTest {
    public static void main(String[] args) {

        int[][] arr = {{1, 2, 3}, {1, 2, 3, 4}};

        for (int[] ints : arr) {
            for (int anInt : ints) {
                System.out.print(anInt + ",");
            }
            System.out.println("\t" + ints.length);
        }
    }
}
