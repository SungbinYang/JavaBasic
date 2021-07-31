# 01. 나열된 수에서 최솟값과 최댓값 구하기

## 문제 정의

- 여러 개의 수가 배열에 있을 때 그 중 가장 큰 값과 가장 작은 값을 찾는다.

- 배열의 몇 번째에 있는지 순서를 찾는다.

- 반복문을 한번만 사용하여 문제를 해결한다.

- 수의 예 : [10, 55, 23, 2, 79, 101, 16, 82, 30, 45]


## 해결하기

Math의 min(), max()를 쓰면 금방 풀리지만 한번 안쓰고 풀어보자.

배열에 있는 수 중 맨 처음에 있는 값을 max와 min으로 가정하고, 배열의 마지막 숫자까지 비교하면서 더 큰 수나 더 작은 수가 나올때 max와 min의 값을 바꾸도록 한다.

그때의 위치를 변수에 저장한다.


## 프로그래밍

``` java
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

```

## 수행 시간 분석

반복문의 한번 수행으로 두 개의 원하는 값을 모두 찾을 수 있다. 이 경우 수행 속도는 나열된 수의 개수에 비례하므로 O(n)이 된다.
