package org.pajacyk.cwiczenie3_3;

import org.pajacyk.travel.office.Date;

public class Test {
    public static void main(String[] args) {
        Date start = new Date(2015, 7, 23);
        Date end = new Date(2017, 7, 11);

        //System.out.print("start: ");
        start.toString();
        //System.out.print("end: ");
        end.toString();

        Date today;
        today = start;
        // System.out.print("today: ");
        today.toString();
        today.setYear(2016);
        today.setDay(17);
        today.setName("today");

        //System.out.print("today: ");
        today.toString();

        //System.out.print("start: ");
        start.toString();

        end = today;
        end.setName("end");

        //System.out.print("end");
        end.toString();
    }
}
