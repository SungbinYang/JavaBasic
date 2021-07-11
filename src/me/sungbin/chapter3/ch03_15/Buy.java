package me.sungbin.chapter3.ch03_15;

public interface Buy {

    void buy();

    default void order() {
        System.out.println("buy order");
    }
}
