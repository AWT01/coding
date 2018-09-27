package org.foundation.coding.customer;

import org.foundation.coding.rental.Rental;
import java.util.Vector;

public class Customer {

    private String name;

    public Vector getRentals() {
        return rentals;
    }

    private Vector rentals;

    public Customer(String name) {

        this.name = name;
        rentals = new Vector();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void addRental(Rental rental){
        rentals.add(rental);
    }
}
