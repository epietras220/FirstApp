package org.pajacyk;

public class Main {

    public static void main(String[] args) {
        Address address = new Address("Wspolna");
        Person person = new Person(address);
        //person.address = new Address(""); // nie można utworzyc nowej referencji do obiektu finalnego
        person.address.street = "Ulica sezamkowa"; // można zmodyfikowac pole bo nie jest finalne

    }
}

class Person {
    final Address address;

    public Person(Address address){
        this.address = address;
    }
}


class Address {
    String street;
    Address(String street){
        this.street = street;
    }
}