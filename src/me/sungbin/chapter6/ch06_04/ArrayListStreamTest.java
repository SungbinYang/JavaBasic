package me.sungbin.chapter6.ch06_04;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class ArrayListStreamTest {
    public static void main(String[] args) {

        List<String> sList = new ArrayList<>();
        sList.add("Tomas");
        sList.add("Edward");
        sList.add("Robert");

        Stream<String> stream = sList.stream();
        stream.forEach(System.out::println);

        sList.stream().sorted().forEach(s -> System.out.print(s + "\t"));
        System.out.println();
        sList.stream().map(String::length).forEach(n -> System.out.print(n + "\t"));
        System.out.println();
        sList.stream().filter(s -> s.length() > 5).forEach(n -> System.out.print(n + "\t"));

    }
}
