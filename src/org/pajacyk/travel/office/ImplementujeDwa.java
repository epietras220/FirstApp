package org.pajacyk.travel.office;

import org.pajacyk.Example;
import org.pajacyk.ExampleTwo;

public interface ImplementujeDwa extends Example, ExampleTwo {
    @Override
    default void go() {
        
    }
}
