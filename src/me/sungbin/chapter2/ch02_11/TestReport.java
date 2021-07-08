package me.sungbin.chapter2.ch02_11;

public class TestReport {
    public static void main(String[] args) {

        MakeReport report = new MakeReport();
        String builder = report.getReport();

        System.out.println(builder);
    }
}
