package org.fundacionjala.coding.kevincristhian;

/**
 * rental children movies.
 */
public class RentalChildren extends Rental {
    private static final int THREE_DAYS = 3;
    private static final double PERCENTAGE = 1.5;

    /**
     * constructor of rental class.
     *
     * @param movie .
     * @param daysRented .
     */
    public RentalChildren(final Movie movie, int daysRented) {
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
        if (getDaysRented() > THREE_DAYS) {
            cost += (getDaysRented() - THREE_DAYS) * PERCENTAGE;
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
