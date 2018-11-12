package org.fundacionjala.coding.kevinh.movies.movie;

/**
 * @author kevinherrera - AWT-[01].
 * @version 0.1
 */
public class MovieChildren extends Movie {


    /**
     * .
     * @param title title
     */
    public MovieChildren(final String title) {
        super(title, Movie.CHILDREN);
    }

    @Override
    public String priceCodeToString() {
        return "CHILDREN";
    }

    @Override
    public double getRentCost(int daysRented) {
        return daysRented * NORMAL_MOVIE_PRICE;
    }
}
