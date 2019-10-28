/*
 * @(#)Main.java
 *
 * Copyright (c) 2018 Jala Foundation.
 * 2643 Av Melchor Perez de Olguin, Colquiri Sud, Cochabamba, Bolivia.
 * All rights reserved.
 *
 * This software is the confidential and proprietary information of
 * Jala Foundation, ("Confidential Information").  You shall not
 * disclose such Confidential Information and shall use it only in
 * accordance with the terms of the license agreement you entered into
 * with Jala Foundation.
 */

package org.fundation.coding.adrian;

import org.fundation.coding.adrian.movie.Movie;
/**
 * Related to rent movies.
 *
 * @version 1.0.
 */
public class Rental {
    private Movie movie;
    private int daysRented;

    /**
     * Rental of movies.
     * @param m movie to be rented
     * @param dRented days of movie as rented
     */
    public Rental(final Movie m, int dRented) {
        movie = m;
        daysRented = dRented;
    }

    /**
     * getter for days rented.
     * @return no of days
     */
    public int getDaysRented() {
        return daysRented;
    }

    /**
     * get the movie rented.
     * @return movie
     */
    public Movie getMovie() {
        return movie;
    }
}
