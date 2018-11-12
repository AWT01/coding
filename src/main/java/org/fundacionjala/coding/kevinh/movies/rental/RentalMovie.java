package org.fundacionjala.coding.kevinh.movies.rental;

import org.fundacionjala.coding.kevinh.movies.movie.Movie;

/**
 * @author kevinherrera - AWT-[01].
 * @version 0.1
 */
public class RentalMovie {
    private Movie movie;
    private int daysRented;

    /**
     * .
     * @param movie movie
     * @param daysRented daysRented
     */
    public RentalMovie(final Movie movie, int daysRented) {
        this.movie = movie;
        this.daysRented = daysRented;
    }

    /**
     * .
     * @return value
     */
    public int getDaysRented() {
        return daysRented;
    }

    /**
     * .
     * @return value
     */
    public Movie getMovie() {
        return movie;
    }

    /**
     * .
     * @return value
     */
    public double getRentAmount() {
        return getMovie().getRentCost(daysRented);
    }
}
