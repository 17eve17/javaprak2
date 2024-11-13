package ex1;

public class Car extends vehicle implements Refuelable {
    public Car(String make, String model, int year) {
        super(make, model, year);
    }

    @Override
    public void start() {
        System.out.println("The car is starting.");
    }

    @Override
    public void stop() {
        System.out.println("The car has stopped.");
    }

    @Override
    public void refuel() {
        System.out.println("The car is being refueled.");
    }
}

