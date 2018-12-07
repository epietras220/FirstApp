package org.pajacyk.cwiczenie7_1;

public class Ship extends Vehicle implements Sailing {
    public Ship(String name) {
        super(name);
    }

    @Override
    public void dock() {
        System.out.println("Przybyłes do portu!");

    }

    @Override
    public double getFuelNeeds() {
        return 40;
    }

    @Override
    public double getDistance() {
        return 100;
    }

    @Override
    public void stop() {
        dock();
    }
}
