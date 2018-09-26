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
 * Regular movies class children of Movie class.
 *
 * @author Adrian Rojas - AWT-[01].
 * @version 1.0.
 */
public class NewReleaseMovie extends Movie {

    /**
     * constructor for new release movie.
     * @param title title
     */
    public NewReleaseMovie(final String title) {
        super(title);
    }

    @Override
    public double calculateDebt(int daysRented) {
        return daysRented * 3;
    }
    @Override
    public int renterPointbonus(int daysRented) {
        if (daysRented > 1) {
            return 1;
        } else {
            return 0;
        }
    }
}
