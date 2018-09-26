package org.fundacionjala.coding.KevinHerrera.Movies.Rental;

import org.fundacionjala.coding.KevinHerrera.Movies.Movie.Movie;

/**
 * @author KevinHerrera - AWT-[01].
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
        double totalAmount = 0;
        switch (getMovie().getPriceCode()) {
            case Movie.REGULAR:
                if (getDaysRented() <= 2) {
                    totalAmount = getDaysRented() * 2;
                }
                if (getDaysRented() > 2) {
                    totalAmount = REGULAR2DAYSPRICE;
                    totalAmount += (getDaysRented() - 2) * NORMAL_MOVIE_PRICE;
                }
                break;
            case Movie.NEW_RELEASE:
                totalAmount = getDaysRented() * NEW_RELEASE_MOVIE_PRICE;
                break;
            case Movie.CHILDREN:
                totalAmount = getDaysRented() * NORMAL_MOVIE_PRICE;
                break;
            default:
                break;
        }
        return totalAmount;
    }
}
