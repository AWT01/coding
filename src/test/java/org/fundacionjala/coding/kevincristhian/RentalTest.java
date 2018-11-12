package org.fundacionjala.coding.kevincristhian;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Rental test class.
 */
public class RentalTest {
    private static final int DAYS_RENTED = 2;
    private static final double DELTA = 0.1;
    private Movie movie1;
    private Rental rental1;
    private Movie movie2;
    private Rental rental2;

    /**
     * method to set up the tests.
     */
    @Before
    public void setUp() {
        movie1 = new MovieRegular("Terminator");
        rental1 = new RentalRegular(movie1, DAYS_RENTED);
        movie2 = new MovieNew("The Revenant");
        rental2 = new RentalNew(movie2, DAYS_RENTED);
    }

    /**
     * test of total cost.
     */
    @Test
    public void calculateRentCost() {
        assertEquals(2.0, rental1.calculateRentCost(), DELTA);
        assertEquals(6.0, rental2.calculateRentCost(), DELTA);
    }

    /**
     * test of total points.
     */
    @Test
    public void calculateTotalPoints() {
        assertEquals(1, rental1.getFrequentPoint());
        assertEquals(2, rental2.getFrequentPoint());
    }
}
