package org.foundation.coding.movie;

public class Children_Movie extends Movie {

    public Children_Movie(String title, int priceCode) {
        super(title, priceCode);
    }

    public double getFee(int days) {
        double thisAmount = 1.5;
        if (days > 3)
            thisAmount += (days - 3) * 1.5;
        return thisAmount;
    }
}
