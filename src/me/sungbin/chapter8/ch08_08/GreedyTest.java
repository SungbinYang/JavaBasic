package me.sungbin.chapter8.ch08_08;

import java.util.Scanner;

public class GreedyTest {
    public static void main(String[] args) {

        int[] coin = {500, 100, 50, 10};

        System.out.println("가격을 입력해주세요: ");
        Scanner sc = new Scanner(System.in);
        int price = sc.nextInt();

        for (int j : coin) {
            int result = price / j;
            price = price % j;
            if (result > 20 || price < 0) {
                System.out.println("가지고 있는 금액이 없습니다.");
                return;
            } else {
                System.out.println(j + "짜리 동전은 " + result + "개가 필요합니다.");
            }
        }
        sc.close();
    }
}
