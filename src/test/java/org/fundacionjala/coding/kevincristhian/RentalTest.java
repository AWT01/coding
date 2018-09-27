package org.fundacionjala.coding.kevincristhian;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Rental test class.
 */
public class RentalTest {
    private static final int DAYS_RENTED = 2;
    private static final double DELTA = 0.1;
    private static final double EXPECTED_COST = 8.0;
    private static final int EXPECTED_POINTS = 3;

    /**
     * test of total cost.
     */
    @Test
    public void calculateTotalCost() {
        Movie movie;
        Rental rental;
        rental = new Rental();
        movie = new MovieRegular("Terminator",  DAYS_RENTED);
        rental.addMovie(movie);
        movie = new MovieNew("The Revenant",  DAYS_RENTED);
        rental.addMovie(movie);
        assertEquals(EXPECTED_COST, rental.calculateTotalCost(),  DELTA);
    }

    /**
     * test of total points.
     */
    @Test
    public void calculateTotalPoints() {
        Movie movie;
        Rental rental;
        rental = new Rental();
        movie = new MovieRegular("Terminator", DAYS_RENTED);
        rental.addMovie(movie);
        movie = new MovieNew("The Revenant", DAYS_RENTED);
        rental.addMovie(movie);
        assertEquals(EXPECTED_POINTS, rental.calculateTotalPoints());
    }
}
