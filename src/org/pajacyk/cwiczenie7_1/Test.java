package org.pajacyk.cwiczenie7_1;

public class Test {
    public static void main(String[] args) {
        Vehicle[] vehicles = {new Car("Golf"), new Plane("ryanair"),
                new RaceCar("McLaren"), new Ship("Statek"), new Truck("Ciężarówka")};

        for (Vehicle pojazd : vehicles) {
            pojazd.go();
            pojazd.stop();
            pojazd.calculateFuelConsumption();
            if (pojazd instanceof Flying) {
                ((Flying) pojazd).callAirControl();
            }
        }
    }
}
