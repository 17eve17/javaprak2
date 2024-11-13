package ex4;

public class EmailNotification implements Notification {
    @Override
    public void send(String message) {
        System.out.println("Відправка Email: " + message);
    }
}

