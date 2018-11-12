package org.fundacionjala.coding.kevincristhian;

/**
 * child class of movie.
 */
public class MovieNew extends Movie {
    private static final double COST_FACTOR = 3;

    /**
     * the constructor of the class.
     *
     * @param title the title of the movie
     */
    public MovieNew(final String title) {
        super(title);
        setCostFactor(COST_FACTOR);
    }
}

