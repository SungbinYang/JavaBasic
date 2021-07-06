package me.sungbin.chapter2.ch02_08;

public class Person {

    public int height;
    public int weight;
    public String gender;
    public String name;
    public int age;

    public Person(int height, int weight, String gender, String name, int age) {
        this.height = height;
        this.weight = weight;
        this.gender = gender;
        this.name = name;
        this.age = age;
    }

    public String showInfo() {
        return "키가 " + this.height + "이고 몸무게가 " + this.weight + " 킬로인 " + this.gender + "이 있습니다. 이름은 " + this.name + "이고 나이는 " + this.age + "입니다.";
    }
}
