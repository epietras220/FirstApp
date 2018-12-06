package org.pajacyk.dziedziczenie;

public class Main {
    public static void main(String[] args) {

        Vehicle[] v = new Vehicle[4];

        v[0] = new Plane();
        v[1] = new Car();
        v[2] = new Ship();

        for (int i = 0; i < v.length - 1; i++) {
            if (v[i] instanceof Plane) {
                ((Plane) v[i]).lend();
            }
            v[i].start();

        }
    }
}
