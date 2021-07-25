package me.sungbin.chapter6.ch06_13;

import java.io.IOException;
import java.io.InputStreamReader;

public class SystemInTest1 {
    public static void main(String[] args) {

        System.out.println("알파벳 하나를 쓰고 [Enter]를 누르세요");

        int i;
        try (InputStreamReader irs = new InputStreamReader(System.in)) {
            while ((i = irs.read()) != '\n') {
                System.out.print((char) i);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
