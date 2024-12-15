package com.faqihdev.design_pattern.factory.payment;

import org.springframework.stereotype.Service;

@Service("stripe")
public class StripeGateway implements PaymentGateway {
    @Override
    public void proccessPayment(double amount, String currency) {
        System.out.println("Processing Stripe payment with amount of " + amount + " " + currency);
    }
}

