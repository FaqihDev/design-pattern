package com.faqihdev.design_pattern.decorator;

public abstract class NotificationDecorator implements Notification {

    private Notification notification;

    public NotificationDecorator(Notification notification) {
        this.notification = notification;
    }

    @Override
    public void sendNotification(String message) {
        notification.sendNotification(message);
    }
}
