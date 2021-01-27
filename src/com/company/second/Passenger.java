package com.company.second;

import java.util.Objects;

public class Passenger {

    private String name;
    private boolean ticket;

    public Passenger(String name, boolean ticket) {
        this.name = name;
        this.ticket = ticket;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean hasTicket() {
        return ticket;
    }

    public void setHasTicket(boolean ticket) {
        this.ticket = ticket;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Passenger passenger = (Passenger) o;
        return ticket == passenger.ticket && Objects.equals(name, passenger.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, ticket);
    }

    @Override
    public String toString() {
        return "Passenger{" +
                "name='" + name + '\'' +
                ", ticket=" + ticket +
                '}';
    }
}
