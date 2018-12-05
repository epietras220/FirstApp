package org.pajacyk.travel.office;

import org.pajacyk.cwiczenie3_3.Date;

public class Trip {
    private Date start;
    private Date end;
    private String destination;

    public Trip(Date start, Date end, String destination) {
        this.start = start;
        this.end = end;
        this.destination = destination;
    }

    public Date getStart() {
        return start;
    }

    public void setStart(Date start) {
        this.start = start;
    }

    public Date getEnd() {
        return end;
    }

    public void setEnd(Date end) {
        this.end = end;
    }

    public String getDestination() {
        return destination;
    }

    public void setDestination(String destination) {
        this.destination = destination;
    }

    public void getInfo() {
        System.out.println("cel podróży: " + destination);
        System.out.println("data rozpoczecia wycieczki: ");
        start.getInfo();
        System.out.println("data zakończenia wycieczki: ");
        end.getInfo();
    }

}
