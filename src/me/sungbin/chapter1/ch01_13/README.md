# 13. 자바의 연산자들 -3 (조건 연산자, 비트 연산자)

## 조건 연산자

- 삼항 연산자

- 조건식의 결과가 true(참)인 경우와 false(거짓)인 경우에 따라 다른 결과가 수행됨

- if (조건문)을 간단히 표현할 때 사용 할 수 있음


![conditionop](https://gitlab.com/easyspubjava/javacoursework/-/raw/master/Chapter1/01-13/img/conditionop.png)

``` java
package me.sungbin.chapter1.ch01_13;

import java.util.Scanner;

public class ConditionTest {
    public static void main(String[] args) {

        int max;

        System.out.println("두 수를 입력 받아서 더 큰 수를 출력하세요.");
        Scanner scanner = new Scanner(System.in);
        System.out.print("입력1: ");
        int num1 = scanner.nextInt();
        System.out.print("입력 2: ");
        int num2 = scanner.nextInt();

        max = (num1 > num2) ? num1 : num2;
        System.out.println(max);
    }
}

```


## 비트 연산자

- 대입연산자와 다른 연산자가 함께 쓰임

- 마스크 : 특정 비트를 가리고 몇 개의 비트 값만 사용할 때

- 비트켜기 : 특정 비트들만을 1로 설정해서 사용하고 싶을 때<br>
  예)  & 00001111 ( 하위 4비트 중 1인 비트만 꺼내기)

- 비트끄기 : 특정 비트들만을 0으로 설정해서 사용하고 싶을 때<br>
  예)  | 11110000 ( 하위 4비트 중 0 인 비트만 0으로 만들기)

- 비트 토글 :  모든 비트들을 0은 1로, 1은 0으로 바꾸고 싶을 때

![bit](https://gitlab.com/easyspubjava/javacoursework/-/raw/master/Chapter1/01-13/img/bit.PNG)

``` java
package me.sungbin.chapter1.ch01_13;

public class BitOperationTest {
    public static void main(String[] args) {

        int num1 = 5;
        int num2 = 10;

        System.out.println(num1 | num2);
        System.out.println(num1 & num2);
        System.out.println(num1 ^ num2);
        System.out.println(~num1);

        System.out.println(num1 << 2);
        System.out.println(num1 <<= 2);
        System.out.println(num1 >> 1);
    }
}

```

## 연산자 우선순위

![priority](https://gitlab.com/easyspubjava/javacoursework/-/raw/master/Chapter1/01-13/img/priority.png)
