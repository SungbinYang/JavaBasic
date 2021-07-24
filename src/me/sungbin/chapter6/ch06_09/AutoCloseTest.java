package me.sungbin.chapter6.ch06_09;

public class AutoCloseTest {
    public static void main(String[] args) {

        AutoClosableObj obj = new AutoClosableObj();

        try (obj) {
            throw  new Exception();
        } catch (Exception e) {
            System.out.println("exception");
        }

        System.out.println("end");
    }
}
