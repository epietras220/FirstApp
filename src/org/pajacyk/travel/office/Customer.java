package org.pajacyk.travel.office;

public class Customer {
    private String name;
    private Address address;
    private Trip trip;

    public Customer(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public Trip getTrip() {
        return trip;
    }

    public void assignTrip(Trip trip) {
        this.trip = trip;
    }

    public void getInfo() {
        System.out.println("Name: " + getName());
        System.out.println("Address: ");
        address.getInfo();
        System.out.println("trip: ");
        trip.getInfo();
    }
}
