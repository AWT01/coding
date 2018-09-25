package org.fundacionjala.coding;

/**
 * child of movie
 */
public class MovieChildren extends Movie{

    /**
     * the constructor of the class
     *
     * @param title the title of the movie
     */
    public MovieChildren(String title) {
        super(title);
        setCost(1.5);
    }
}
