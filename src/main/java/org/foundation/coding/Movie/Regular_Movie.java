package org.foundation.coding.movie;

public class Regular_Movie extends Movie {

    public Regular_Movie(String title, int priceCode) {

        super(title, priceCode);
    }

    public double getFee(int days) {

        double thisAmount = 2.0;

        if (days > 2)
            thisAmount += (days - 2) * 1.5;

        return thisAmount;
    }
}
