package org.foundation.coding.Price;
import org.foundation.coding.Movie.Movie;

public class New_Release_Price extends Price {

    private Movie movie;

    public New_Release_Price() {
    }

    public New_Release_Price(Movie movie) {
        this.movie = movie;
    }

    @Override
    public double getFee(int days) {

        return days * 3;
    }

    public int getFrequentRenterPoints(int days) {
        // add frequent renter points
        int frequentRenterPoints = 0;
        // add bonus for a two day new release rental
        if ((movie.getPriceCode() == Movie.NEW_RELEASE)
                &&
                days > 1) frequentRenterPoints++;
        return frequentRenterPoints;
    }
}
