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

package org.fundation.coding.adrian.movie;

/**
 * Movies class for rental.
 *
 * @version 1.0.
 */
public abstract class Movie {
    private String title;

    /**
     * Movie constructor.
     * @param t t itle
     */
    public Movie(final String t) {
        title = t;
    }

    /**
     * title getter.
     * @return title
     */
    public String getTitle() {
        return title;
    }

    /**
     * Calculate how much is owed.
     * @param daysRented to calculate
     * @return how much
     */
    public abstract double calculateDebt(int daysRented);

    /**
     * As some movies may increase renterpoints.
     * @param daysRented to know hnow much increase
     * @return the points increased
     */
    public int renterPointbonus(int daysRented) {
        return 0;
    }

}
