package org.pajacyk.travel.office;

public class Test {
    public static void main(String[] args) {

        //Tworze biuro podrozy
        TravelOffice travelOffice = new TravelOffice();

        //Tworze wycieczke
        Date start = new Date(2018, 10, 10);
        Date end = new Date(2018, 10, 20);

        DomesticTrip krajowa = new DomesticTrip(start, end, "Ciechocinek", 500.5);
        krajowa.setOwnArrivalDiscount(200);
        AbroadTrip zagraniczna = new AbroadTrip(start, end, "Wyspy kanaryjskie", 3500.0);
        zagraniczna.setInsurance(300);
        Trip trip = new Trip(start, end, "Bankok", 2000.0);

        //Tworze klientów
        Address address = new Address("Wroclawska", "08-045", "Lodz");
        Customer customer = new Customer("Kowalski Jan");
        customer.setAddress(address);
        customer.assignTrip(zagraniczna);

        Address adrress2 = new Address("lodzka", "94-058", "Wroclaw");
        Customer klient2 = new Customer("Nowak Mateusz");
        klient2.setAddress(adrress2);
        klient2.assignTrip(krajowa);

        //Dodaje klienta do biura
        travelOffice.addCustomer(customer);
        travelOffice.addCustomer(klient2);

        //wyswietlanie zawartosci
        System.out.println(travelOffice.toString());

    }
}