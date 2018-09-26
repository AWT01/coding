package org.foundation.coding.Price;

public class Childrens_Price extends Price {
    @Override
    public double getFee(int days) {
        double thisAmount = 1.5;
        if (days > 3)
            thisAmount += (days - 3) * 1.5;
        return thisAmount;
    }
}
