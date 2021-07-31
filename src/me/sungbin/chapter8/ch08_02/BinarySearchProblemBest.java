package me.sungbin.chapter8.ch08_02;

import java.util.Scanner;

public class BinarySearchProblemBest {
    public static void main(String[] args) {

        int[] arr = {12, 25, 31, 48, 54, 66, 70, 83, 95, 108};
//        int[] arr = {108, 95, 83, 70,66, 54, 48, 31, 25, 12};
        System.out.println("숫자를 입력해주세요: ");

        Scanner sc = new Scanner(System.in);
        int target = sc.nextInt();

        int left = 0;
        int right = arr.length - 1;
        int mid = (left + right) / 2;

        int temp = arr[mid];
        boolean isFind = false;

        while (left <= right) {
            if (target == temp) {
                isFind = true;
                break;
            } else if (target < temp) {
                right = mid - 1;
            } else {
                left = mid + 1;
            }
            mid = (left + right) / 2;
            temp = arr[mid];
        }

        if (isFind) {
            System.out.println("찾는 수는 " + mid + "번째 있습니다.");
        } else {
            System.out.println("찾는 수가 없습니다.");
        }
        sc.close();
    }
}
