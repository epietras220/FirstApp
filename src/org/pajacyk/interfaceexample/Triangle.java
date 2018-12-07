package org.pajacyk.interfaceexample;

public class Triangle implements RegularShape {

    double a;
    double h;

    public Triangle(double a, double h) {
        this.a = a;
        this.h = h;
    }

    @Override
    public double getArea() {
        return 1/2*a*h;
    }

    @Override
    public double getCircumference() {
        return a*a;
    }
}
