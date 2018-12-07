package org.pajacyk.interfaceexample;
import static java.lang.Math.PI;

public class Circle implements RegularShape {
    float r;

    public Circle(float r) {
        this.r = r;
    }

    @Override
    public double getArea() {
        return PI*r*r;
    }

    @Override
    public double getCircumference() {
        return 2*PI*r;
    }
}
