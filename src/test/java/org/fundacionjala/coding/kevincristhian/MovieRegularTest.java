package org.fundacionjala.coding.kevincristhian;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * MovieRegular test class.
 */
public class MovieRegularTest {
    private static final int DAYS_RENTED = 2;
    private static final double DELTA = 0.1;
    private static final double EXPECTED = 2.0;

    /**
     * test of rent cost.
     */
    @Test
    public void calculateRentCost() {
        Movie movie;
        Rental rental;
        rental = new Rental();
        movie = new MovieRegular("Terminator",  DAYS_RENTED);
        rental.addMovie(movie);
        assertEquals(EXPECTED, rental.calculateTotalCost(), DELTA);
    }
}
