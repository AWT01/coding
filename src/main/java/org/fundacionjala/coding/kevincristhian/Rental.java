package org.fundacionjala.coding.kevincristhian;

import java.util.ArrayList;

/**
 * class rental it has a 1 to 1 relation
 * with movie class.
 */
public class Rental {
    private ArrayList<Movie> movieList;

    /**
     * constructor of rental class.
     */
    public Rental() {
        movieList = new ArrayList<>();
    }

    /**
     * method to add a movie to a list.
     *
     * @param movie movie object
     */
    public void addMovie(final Movie movie) {
        movieList.add(movie);
    }

    /**
     * amount of the rent of the movie.
     * @return total of rent
     */
    public double calculateTotalCost() {
        double totalCost = 0;
        for (Movie each:movieList) {
            totalCost += each.calculateRentCost();
        }
        return totalCost;
    }

    /**
     * amount of points.
     *
     * @return total of rent points
     */
    public int calculateTotalPoints() {
        int totalPoints = 0;
        for (Movie each :movieList) {
            totalPoints += each.getFrequentPoints();
        }
        return totalPoints;
    }
}

