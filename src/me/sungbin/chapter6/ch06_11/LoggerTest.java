package me.sungbin.chapter6.ch06_11;

public class LoggerTest {
    public static void main(String[] args) {

        MyLogger logger = MyLogger.getLogger();

        logger.log("log test");
    }
}
