package org.fundacionjala.coding.kevincristhian;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * customer test class.
 */
public class CustomerTest {
    private static final double AMOUNT_OWNED = 20.0;
    private static final int AMOUNT_POINTS = 4;
    private static final int DAYS_RENTED = 4;
    private Movie movie1;
    private Movie movie2;
    private Movie movie3;
    private Rental rental1;
    private Rental rental2;
    private Rental rental3;

    @Before
    public void setUp() {
        movie1 = new MovieRegular("Terminator");
        rental1 = new RentalRegular(movie1, DAYS_RENTED);
        movie2 = new MovieNew("The Revenant");
        rental2 = new RentalNew(movie2, DAYS_RENTED);
        movie3 = new MovieChildren("Frozen");
        rental3 = new RentalChildren(movie3, DAYS_RENTED);
    }
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
        Customer customer = new Customer("Test");
        customer.addRental(rental1);
        customer.addRental(rental2);
        customer.addRental(rental3);
        assertEquals(result.toString(), customer.statement());
    }
}
