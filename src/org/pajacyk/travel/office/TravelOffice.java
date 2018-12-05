package org.pajacyk.travel.office;

import org.pajacyk.cwiczenie3_3.Date;

public class TravelOffice {
    public static void main(String[] args) {
        Address address = new Address("Street", "99-999", "lodz");
        Customer customer = new Customer("Kowalski");
        Date start = new Date(2018, 10, 10, "start");
        Date end = new Date(2018, 10, 20, "end");
        Trip trip = new Trip(start, end, "Bankok");

        customer.assignTrip(trip);
        customer.setAddress(address);
        customer.getInfo();
    }
}
