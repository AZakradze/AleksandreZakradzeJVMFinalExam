package com.company.first;

public class Payment {

    public static void main(String[] args) {
        pay(new Electricity("111", 100));
        pay(new Water("222", 200));
    }

    public static <T> void pay(T t) {
        if (t instanceof Electricity) {
            final Electricity electricity = ((Electricity) t);
            System.out.println("Customer : " + electricity.getCustomerNumber() + ", paid: " + electricity.getAmount());
        } else if (t instanceof Water) {
            final Water water = ((Water) t);
            System.out.println("Customer : " + water.getCustomerNumber() + ", paid: " + water.getAmount());
        } else {
            throw new UnsupportedOperationException("T should be payable");
        }
    }
}
