package org.pajacyk.travel.office;

public abstract class Trip {
    private Date start;
    private Date end;
    private String destination;
    private double price;

    public Trip(Date start, Date end, String destination, double price) {
        this.start = start;
        this.end = end;
        this.destination = destination;
        this.price = price;
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

    public double getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Trip: " + "\n"+
                "start" + start +
                "end" + end +
                "destination= " + destination + '\'' +
                ", price= " + getPrice() + "\n"+ "\n";
    }
}
