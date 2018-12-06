package org.pajacyk.dziedziczenie;

public class Plane extends Vehicle {
    @Override
    public void start() {
        System.out.println("fly");
    }

    public void lend() {
        System.out.println(" Plane lend");
    }
}
