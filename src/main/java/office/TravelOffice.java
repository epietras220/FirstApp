package office;

import java.util.*;

public class TravelOffice {
    Set<Customer> table = new HashSet<>();
    int customerCount = 0;

    Map<String, Trip> tripMap = new HashMap<>();

    public void addTrip(String name, Trip trip) {

        tripMap.put(name, trip);
    }


    public boolean removeTrip(String name) {
        int size = tripMap.size();
        tripMap.remove(name);
        return tripMap.size() < size;
    }

    public Customer findCustomerByName(String name) {
        for (Customer customer : table) {
            if ((customer.getName()).equals(name)) {
                return customer;
            }
        }
        return null;
    }

    public boolean removeCustomer(Customer customer) {
        int size = table.size();
        table.remove(customer);
        return table.size() > size;
    }
    public Map<String, Trip> allTrip(){
        return tripMap;
    }
    public Set<Customer> allCustomer(){
        return table;
    }


    public void addCustomer(Customer customer) {
        table.add(customer);
        customerCount++;
    }

    public int getCustomerCount() {
        System.out.print("number of customers: ");
        return customerCount;

    }

//    public String getInfo() {
//        String result = "";
//        for (Customer a : table) {
//
//            result += a.toString();
//        }
//        return result;
//    }

    @Override
    public String toString() {
        return Arrays.toString(new Set[]{table}) +
                "customerCount=" + customerCount;
    }
}

