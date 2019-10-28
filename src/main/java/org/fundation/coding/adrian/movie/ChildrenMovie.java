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
 * Children movie class children of Movie.
 *
 * @author Adrian Rojas - AWT-[01].
 * @version 1.0.
 */
public class ChildrenMovie extends Movie {

    private static final double MULTIPLIER = 1.5;

    /**
     * Constructor for child movies.
     * @param title title
     */
    public ChildrenMovie(final String title) {
        super(title);
    }

    @Override
    public double calculateDebt(int daysRented) {
        double thisAmount = MULTIPLIER;
        if (daysRented > MULTIPLIER * 2) {
            thisAmount += (daysRented - MULTIPLIER * 2) * MULTIPLIER;
        }
        return thisAmount;
    }
}
