package com.faqihdev.design_pattern.factory.payment;

import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Service;

@Service
public class PaymentService {

    private final PaymentGatewayFactory paymentGatewayFactory;

    @Autowired
    public PaymentService (PaymentGatewayFactory paymentGateway) {
        this.paymentGatewayFactory = paymentGateway;
    }

    public void processPayment(String gateaway, double amount, String currency) {
        PaymentGateway paymentGateway = paymentGatewayFactory.getPaymentGateway(gateaway);
        paymentGateway.proccessPayment(amount, currency);
    }

}
