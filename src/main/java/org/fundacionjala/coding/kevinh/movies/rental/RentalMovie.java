package org.fundacionjala.coding.kevinh.movies.rental;

import org.fundacionjala.coding.kevinh.movies.movie.Movie;

/**
 * @author kevinherrera - AWT-[01].
 * @version 0.1
 */
public class RentalMovie {
    private Movie movie;
    private int daysRented;
    static final double NORMAL_MOVIE_PRICE = 1.5;
    static final double NEW_RELEASE_MOVIE_PRICE = 3;
    static final double REGULAR2DAYSPRICE = 4;

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
        double amount = 0;
        amount = getMovie().getRentCost(daysRented);
        switch (getMovie().getPriceCode()) {
            case Movie.REGULAR:

                break;
            case Movie.NEW_RELEASE:
                amount = getDaysRented() * NEW_RELEASE_MOVIE_PRICE;
                break;
            case Movie.CHILDREN:
                amount = getDaysRented() * NORMAL_MOVIE_PRICE;
                break;
            default:
                break;
        }
        return amount;
    }
}
