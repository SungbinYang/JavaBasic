package me.sungbin.chapter3.ch03_16.quiz1;

public abstract class PlayerLevel {

    abstract void run();

    abstract void jump();

    abstract void turn();

    abstract void showLevelMessage();

    void go(int count) {
        showLevelMessage();
        run();
        for (int i = 1; i <= count; i++) {
            jump();
        }
        turn();
    }

}
