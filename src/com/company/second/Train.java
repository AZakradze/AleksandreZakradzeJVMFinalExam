package com.company.second;

import java.util.ArrayList;
import java.util.List;

public class Train {

    private final List<Passenger> passengerList;

    public Train() {
        passengerList = new ArrayList<>();
    }

    public boolean addPassenger(Passenger passenger) {
        if (passenger.hasTicket()) {
            passengerList.add(passenger);
            return true;
        } else {
            return false;
        }
    }

    public List<Passenger> getPassengerList() {
        return passengerList;
    }
}
