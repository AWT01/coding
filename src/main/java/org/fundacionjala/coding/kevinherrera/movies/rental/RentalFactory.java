package org.fundacionjala.coding.kevinherrera.movies.rental;

import org.fundacionjala.coding.kevinherrera.movies.movie.Movie;

/**
 * @author kevinherrera - AWT-[01].
 * @version 0.1
 */
public class RentalFactory {

    /**
     * .
     */
    protected RentalFactory() {
    }
    /**
     *.
     * @param movie movie
     * @param daysRented daysRented
     * @return value
     */
    public static RentalMovie createRentalMovie(final Movie movie, int daysRented) {
        return new RentalMovie(movie, daysRented);
    }
}
