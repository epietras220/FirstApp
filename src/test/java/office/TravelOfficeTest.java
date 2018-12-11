package office;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.internal.util.reflection.FieldSetter;
import org.mockito.runners.MockitoJUnitRunner;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

import static org.junit.Assert.*;

@RunWith(MockitoJUnitRunner.class)
public class TravelOfficeTest {

    @Mock
    Trip mockTrip;
    @Mock
    Address address;
    @Mock
    Customer mockCustomer;
    @Mock
    Customer mockCustomer2;

    @InjectMocks
    private TravelOffice travelOffice;


    @Test
    public void whenAddTrip_thenTripMapSizeIncrease() throws NoSuchFieldException {
        //given
        new FieldSetter(travelOffice, TravelOffice.class.getDeclaredField("tripMap")).set(new HashMap<>());
        //Map<String, Trip> tripMap = new HashMap<>();
        String name = "Wycieczka";
        Trip trip = mockTrip;

        //when
        travelOffice.tripMap.put(name, trip);

        //then
        assertEquals(1, travelOffice.tripMap.size());
    }

    @Test
    public void whenTripIsNull_thenThrowNullException() {
        fail();
    }

    @Test
    public void whenNameIsNull_thenThrowNullException() {
        fail();
    }

    @Test
    public void whenRemoveTrip_thenTripMapSizeDecrease() throws NoSuchFieldException {
        //given
        new FieldSetter(travelOffice, TravelOffice.class.getDeclaredField("tripMap")).set(new HashMap<>());
        String name = "Wycieczka";
        String name2 = "Wycieczka2";

        //when
        //.put(name, mockTrip);
        travelOffice.tripMap.put(name2, mockTrip);
        travelOffice.tripMap.remove(name);

        //then
        assertEquals(1, travelOffice.tripMap.size());
    }

    @Test
    public void whenTripMapIsEmpty_thenShowMessage() {
        fail();
    }

    @Test
    public void findCustomerByName() throws NoSuchFieldException {
        //given
        new FieldSetter(travelOffice, TravelOffice.class.getDeclaredField("table")).set(new HashSet<>());
        Customer customer = new Customer("name");
        new FieldSetter(customer, Customer.class.getDeclaredField("address")).set(address);
        new FieldSetter(customer, Customer.class.getDeclaredField("trip")).set(mockTrip);

        //when
        travelOffice.allCustomer().add(customer);

        //then
        Customer custOutput = travelOffice.findCustomerByName("name");
        assertEquals(customer, custOutput);
//        //given
//        String name = "Name";
//        Customer expected = new Customer(name);
//
//        TravelOffice office = new TravelOffice();
//
//        //when
//        office.addCustomer(expected);
//        Customer actual = office.findCustomerByName(name);
//
//        //then
//        assertEquals(expected, actual);
    }

    @Test
    public void removeCustomer() throws NoSuchFieldException {
        //given
        new FieldSetter(travelOffice, TravelOffice.class.getDeclaredField("table")).set(new HashSet<>());
        //when
       travelOffice.table.add(mockCustomer);
        travelOffice.table.add(mockCustomer2);
        travelOffice.table.remove(mockCustomer);

        //then
        assertEquals(1, travelOffice.table.size());

    }

    @Test
    public void addCustomer() {
        //given
        Set<Customer> customerSet = new HashSet<>();
        TravelOffice office = new TravelOffice();

        //when
        customerSet.add(mockCustomer);
        customerSet.add(mockCustomer2);

        //then
        assertEquals(2, customerSet.size());
    }
}