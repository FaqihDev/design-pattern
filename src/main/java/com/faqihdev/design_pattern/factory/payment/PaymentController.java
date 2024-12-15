package com.faqihdev.design_pattern.factory.payment;


import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/payments")
public class PaymentController {

    private final PaymentService paymentService;

    @Autowired
    public PaymentController(PaymentService paymentService) {
        this.paymentService = paymentService;
    }

    @PostMapping("/process")
    public String processPayment(@RequestParam String gateaway,
                                 @RequestParam double amount,
                                 @RequestParam String currency) {
        try {
            paymentService.processPayment(gateaway, amount, currency);
            return "payment processed successfully " + gateaway;
        } catch (IllegalArgumentException e) {
            return "Error" +  e.getMessage();
        }
    }
}
