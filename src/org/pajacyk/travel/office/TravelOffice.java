package org.pajacyk.travel.office;

import java.util.Arrays;

public class TravelOffice {
    Customer[] table = new Customer[2];
    int customerCount = 0;

    public void addCustomer(Customer customer) {
        if(customerCount == table.length){
            table = Arrays.copyOf(table, table.length + 2);
        }
        table[customerCount++] = customer;
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
        return Arrays.toString(table) +
                "customerCount=" + customerCount;
    }
}

