package org.fundacionjala.coding.kevinh.movies;

import org.fundacionjala.coding.kevinh.movies.movie.Movie;
import org.fundacionjala.coding.kevinh.movies.movie.MovieFactory;
import org.fundacionjala.coding.kevinh.movies.rental.RentalMovie;
import org.junit.Test;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

/**
 * @author kevinherrera - AWT-[01].
 * @version 0.1
 */
public class TestRentalMovie {
    static final int DAY_RENT_5 = 5;
    /**
     * .
     */
    @Test
    public void testRentalMovie5Days() {
        Movie movie = MovieFactory.createRegularMovie("X men");
        RentalMovie rentalMovieTest = new RentalMovie(movie, DAY_RENT_5);
        assertEquals(DAY_RENT_5, rentalMovieTest.getDaysRented());
    }

    /**
     * .
     */
    @Test
    public void testGetRentedMovie() {
        Movie movie = MovieFactory.createRegularMovie("Justice League");
        RentalMovie rentalMovieTest = new RentalMovie(movie, DAY_RENT_5);
        assertNotNull(rentalMovieTest.getMovie());
    }
}
