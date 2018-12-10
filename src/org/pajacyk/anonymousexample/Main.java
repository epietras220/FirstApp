package org.pajacyk.anonymousexample;

public class Main {
    public static void main(String[] args) {

    Vehicle v = new Vehicle() {
        @Override
        public void start() {
            System.out.println("Hello from car");
        }
    };
    v.start();
}
}

interface Vehicle {
    void  start();
}
