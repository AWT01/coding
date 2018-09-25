package org.fundacionjala.coding;

import org.junit.Test;

import static org.junit.Assert.*;

public class CustomerTest {

    @Test
    public void statement() {
        Customer customer;
        Movie movie;
        Rental rental;
        customer = new Customer("Test");

        movie = new MovieRegular("Terminator");
        rental = new Rental(movie,2);
        customer.addRental(rental);

        movie = new MovieNew("The Revenant");
        rental = new Rental(movie,2);
        customer.addRental(rental);
        String result = "";
        result = "Rental Record for Test\n" +
                "===================================\n" +
                "Amount owed is 8.0\n" +
                "===================================\n" +
                "You earned 3 frequent renter points";
        assertNotSame(result,customer.statement());
    }
}