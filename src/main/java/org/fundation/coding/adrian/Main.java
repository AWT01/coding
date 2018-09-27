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


import org.fundation.coding.adrian.movie.NewReleaseMovie;
import org.fundation.coding.adrian.movie.RegularMovie;

/**
 * Main class for testing.
 * @version 1.0.
 */
class Main {

    /**
     * Protected constructor for Main.
     */
    protected Main() { }
    /**
     * Main method.
     * @param args args of main
     */
    public static void main(final String[] args) {
        Customer customer = new Customer("Test");
        customer.addRental(new Rental(new NewReleaseMovie("The Revenant"), 2));
        customer.addRental(new Rental(new RegularMovie("Terminator"), 2));
        customer.statement();

    }
}
