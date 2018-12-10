package org.pajacyk.travel.office;

public class Customer {
    private String name;
    private Address address;
    private Trip trip;

    public Customer(String name) {
        this.name = name;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public void assignTrip(Trip trip) {
        this.trip = trip;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Customer: " + "\n" +
                "name='" + name + '\'' + address.toString()
                + trip + "\n" + "\n";
    }
}
