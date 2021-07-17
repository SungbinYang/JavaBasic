package me.sungbin.chapter5.ch05_07;

public class Plastic  extends Material{

    @Override
    public String toString() {
        return "재료는 Plastic 입니다.";
    }

    @Override
    public void doPrinting() {
        System.out.println("Plastic 재료로 출력합니다");
    }
}
