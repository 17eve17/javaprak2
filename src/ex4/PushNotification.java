package ex4;

public class PushNotification implements Notification {
    @Override
    public void send(String message) {
        System.out.println(" Надсилаємо Push Notification: " + message);
    }
}

