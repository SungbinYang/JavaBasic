package me.sungbin.chapter6.ch06_05;

public class StringConcatTest {
    public static void main(String[] args) {

        String str1 = "Hello";
        String str2 = "World!";

        StringConcatImpl stImpl = new StringConcatImpl();
        stImpl.makeString(str1, str2);

        StringConcat concat = (s1, s2) -> System.out.println(s1 + "," + s2);
        concat.makeString(str1, str2);

        StringConcat concat2 = new StringConcat() {
            @Override
            public void makeString(String str1, String str2) {
                System.out.println(str1 + "...." + str2);
            }
        };

        concat2.makeString(str1, str2);
    }
}
