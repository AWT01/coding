package org.fundacionjala.coding.kevincristhian;

/**
 * father class for movies.
 */
public abstract class Movie {
    private String title;
    private double costFactor;
    private int frequentPoints;
    private int daysRented;

    /**
     * the constructor of the class.
     *
     * @param title the title of the movie
     * @param daysRented number of days rented
     */
    public Movie(final String title, int daysRented) {
        this.title = title;
        this.frequentPoints = 1;
        this.daysRented = daysRented;
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

    /**
     * set the frequent points.
     *
     * @param frequentPoints set points
     */
    public void setFrequentPoints(int frequentPoints) {
        this.frequentPoints = frequentPoints;
    }

    /**
     * getter of frequent points.
     *
     * @return amount of points
     */
    public int getFrequentPoints() {
        return frequentPoints;
    }

    /**
     * getter of days rented.
     *
     * @return number of days
     */
    public int getDaysRented() {
        return daysRented;
    }

    /**
     *abstract method for rent cost of the movie.
     *
     * @return amount of rent
     */
    public abstract double calculateRentCost();
}
