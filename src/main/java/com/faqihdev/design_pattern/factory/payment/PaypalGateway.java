package com.faqihdev.design_pattern.factory.payment;

import org.springframework.stereotype.Service;

@Service("paypal")
public class PaypalGateway implements PaymentGateway {
    @Override
    public void proccessPayment(double amount, String currency) {
        System.out.println("Processing paypal payment with amount of " + amount + " " + currency);
    }
}
