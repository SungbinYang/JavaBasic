package me.sungbin.chapter4.ch04_04;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;

public class StringTest {
    public static void main(String[] args) throws ClassNotFoundException {

        Class<?> c = Class.forName("java.lang.String");
        Constructor[] cons =  c.getConstructors();

        for (Constructor con : cons) {
            System.out.println(con);
        }

        Method[] m = c.getMethods();
        System.out.println("=========================");
        for (Method method : m) {
            System.out.println(method);
        }
    }
}
