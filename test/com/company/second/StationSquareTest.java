package com.company.second;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class StationSquareTest {

    private Train train;
    private final Passenger passengerWithoutTicket = new Passenger("Passenger without ticket", false);
    private final Passenger passengerWithTicket = new Passenger("Passenger with ticket", true);

    @Before
    public void setup() {
        train = new Train();
    }

    @Test
    public void test_adding_passenger_which_does_not_have_ticket() {
        train.addPassenger(passengerWithoutTicket);
        assertEquals(train.getPassengerList().size(), 0);
        train.addPassenger(passengerWithTicket);
        assertEquals(train.getPassengerList().size(), 1);
    }

    @Test
    public void test_adding_passenger_which_has_ticket() {
        train.addPassenger(passengerWithTicket);
        assertEquals(train.getPassengerList().size(), 1);
        assertEquals(train.getPassengerList().get(0), passengerWithTicket);
    }

}