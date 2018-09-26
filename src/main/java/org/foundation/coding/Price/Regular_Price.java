package org.foundation.coding.Price;

public class Regular_Price extends Price {

    @Override
    public double getFee(int days) {

        double thisAmount = 2.0;

        if (days > 2)
            thisAmount += (days - 2) * 1.5;

        return thisAmount;
    }
}
