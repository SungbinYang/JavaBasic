package me.sungbin.chapter2.ch02_15;

public class Test {
    public static void main(String[] args) {

        Student student = new Student("Edward", 20000);

        Taxi taxi = new Taxi("잘나간다 운수");
        student.takeTaxi(taxi);

        student.showInfo();
        taxi.showInfo();
    }
}
