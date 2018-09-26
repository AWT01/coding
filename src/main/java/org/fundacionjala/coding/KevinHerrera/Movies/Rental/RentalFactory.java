package org.fundacionjala.coding.KevinHerrera.Movies.Rental;

import org.fundacionjala.coding.KevinHerrera.Movies.Movie.Movie;

/**
 * @author KevinHerrera - AWT-[01].
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
