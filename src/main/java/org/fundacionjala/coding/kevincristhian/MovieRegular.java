package org.fundacionjala.coding.kevincristhian;

/**
 * child class of movie.
 */
public class MovieRegular extends Movie {

    /**
     * the constructor of the class.
     *
     * @param title the title of the movie
     */
    public MovieRegular(final String title) {
        super(title);
        setCost(2);
    }
}
