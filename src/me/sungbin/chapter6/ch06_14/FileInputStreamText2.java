package me.sungbin.chapter6.ch06_14;

import java.io.FileInputStream;
import java.io.IOException;

public class FileInputStreamText2 {
    public static void main(String[] args) {
        int i;
        try (FileInputStream fis = new FileInputStream("input.txt")) {
            while ( (i = fis.read()) != -1) {
                System.out.print((char) i);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
