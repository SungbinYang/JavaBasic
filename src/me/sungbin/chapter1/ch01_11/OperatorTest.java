package me.sungbin.chapter1.ch01_11;

public class OperatorTest {
    public static void main(String[] args) {

        int gameScore = 150;
        int lastScore = ++gameScore; // gameScore += 1;
        System.out.println(lastScore);
        System.out.println(gameScore);

        int newScore = gameScore++;
        System.out.println(newScore);
        System.out.println(gameScore);
    }
}
