package org.fundacionjala.coding.kevincristhian;

/**
 * rental regular.
 */
public class RentalRegular extends Rental {
    private static final double PERCENTAGE = 1.5;
    private static final int TWO_DAYS = 2;

    /**
     * constructor of rental class.
     *
     * @param movie
     * @param daysRented
     */
    public RentalRegular(Movie movie, int daysRented) {
        super(movie, daysRented);
    }

    /**
     * method to calculate rent cost.
     *
     * @return cost of rent
     */
    @Override
    public double calculateRentCost() {
        double cost = getMovie().getCostFactor();
        if (getDaysRented() > TWO_DAYS) {
            cost += (getDaysRented() - TWO_DAYS) * PERCENTAGE;
        }
        return cost;
    }

    /**
     * frecuent points.
     * @return int.
     */
    @Override
    public int getFrequentPoint() {
        return 1;
    }
}
