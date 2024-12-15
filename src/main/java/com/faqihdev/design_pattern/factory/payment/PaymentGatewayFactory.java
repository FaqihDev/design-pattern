package com.faqihdev.design_pattern.factory.payment;


import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.HashMap;
import java.util.Map;

@Component
public class PaymentGatewayFactory {

    private final Map<String, PaymentGateway> paymentGateways;

    @Autowired
    public PaymentGatewayFactory(Map<String, PaymentGateway> paymentGateways) {
        this.paymentGateways = paymentGateways;
    }

    public PaymentGateway getPaymentGateway(String gatewayType) {
        PaymentGateway paymentGateway = paymentGateways.get(gatewayType);
        if (paymentGateway == null) {
            throw new IllegalArgumentException("Unknown payment gateway type: " + gatewayType);
        }
        return paymentGateway;
    }

}
