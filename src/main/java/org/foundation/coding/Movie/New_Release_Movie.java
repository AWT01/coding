package org.foundation.coding.movie;

public class New_Release_Movie extends Movie {

    public static final int NEW_RELEASE = 1;

    public New_Release_Movie(String title, int priceCode) {
        super(title, priceCode);
    }

    public double getFee(int days) {

        return days * 3;
    }

    public int getFrequentRenterPoints(int days) {
        // add frequent renter points
        int frequentRenterPoints = 0;
        // add bonus for a two day new release rental
        if (getPriceCode() == NEW_RELEASE)
            if (days > 1) {
                frequentRenterPoints++;
            }
        return frequentRenterPoints;
    }
}
