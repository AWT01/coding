package org.fundacionjala.coding;

import org.fundacionjala.coding.kevincristhian.Customer;
import org.fundacionjala.coding.kevincristhian.Movie;
import org.fundacionjala.coding.kevincristhian.MovieRegular;
import org.fundacionjala.coding.kevincristhian.MovieNew;
import org.fundacionjala.coding.kevincristhian.Rental;
import org.junit.Test;
import static org.junit.Assert.assertNotSame;

/**
 * Test of customer class.
 */
public class CustomerTest {

    /**
     * first test of method statement.
     */
    @Test
    public void statement() {
        Customer customer;
        Movie movie;
        Rental rental;
        customer = new Customer("Test");

        movie = new MovieRegular("Terminator");
        rental = new Rental(movie, 2);
        customer.addRental(rental);

        movie = new MovieNew("The Revenant");
        rental = new Rental(movie, 2);
        customer.addRental(rental);
        String result = "";
        result = "Rental Record for Test\n"
                + "===================================\n"
                + "Amount owed is 8.0\n"
                + "===================================\n"
                + "You earned 3 frequent renter points";
        assertNotSame(result, customer.statement());
    }
}
