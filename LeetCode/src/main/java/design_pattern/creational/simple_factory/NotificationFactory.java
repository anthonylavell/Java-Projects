/*
The simple factory pattern in Java is a way to create objects without exposing
the instantiation logic to the client code.
 */

package design_pattern.creational.simple_factory;

import design_pattern.creational.simple_factory.abs.INotification;

class EmailNotification implements INotification {
    public void send() {
        System.out.println("Sending email...");
    }
}

class SMSNotification implements INotification {
    public void send() {
        System.out.println("Sending SMS...");
    }
}
public class NotificationFactory {
    public static INotification createNotification(String type) {
        if (type.equalsIgnoreCase("email")) {
            return new EmailNotification();
        } else if (type.equalsIgnoreCase("sms")) {
            return new SMSNotification();
        }
        throw new IllegalArgumentException("Invalid notification type");
    }
}
