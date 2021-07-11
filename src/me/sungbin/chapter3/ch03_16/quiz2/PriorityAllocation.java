package me.sungbin.chapter3.ch03_16.quiz2;

public class PriorityAllocation implements Scheduler {

    @Override
    public void getNextCall() {
        System.out.println("숙련도가 높은 상담부터 대기열에서 가져옵니다.");
    }

    @Override
    public void sendCallToAgent() {
        System.out.println("우선순위가 높은 고객부터 상담원에게 배분합니다.");
    }
}
