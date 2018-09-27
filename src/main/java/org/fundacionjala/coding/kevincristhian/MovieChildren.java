package org.fundacionjala.coding.kevincristhian;

/**
 * child of movie.
 */
public class MovieChildren extends Movie {
    private static final int THREE_DAYS = 3;
    private static final double PERCENTAGE = 1.5;
    private static final double COST_FACTOR = 1.5;

    /**
     * the constructor of the class.
     *
     * @param title the title of the movie
     * @param daysRented number of days rented
     */
    public MovieChildren(final String title, int daysRented) {
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
        if (getDaysRented() > THREE_DAYS) {
            cost += (getDaysRented() - THREE_DAYS) * PERCENTAGE;
        }
        return cost;
    }
}
