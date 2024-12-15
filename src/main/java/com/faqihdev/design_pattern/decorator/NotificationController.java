package com.faqihdev.design_pattern.decorator;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/decorator")
public class NotificationController {

    private final Notification basicNotification;

    public NotificationController(Notification notification) {
        this.basicNotification = notification;
    }

    @PostMapping("/notify")
    public void notify (@RequestParam String message) {
        Notification notification = new LoggingDecorator(
                new EmailDecorator(
                        new SmsDecorator(basicNotification)
                )
        );
        notification.sendNotification(message);
    }
}
