package me.sungbin.chapter2.ch02_08;

public class Order {

    public String orderNumber;
    public String orderPhoneNumber;
    public String address;
    public String orderDate;
    public String orderTime;
    public int price;
    public String menuNumber;

    public Order(String orderNumber, String orderPhoneNumber, String address, String orderDate, String orderTime, int price, String menuNumber) {
        this.orderNumber = orderNumber;
        this.orderPhoneNumber = orderPhoneNumber;
        this.address = address;
        this.orderDate = orderDate;
        this.orderTime = orderTime;
        this.price = price;
        this.menuNumber = menuNumber;
    }

    public void showInfo() {
        System.out.println("주문 접수 번호 : " + this.orderNumber);
        System.out.println("주문 핸드폰 번호 : " + this.orderPhoneNumber);
        System.out.println("주문 집 주소: " + this.address);
        System.out.println("주문 날짜 : " + this.orderDate);
        System.out.println("주문 시간 : " + this.orderTime);
        System.out.println("주문 가격 : " + this.price);
        System.out.println("메뉴 번호 : " + this.menuNumber);
    }
}
