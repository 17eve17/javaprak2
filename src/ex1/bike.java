package ex1;

public class bike extends vehicle {
    public bike (String make, String model, int year) {
        super(make, model, year);
    }

    @Override
    public void start() {
        System.out.println("The bike is starting.");
    }

    @Override
    public void stop() {
        System.out.println("The bike has stopped.");
    }
}

