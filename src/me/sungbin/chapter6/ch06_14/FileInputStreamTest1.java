package me.sungbin.chapter6.ch06_14;

import java.io.FileInputStream;
import java.io.IOException;

public class FileInputStreamTest1 {
    public static void main(String[] args) {

        try (FileInputStream fis = new FileInputStream("input.txt")) {
            System.out.println((char) fis.read());
            System.out.println((char) fis.read());
            System.out.println((char) fis.read());
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println("end");
    }
}
