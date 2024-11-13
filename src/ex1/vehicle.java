package ex1;

public abstract class vehicle {
    protected String make;
    protected String model;
    protected int year;

    public vehicle(String make, String model, int year) {
        this.make = make;
        this.model = model;
        this.year = year;
    }

    public abstract void start();
    public abstract void stop();

    @Override
    public String toString() {
        return year + " " + make + " " + model;
    }
}

