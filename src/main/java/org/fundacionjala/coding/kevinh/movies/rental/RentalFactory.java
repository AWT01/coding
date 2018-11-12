package org.fundacionjala.coding.kevinh.movies.rental;

import org.fundacionjala.coding.kevinh.movies.movie.Movie;

/**
 * @author kevinherrera - AWT-[01].
 * @version 0.1
 */
public final class RentalFactory {
    /**
     * .
     */
    private RentalFactory() {
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
