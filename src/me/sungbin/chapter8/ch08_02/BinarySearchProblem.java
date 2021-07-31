package me.sungbin.chapter8.ch08_02;

import java.util.Arrays;
import java.util.Scanner;
import java.util.stream.IntStream;

public class BinarySearchProblem {
    public static void main(String[] args) {
        int[] arr = {12, 25, 31, 48, 54, 66, 70, 83, 95, 108};
//        int[] arr = {108, 95, 83, 70,66, 54, 48, 31, 25, 12};
        System.out.print("찾으려는 수를 입력하세요: ");
        Scanner sc = new Scanner(System.in);
        int target = sc.nextInt();
        int result = 0;
        int startNum = arr[0];
        int endNum = arr[arr.length - 1];

        int mid = (arr.length / 2) - 1;

        if (IntStream.of(arr).anyMatch(n -> n == target)) {
            if (endNum - startNum > 0) {
                for (int i = 0; i < mid; i++) {
                    if (mid + i <= arr.length - 1 || mid - i < 0) {
                        if (target > arr[mid]) {
                            if (target == arr[mid + i]) {
                                result = mid + i;
                            }
                        } else {
                            if (target == arr[mid - i]) {
                                result = mid - i;
                            }
                        }
                    }
                }
                System.out.println(target + "의 위치는 " + result + "입니다.");
            } else {
                for (int i = 0; i < mid; i++) {
                    if (mid + i <= arr.length - 1 || mid - i < 0) {
                        if (target > arr[mid]) {
                            if (target == arr[mid - i]) {
                                result = mid - i;
                            }
                        } else {
                            if (target == arr[mid + i]) {
                                result = mid + i;
                            }
                        }
                    }
                }
            }
        } else {
            System.out.println("배열에 포함되지 않은 숫자입니다.");
        }
        sc.close();
    }
}
