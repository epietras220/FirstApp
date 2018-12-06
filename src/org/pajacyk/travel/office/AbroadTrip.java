package org.pajacyk.travel.office;

public class AbroadTrip extends Trip {
    private int insurance;

    public AbroadTrip(Date start, Date end, String destination, double price) {
        super(start, end, destination, price);
    }

    public int getInsurance() {
        return insurance;
    }

    public void setInsurance(int insurance) {
        this.insurance = insurance;
    }

    @Override
    public double getPrice() {
        return super.getPrice() + getInsurance();
    }
}
