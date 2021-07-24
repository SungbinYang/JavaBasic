package me.sungbin.chapter6.ch06_09;

import java.io.FileInputStream;
import java.io.IOException;

public class FileExceptionHandling {
    public static void main(String[] args) {

        try(FileInputStream fis = new FileInputStream("a.txt")) {
            System.out.println("read");
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println("end");
    }
}
