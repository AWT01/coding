package org.fundacionjala.coding.kevincristhian;

/**
 * class rental it has a 1 to 1 relation
 * with movie class.
 */
public abstract class Rental {

    private Movie movie;
    private int daysRented;

    /**
     * constructor of rental class.
     * @param movie .
     * @param daysRented .
     */
    public Rental(final Movie movie, int daysRented) {
        this.movie = movie;
        this.daysRented = daysRented;
    }

    /**
     * get movie method.
     * @return movie.
     */
    public Movie getMovie() {
        return movie;
    }

    /**
     * get days rented.
     * @return int.
     */
    public int getDaysRented() {
        return daysRented;
    }

    /**
     * cost of rent.
     * @return double.
     */
    public abstract double calculateRentCost();

    /**
     * frecuent points.
     * @return int.
     */
    public abstract int getFrequentPoint();
}

