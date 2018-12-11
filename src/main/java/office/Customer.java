package office;

public class Customer {
    private String name;
    private Address address;
    private Trip trip;

    public Customer(String name) {
        this.name = name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Address getAddress() {
        return address;
    }

    public Trip getTrip() {
        return trip;
    }

    public void setTrip(Trip trip) {
        this.trip = trip;
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
