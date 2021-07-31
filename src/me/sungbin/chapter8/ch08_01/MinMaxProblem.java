package me.sungbin.chapter8.ch08_01;

public class MinMaxProblem {
    public static void main(String[] args) {

        int[] arr = {10, 55, 23, 2, 79, 101, 16, 82, 30, 45};

        int min = arr[0];
        int max = arr[0];

        int minPos = 0;
        int maxPos = 0;

        for (int i = 0; i < arr.length; i++) {
            if (min > arr[i]) {
                min = arr[i];
                minPos = i;
            }

            if (max < arr[i]) {
                max = arr[i];
                maxPos = i;
            }
        }

        System.out.println("최소값: " + min + "이고, " + minPos + "번째 위치에 있습니다.");
        System.out.println("최대값: " + max + "이고, " + maxPos + "번째 위치에 있습니다.");
    }
}
