package com.faqihdev.design_pattern.decorator;

public class SmsDecorator extends NotificationDecorator {
    public SmsDecorator(Notification notification) {
        super(notification);
    }


    @Override
    public void sendNotification(String message) {
        System.out.println("Sms notification: " + message);
        super.sendNotification(message);
    }
}
