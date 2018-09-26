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

/**
 * Customer of a video club that can rent movies get debt and renter points
 *
 * @version 1.0.
 */
import java.util.Enumeration;
import java.util.Vector;

/**
 * Customer that rents movies.
 */
public class Customer {
    private String name;
    private Vector rented = new Vector();
    private static int renterPoints = 0;
    private static double owedAmount = 0;

    /**
     * Constructor of customer with the name.
     * @param n of the customer
     */
    public Customer(final String n) {
        name = n;
    }

    /**
     * Add a movie as rented by the customer in the customer rented list.
     * @param arg Movie and days rented
     */
    public void addRental(final Rental arg) {
        rented.addElement(arg);
    }

    /**
     * Get the customer's name.
     * @return customer's name
     */
    private String getName() {
        return name;
    }

    /**
     * Get a string with the customer's statement of how much he owes and how many renter points he have.
     * @return String with statement
     */
    public String statement() {
        String result = "Rental Record for " + getName() + "\n";
        //add footer lines
        result += stateDebt();
        result += "Amount owed is " + String.valueOf(owedAmount) + "\n";
        result += "You earned " + String.valueOf(renterPoints) + " frequent renter points";
        return result;
    }

    /**
     * Calculate how much the costumer owes.
     * @return owed quantity
     */
    public String stateDebt() {
        StringBuilder result = new StringBuilder();
        Enumeration rentals = rented.elements();
        while (rentals.hasMoreElements()) {
            double thisAmount = 0;
            Rental each = (Rental) rentals.nextElement();
            // add frequent renter points
            renterPoints++;
            //calculate the debt per movie
            thisAmount += each.getMovie().calculateDebt(each.getDaysRented());
            // Add renter points if the movie is new release;
            renterPoints += each.getMovie().renterPointbonus(each.getDaysRented());
            //show figures for this rental
            result.append("\t").append(each.getMovie().getTitle()).append("\t").append(thisAmount).append("\n");
            owedAmount += thisAmount;


        }
        return result.toString();
    }

}
