package me.sungbin.chapter3.ch03_06;

public class VIPCustomer extends Customer {

    double salesRatio;
    private String agentId;

//    public VIPCustomer() {
//        super(0, "no-name");
//        bonusRatio = 0.05;
//        salesRatio = 0.1;
//        customerGrade = "VIP";
//
//        System.out.println("VIPCustomer() call");
//    }

    public VIPCustomer(int customerId, String customerName) {
        super(customerId, customerName);
        bonusRatio = 0.05;
        salesRatio = 0.1;
        customerGrade = "VIP";
    }

    public String getAgentId() {
        return agentId;
    }

    @Override
    public int calcPrice(int price) {
        bonusPoint += price * bonusRatio;
        price -= (int) (price * salesRatio);
        return price;
    }
}
