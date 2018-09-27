package org.fundacionjala.coding.kevincristhian;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * MovieChildren test class.
 */
public class MovieChildrenTest {
    private static final int DAYS_RENTED = 2;
    private static final double DELTA = 0.1;
    private static final double EXPECTED = 1.5;

    /**
     * test of rent cost.
     */
    @Test
    public void calculateRentCost() {
        Movie movie;
        Rental rental;
        rental = new Rental();
        movie = new MovieChildren("FROZEN", DAYS_RENTED);
        rental.addMovie(movie);
        assertEquals(EXPECTED, rental.calculateTotalCost(),  DELTA);
    }
}
