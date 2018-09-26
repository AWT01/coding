package org.fundacionjala.coding;

import org.fundacionjala.coding.kevincristhian.Movie;
import org.fundacionjala.coding.kevincristhian.MovieNew;
import org.fundacionjala.coding.kevincristhian.MovieRegular;
import org.fundacionjala.coding.kevincristhian.Rental;
import org.fundacionjala.coding.kevincristhian.MovieChildren;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

/**
 * test for Rental class.
 */
public class RentalTest {
   private static final double EXPECT_NEW_COST = 6.0;
   private static final double EXPECT_REGULAR_COST = 2.0;
   private static final double EXPECT_CHILDREN_COST = 1.5;
   private static final int DAYS_RENTED = 2;
   private static final double DELTA = 0.1;
   private static final int POINTS_NEW = 2;
   private static final int POINTS_REGULAR = 1;
    /**
     * test the cost for a new release movie.
     */
    @Test
    public void getRentCostNew() {
        Movie movie = new MovieNew("The Revelant");
        Rental rentalTest = new Rental(movie, DAYS_RENTED);
        assertEquals(EXPECT_NEW_COST, rentalTest.getRentCost(), DELTA);
    }

    /**
     * test the cost for a regulas movie.
     */
    @Test
    public void getRentCostRegular() {
        Movie movie = new MovieRegular("Terminator");
        Rental rentalTest = new Rental(movie, DAYS_RENTED);
        assertEquals(EXPECT_REGULAR_COST, rentalTest.getRentCost(), DELTA);
    }

    /**
     * test the cost for a children movie.
     */
    @Test
    public void getRentCostChildren() {
        Movie movie = new MovieChildren("FROZEN");
        Rental rentalTest = new Rental(movie, DAYS_RENTED);
        assertEquals(EXPECT_CHILDREN_COST, rentalTest.getRentCost(), DELTA);
    }

    /**
     * test the rent points for a new release.
     */
    @Test
    public void getRentPointRelease() {
        Movie movie = new MovieNew("The Revelant");
        Rental rentalTest = new Rental(movie, DAYS_RENTED);
        assertEquals(POINTS_NEW, rentalTest.getRentPoint());
    }

    /**
     * test the rent points for a regular movie.
     */
    @Test
    public void getRentPointMovie() {
        Movie movie = new MovieRegular("The Revelant");
        Rental rentalTest = new Rental(movie, DAYS_RENTED);
        assertEquals(POINTS_REGULAR, rentalTest.getRentPoint());
    }
}
