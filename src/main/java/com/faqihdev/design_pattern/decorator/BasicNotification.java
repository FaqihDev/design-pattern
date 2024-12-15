package com.faqihdev.design_pattern.decorator;

import org.springframework.stereotype.Service;

@Service
public class BasicNotification implements Notification {
    @Override
    public void sendNotification(String message) {
        System.out.println("Sending notification " + message);
    }
}
