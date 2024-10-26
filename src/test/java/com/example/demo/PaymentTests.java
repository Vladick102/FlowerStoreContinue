package com.example.demo;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import com.example.demo.payment.CreditCardPaymentStrategy;
import com.example.demo.payment.PayPalPaymentStrategy;

public class PaymentTests {

    @Test
    void testCreditPayment() {
        CreditCardPaymentStrategy creditPaymentStrategy =
                new CreditCardPaymentStrategy();

        final int PRICE = 10;
        Assertions.assertEquals(creditPaymentStrategy.pay(PRICE),
                "Payed " + PRICE + " by Credit Card");
    }

    @Test
    void testPayPalPayment() {
        PayPalPaymentStrategy payPalPaymentStrategy =
                new PayPalPaymentStrategy();

        final int PRICE = 20;
        Assertions.assertEquals(payPalPaymentStrategy.pay(PRICE),
                "Payed " + PRICE + " by PayPal");
    }

}
