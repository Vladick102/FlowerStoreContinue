package com.example.demo;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import com.example.demo.payment.CreditCardPaymentStrategy;
import com.example.demo.payment.PayPalPaymentStrategy;

public class PaymentTests {
    CreditCardPaymentStrategy creditPaymentStrategy;
    PayPalPaymentStrategy payPalPaymentStrategy;

    @Test
    void testCreditPayment() {
        creditPaymentStrategy = new CreditCardPaymentStrategy();

        int price = 10;
        Assertions.assertEquals(creditPaymentStrategy.pay(price),
                "Payed " + price + " by Credit Card");
    }

    @Test
    void testPayPalPayment() {
        payPalPaymentStrategy = new PayPalPaymentStrategy();

        int price = 20;
        Assertions.assertEquals(payPalPaymentStrategy.pay(price), "Payed " + price + " by PayPal");
    }

}
