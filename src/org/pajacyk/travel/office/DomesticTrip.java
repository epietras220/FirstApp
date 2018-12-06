package org.pajacyk.travel.office;

public class DomesticTrip extends Trip {
    private double ownArrivalDiscount;

    public DomesticTrip(Date start, Date end, String destination, double price) {
        super(start, end, destination, price);
    }

    public double getOwnArrivalDiscount() {
        return ownArrivalDiscount;
    }

    public void setOwnArrivalDiscount(int ownArrivalDiscount) {
        this.ownArrivalDiscount = ownArrivalDiscount;
    }

    @Override
    public double getPrice() {
        double newPrice = super.getPrice() - ownArrivalDiscount;
        return newPrice;
    }
}
