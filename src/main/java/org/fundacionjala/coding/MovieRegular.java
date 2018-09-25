package org.fundacionjala.coding;

/**
 * child class of movie
 */
public class MovieRegular extends Movie {

    /**
     * the constructor of the class
     *
     * @param title the title of the movie
     */
    public MovieRegular(String title) {
        super(title);
        setCost(2);
    }
}
