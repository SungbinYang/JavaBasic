package me.sungbin.chapter3.ch03_15;

public interface Sell {

    void sell();

    default void order() {
        System.out.println("sell order");
    }
}
