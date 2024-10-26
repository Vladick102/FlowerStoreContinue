package com.example.demo.payment;

public class CreditCardPaymentStrategy implements Payment {

    @Override
    public String pay(Integer price) {
        return "Payed " + price + " by Credit Card";
    }

}
