package org.fundacionjala.coding.kevinh.movies.movie;

/**
 * @author kevinherrera - AWT-[01].
 * @version 0.1
 */
public class MovieNewRelease extends Movie {
    /**
     * .
     * @param title title
     */
    public MovieNewRelease(final String title) {
        super(title, Movie.NEW_RELEASE);
    }

    @Override
    public String priceCodeToString() {
        return  "NEW RELEASE";
    }

    /**
     * .
     * @param daysRented .
     * @return .
     */
    @Override
    public double getRentCost(int daysRented) {
        return daysRented * NEW_RELEASE_MOVIE_PRICE;
    }


}
