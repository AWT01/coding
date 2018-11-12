package org.fundacionjala.coding.kevincristhian;

/**
 * child class of movie.
 */
public class MovieRegular extends Movie {
    private static final double COST_FACTOR = 2;

    /**
     * the constructor of the class.
     *
     * @param title the title of the movie.
     */
    public MovieRegular(final String title) {
        super(title);
        setCostFactor(COST_FACTOR);
    }
}
