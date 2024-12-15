package com.faqihdev.design_pattern.decorator;

public class LoggingDecorator extends NotificationDecorator {
    public LoggingDecorator(Notification notification) {
        super(notification);
    }


    @Override
    public void sendNotification(String message) {
        System.out.println("Logging notification: " + message);
        super.sendNotification(message);
    }
}
