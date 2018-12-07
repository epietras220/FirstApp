package org.pajacyk.cwiczenie7_1;

public class Plane extends Vehicle implements Flying {
    public Plane(String name) {
        super(name);
    }

    @Override
    public void takeOff() {
        System.out.println("Samolot wlasnie odlecial!");

    }

    @Override
    public void land() {
        System.out.println("Samolot własnie wylądował");

    }

    @Override
    public void callAirControl() {
        System.out.println("Dzwoni kontroler!");
    }

    @Override
    public double getFuelNeeds() {
        return 100;
    }

    @Override
    public double getDistance() {
        return 2000;
    }

    @Override
    public void go() {
        super.go();
        takeOff();
    }

    @Override
    public void stop() {
        super.stop();
        land();
    }
}
