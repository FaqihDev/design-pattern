package com.faqihdev.design_pattern.factory.payment;

import org.springframework.stereotype.Service;

@Service("square")
public class SquareGateway implements PaymentGateway {
    @Override
    public void proccessPayment(double amount, String currency) {
        System.out.println("Processing payment with Square " + amount + " " + currency);
    }
}
