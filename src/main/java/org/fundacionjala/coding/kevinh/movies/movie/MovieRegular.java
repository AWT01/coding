package org.fundacionjala.coding.kevinh.movies.movie;

/**
 * @author kevinherrera - AWT-[01].
 * @version 0.1
 */
public class MovieRegular extends Movie {

    /**
     * .
     * @param title title
     */
    public MovieRegular(final String title) {
        super(title, Movie.REGULAR);
    }

    /**
     * .
     * @param daysRented .
     * @return .
     */
    @Override
    public double getRentCost(int daysRented) {
        double totalAmount = 0.0;
        if (daysRented <= 2) {
            totalAmount = daysRented * 2;
        }
        if (daysRented > 2) {
            totalAmount = REGULAR_2_DAYS_PRICE;
            totalAmount += (daysRented - 2) * NORMAL_MOVIE_PRICE;
        }
        return totalAmount;
    }
}
