package org.fundacionjala.coding.kevincristhian;

/**
 * father class for movies.
 */
public abstract class Movie {
    private String title;
    private double costFactor;
    /**
     * the constructor of the class.
     *
     * @param title the title of the movie.
     */
    public Movie(final String title) {
        this.title = title;
    }

    /**
     * getter of title.
     *
     * @return the value of title
     */
    public String getTitle() {
        return title;
    }

    /**
     * setter for costFactor of the movie.
     *
     * @param costFactor the new costFactor of the movie
     */

    public void setCostFactor(double costFactor) {
        this.costFactor = costFactor;
    }

    /**
     * getter for the cost of the movie.
     *
     * @return cost
     */
    public double getCostFactor() {
        return costFactor;
    }
}
