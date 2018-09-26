package org.fundacionjala.coding.kevincristhian;

/**
 * class rental it has a 1 to 1 relation
 * with movie class.
 */
public class Rental {
    private Movie movie;
    private int daysRented;
    private int rentPoint;
    private static final int TWO_DAYS = 2;
    private static final int THREE_DAYS = 3;
    private static final double PERCENTAGE = 1.5;

    /**
     * constructor of rental class.
     *
     * @param movie movie to be rented
     * @param daysRented amount of days to be rented
     */
    public Rental(final Movie movie, int daysRented) {
        this.movie = movie;
        this.daysRented = daysRented;
        if (movie instanceof MovieNew) {
            this.rentPoint = 2;
        } else {
            this.rentPoint = 1;
        }
    }

    /**
     * getter of day rented.
     *
     * @return number of days rented the movie
     */
    public int getDaysRented() {
        return daysRented;
    }

    /**
     * getter of movie.
     *
     * @return movie
     */
    public Movie getMovie() {
        return movie;
    }

    /**
     * getter rent point.
     *
     * @return rent point value
     */
    public int getRentPoint() {
        return rentPoint;
    }

    /**
     * amount of the rent of the movie.
     * @return subtotal of rent
     */
    public double getRentCost() {
        double cost;
        cost = movie.getCost();
        if (movie instanceof MovieChildren) {
            if (daysRented > THREE_DAYS) {
                cost += (daysRented - THREE_DAYS) * PERCENTAGE;
            }
            return cost;
        }

        if (movie instanceof MovieRegular) {
            if (daysRented > TWO_DAYS) {
                cost += (daysRented - TWO_DAYS) * PERCENTAGE;
            }
            return cost;
        } else {
            cost *= daysRented;
            return cost;
        }
    }
}

