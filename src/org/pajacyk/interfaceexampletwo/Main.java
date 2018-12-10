package org.pajacyk.interfaceexampletwo;

import java.util.Properties;

public class Main {
    public static void main(String[] args) {
        Vehicle[] vehicle = new Vehicle[3];
        vehicle[0] = new Car();
        vehicle[1] = new Car();
        vehicle[2] = new Vehicle() {
            @Override
            public void start() {
                System.out.println("Anonimowa klasa");
            }
        };
        Vehicle.startVehicles(vehicle);

    }
}

interface Vehicle {
    void start();

    static void startVehicles(Vehicle[] vehicles) {
        for (Vehicle v : vehicles) {
            v.start();
        }
    }
}

class Car implements Vehicle {

    @Override
    public void start() {
        System.out.println("Samochód rusza!");
        // Properties p = System.getProperties();
        //p.list(System.out);

        //String os = p.getProperty("os.name");
    }

}

