package org.fundacionjala.coding.kevincristhian;

/**
 * child class of movie.
 */
public class MovieRegular extends Movie {
    private static final int TWO_DAYS = 2;
    private static final double PERCENTAGE = 1.5;
    private static final double COST_FACTOR = 2;

    /**
     * the constructor of the class.
     *
     * @param title the title of the movie
     * @param daysRented number of days rented
     */
    public MovieRegular(final String title, int daysRented) {
        super(title, daysRented);
        setCostFactor(COST_FACTOR);
    }

    /**
     * method to calculate rent cost.
     *
     * @return cost of rent
     */
    @Override
    public double calculateRentCost() {
        double cost = getCostFactor();
        if (getDaysRented() > TWO_DAYS) {
            cost += (getDaysRented() - TWO_DAYS) * PERCENTAGE;
        }
        return cost;
    }
}
