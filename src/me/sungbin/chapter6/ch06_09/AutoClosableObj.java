package me.sungbin.chapter6.ch06_09;

public class AutoClosableObj implements AutoCloseable{

    @Override
    public void close() throws Exception {
        System.out.println("closing...");
    }
}
