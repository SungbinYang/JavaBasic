# 02. 정렬된 수에서 하나의 수의 위치 찾기

## 문제 정의

- 여러 개의 수가 정렬된 순서로 있을 때 특정한 수를 찾는 방법

- 단순 반복문을 이용하면 수의 개수에 따라 비교 횟수가 증가하는 O(n)의 수행이 이루어짐

- 수가 정렬된 상태에서는 이진 탐색(binary search)을 활용하면 매번 비교되는 요소의 수가 절반으로 감소될 수 있으므로 O(logN)의 수행으로 원하는 수를 찾을 수 있음

- 수의 예 : [12, 25, 31, 48, 54, 66, 70, 83, 95, 108]

- 83의 위치를 찾아보세요

- 88의 위치를 찾아보세요

## 해결 방법

- 수가 정렬된 상태이므로 중간의 값을 하나 선택한다. 찾으려는 값이 그보다 크면 범위를 오른쪽으로 그보다 작으면 범위를 왼쪽으로 좁힐수 있다.

- 한번 비교 할때 마다 1/2씩 범위가 좁혀진다.

## 프로그래밍

* 내 풀이
``` java
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

```

* 베스트 풀이
```java
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

```
