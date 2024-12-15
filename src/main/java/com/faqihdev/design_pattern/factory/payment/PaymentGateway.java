package com.faqihdev.design_pattern.factory.payment;

public interface PaymentGateway {
    void proccessPayment(double amount, String currency);
}
