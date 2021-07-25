package me.sungbin.chapter6.ch06_19;

public class WhippingCream extends Decorator {

    public WhippingCream(Coffee coffee) {
        super(coffee);
    }

    @Override
    public void brewing() {
        super.brewing();
        System.out.println("Adding Whipping Cream");
    }
}
