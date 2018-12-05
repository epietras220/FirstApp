

package org.pajacyk.cwiczenie1;

import java.util.Date;

import java.util.Random;

import static java.lang.Math.*;

public class Main {
    public int rzut(){
        int number = (int) (Math.random() *6);
        return number;
    }
    public static void main(String[] args) {
        Main main = new Main();
        System.out.println(main.rzut());

        //org.pajacyk.cwiczenie1.Date d = new org.pajacyk.cwiczenie1.Date();
        Date data = new Date();
        int degreees = 20;

        sin(PI * degreees / 180);

    }
}
