package com.faqihdev.design_pattern.decorator;

public class EmailDecorator extends NotificationDecorator {
    public EmailDecorator(Notification notification) {
        super(notification);
    }

    @Override
    public void sendNotification(String message) {
        System.out.println("Email notification: " + message);
        super.sendNotification(message);
    }
}