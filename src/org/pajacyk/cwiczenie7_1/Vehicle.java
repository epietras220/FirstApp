package org.pajacyk.cwiczenie7_1;

public abstract class Vehicle {
    private String name;

    public Vehicle(String name) {
        this.name = name;
    }

    public String toString() {
        return name;
    }

    ;

    public abstract double getFuelNeeds();

    ;

    public abstract double getDistance();

    public double calculateFuelConsumption() {

        return getFuelNeeds() * getDistance() / 100;
    }

    public void go() {
        System.out.print("Rusza pojazd. ");
        System.out.println("Typ pojazdu: " + this.getClass().getSimpleName() + " Name: " + name);

    }

    public void stop() {
        System.out.print("Pojazd zatrzymuje sie. ");
        System.out.println("Typ pojazdu: " + this.getClass().getSimpleName() + " Name: " + name);
    }
}
