package me.sungbin.chapter3.ch03_16.quiz2;

public class LeastJob implements Scheduler {

    @Override
    public void getNextCall() {
        System.out.println("대기가 적은 상담원부터 대기열에서 가져옵니다.");
    }

    @Override
    public void sendCallToAgent() {
        System.out.println("대기가 적은 상담원부터 배분합니다.");
    }
}
