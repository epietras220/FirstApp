package org.pajacyk.cwiczenie3_3;

public class Test {
    public static void main(String[] args) {
        Date start = new Date(2015, 7, 23, "start");
        Date end = new Date(2017, 7, 11, "end");

        //System.out.print("start: ");
        start.getInfo();
        //System.out.print("end: ");
        end.getInfo();

        Date today;
        today = start;
        // System.out.print("today: ");
        today.getInfo();
        today.setRok(2016);
        today.setDay(17);
        today.setName("today");

        //System.out.print("today: ");
        today.getInfo();

        //System.out.print("start: ");
        start.getInfo();

        end = today;
        end.setName("end");

        //System.out.print("end");
        end.getInfo();
    }
}
