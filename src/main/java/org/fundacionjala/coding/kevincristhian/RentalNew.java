package org.fundacionjala.coding.kevincristhian;

/**
 * rental new movies.
 */
public class RentalNew extends Rental {
    /**
     * constructor of rental class.
     *
     * @param movie
     * @param daysRented
     */
    public RentalNew(Movie movie, int daysRented) {
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
        cost *= getDaysRented();
        return cost;
    }

    /**
     * frecuent points.
     * @return int.
     */
    @Override
    public int getFrequentPoint() {
        return 2;
    }
}
