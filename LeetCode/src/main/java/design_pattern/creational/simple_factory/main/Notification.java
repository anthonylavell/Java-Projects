package design_pattern.creational.simple_factory.main;

import design_pattern.creational.simple_factory.NotificationFactory;
import design_pattern.creational.simple_factory.abs.INotification;

public class Notification {
    static void main() {
        INotification notification = NotificationFactory.createNotification("sms");
        notification.send();
    }
}
