package org.fundacionjala.coding.kevincristhian;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * customer test class.
 */
public class CustomerTest {
    private static final double AMOUNT_OWNED = 9.5;
    private static final int AMOUNT_POINTS = 4;
    private static final int DAYS_RENTED = 2;

    /**
     * test of statement for a customer.
     */
    @Test
    public void statement() {
        StringBuilder result = new StringBuilder();
        result.append("Rental Record for ");
        result.append("Test");
        result.append("\n");
        result.append("Amount owed is ");
        result.append(AMOUNT_OWNED);
        result.append("\n");
        result.append("You earned ");
        result.append(AMOUNT_POINTS);
        result.append(" frequent renter points");
        Movie movie;
        Rental rental;
        rental = new Rental();
        movie = new MovieRegular("Terminator",  DAYS_RENTED);
        rental.addMovie(movie);
        movie = new MovieNew("The Revenant",  DAYS_RENTED);
        rental.addMovie(movie);
        movie = new MovieChildren("Frozen", DAYS_RENTED);
        rental.addMovie(movie);
        Customer customer = new Customer("Test", rental);
        assertEquals(result.toString(), customer.statement());
    }
}
