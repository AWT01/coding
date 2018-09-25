package org.fundacionjala.coding;

/**
 * father class for movies
 */
public abstract class Movie {
    private String title;
    private double cost;

    /**
     * the constructor of the class
     *
     * @param title the title of the movie
     */
    public Movie(String title) {
        this.title = title;
    }

    /**
     * getter of title
     *
     * @return the value of title
     */
    public String getTitle() {
        return title;
    }

    /**
     * setter for cost of the movie
     *
     * @param cost
     */
    public void setCost(double cost) {
        this.cost = cost;
    }

    /**
     * getter for the cost of the movie
     *
     * @return cost
     */
    public double getCost() {
        return cost;
    }
}
