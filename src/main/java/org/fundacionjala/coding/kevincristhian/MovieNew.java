package org.fundacionjala.coding.kevincristhian;

/**
 * child class of movie.
 */
public class MovieNew extends Movie {
    private static final double COST_FACTOR = 3;
    private static final int FREQUENT_POINTS = 2;

    /**
     * the constructor of the class.
     *
     * @param title the title of the movie
     * @param daysRented number of days rented
     */
    public MovieNew(final String title, int daysRented) {
        super(title, daysRented);
        setFrequentPoints(FREQUENT_POINTS);
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
        cost *= getDaysRented();
        return cost;
    }
}

