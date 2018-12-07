package org.pajacyk.cwiczenie7_1;

public class Car extends Vehicle{


    public Car(String name) {
        super(name);
    }

    @Override
    public double getFuelNeeds() {
        return 20;
    }

    @Override
    public double getDistance() {
        return 200;
    }
}
