# 07. 스트림을 활용하여 패키지 여행 비용 계산하기

## 문제 정의

    여행사에 패키지 여행 상품이 있습니다. 여행 비용은 15세 이상은 100만원, 그 미만은 50만원 입니다. 
    고객 세 명이 패키지 여행을 떠난다고 했을 때 비용 계산과 고객 명단 검색등에 대한 연산을 스트림을 활용하여 구현해 봅니다.
    고객에 대한 클래스를 만들고 ArrayList로 고객을 관리 합니다. 

    고객 정보는 다음과 같습니다.

    CustomerLee 
    이름 : 이순신
    나이 : 40
    비용 : 100

    CustomerKim
    이름 : 김유신
    나이 : 20 
    비용 : 100

    CustomerHong
    이름 : 홍길동
    나이 :13
    비용 : 50

## 고객 클래스

``` java
package me.sungbin.chapter6.ch06_07;

public class TravelCustomer {

    private String name; // 이름
    private int age; // 나이
    private int price; // 가격

    public TravelCustomer(String name, int age, int price) {
        this.name = name;
        this.age = age;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "name: " + name + " age: " + age + " price: " + price;
    }
}

```

## 스트림을 활용한 연산 수행

1. 고객의 명단을 출력합니다.

2. 여행의 총 비용을 계산합니다.

3. 고객 중 20세 이상인 사람의 이름을 정렬하여 출력합니다.

``` java
package me.sungbin.chapter6.ch06_07;

import java.util.ArrayList;
import java.util.List;

public class TravelCustomerTest {
    public static void main(String[] args) {

        TravelCustomer customerLee = new TravelCustomer("이순신", 40 , 100);
        TravelCustomer customerKim = new TravelCustomer("김유신", 20 , 100);
        TravelCustomer customerHong = new TravelCustomer("홍길동", 13 , 50);

        List<TravelCustomer> customerList = new ArrayList<>();
        customerList.add(customerLee);
        customerList.add(customerKim);
        customerList.add(customerHong);

        System.out.println("고객 명단 출력");
        customerList.stream().map(TravelCustomer::getName).forEach(System.out::println);

        System.out.println("여행비용");
        int total = customerList.stream().mapToInt(TravelCustomer::getPrice).sum();
        System.out.println(total);

        System.out.println("20세 이상 고객이름 정렬");
        customerList.stream().filter(c -> c.getAge() >= 20 ).map(TravelCustomer::getName).sorted().forEach(System.out::println);
    }
}

```
