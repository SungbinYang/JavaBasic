package me.sungbin.chapter1.ch01_10;

public class TypeConversion {
    public static void main(String[] args) {

        int iNum = 255;
        byte bNum = (byte) iNum;
        System.out.println(bNum);

        double dNum = 3.14;
        int i = (int) dNum;
        System.out.println(i);

        double dNumber = 1.2;
        float fNum = 0.9f;

        int num1 = (int) dNumber + (int) fNum;
        int num2 = (int) (dNumber + fNum);

        System.out.println(num1);
        System.out.println(num2);
    }
}
