package org.fundacionjala.coding.Movies;

import org.fundacionjala.coding.KevinHerrera.Movies.Movie.Movie;
import org.fundacionjala.coding.KevinHerrera.Movies.Movie.MovieFactory;
import org.fundacionjala.coding.KevinHerrera.Movies.Rental.RentalMovie;
import org.junit.Test;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

/**
 * @author KevinHerrera - AWT-[01].
 * @version 0.1
 */
public class TestRentalMovie {
    static final int DAY_RENT_5 = 5;
    /**
     * .
     */
    @Test
    @SuppressWarnings("checkstyle:magicnumber")
    public void testRentalMovie5Days() {
        Movie movie = MovieFactory.createRegularMovie("X men");
        RentalMovie rentalMovieTest = new RentalMovie(movie, DAY_RENT_5);
        assertEquals(DAY_RENT_5, rentalMovieTest.getDaysRented());
    }

    /**
     * .
     */
    @Test
    @SuppressWarnings("checkstyle:magicnumber")
    public void testGetRentedMovie() {
        Movie movie = MovieFactory.createRegularMovie("Justice League");
        RentalMovie rentalMovieTest = new RentalMovie(movie, DAY_RENT_5);
        assertNotNull(rentalMovieTest.getMovie());
    }
}
