package ex1;

public class Truck extends vehicle implements Refuelable {
    public Truck(String make, String model, int year) {
        super(make, model, year);
    }

    @Override
    public void start() {
        System.out.println("The truck is starting.");
    }

    @Override
    public void stop() {
        System.out.println("The truck has stopped.");
    }

    @Override
    public void refuel() {
        System.out.println("The truck is being refueled.");
    }
}

