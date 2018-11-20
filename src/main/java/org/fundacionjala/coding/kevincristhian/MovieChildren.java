package org.fundacionjala.coding.kevincristhian;

/**
 * child of movie.
 */
public class MovieChildren extends Movie {
   private static final double COST_FACTOR = 1.5;

    /**
     * the constructor of the class.
     *
     * @param title the title of the movie
     */
    public MovieChildren(final String title) {
        super(title);
        setCostFactor(COST_FACTOR);
    }
}
