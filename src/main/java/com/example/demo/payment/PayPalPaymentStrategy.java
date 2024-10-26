package com.example.demo.payment;

public class PayPalPaymentStrategy implements Payment {

    @Override
    public String pay(Integer price) {
        return "Payed " + price + " by PayPal";
    }

}
