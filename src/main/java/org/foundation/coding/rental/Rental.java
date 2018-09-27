package org.foundation.coding.rental;

import org.foundation.coding.movie.Movie;

public class Rental {
    private int days_rented;
    private Movie movie;

    public Rental(Movie movie, int days_rented) {
        this.movie = movie;
        this.days_rented = days_rented;
    }

    public int getDays_rented() {
        return days_rented;
    }

    public Movie getMovie() {
        return movie;
    }
}
