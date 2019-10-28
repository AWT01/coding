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
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Logger;

import static java.util.logging.Level.INFO;

/**
 * Customer that rents movies.
 */
public class Customer {
    private String name;
    private List<Rental> rented = new ArrayList<>();
    private int renterPoints = 0;
    private double owedAmount = 0;
    private static final Logger LOGGER = Logger.getLogger(Customer.class.getName());
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
        rented.add(arg);
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
        result += "Amount owed is " + owedAmount + "\n";
        result += "You earned " + renterPoints + " frequent renter points";
        LOGGER.log(INFO, result);
        return result;
    }

    /**
     * Calculate how much the costumer owes.
     * @return owed quantity
     */
    public String stateDebt() {
        StringBuilder result = new StringBuilder();
        for (Rental each: rented) {
            double thisAmount = 0;
            thisAmount += each.getMovie().calculateDebt(each.getDaysRented());
            renterPoints += each.getMovie().renterPointbonus(each.getDaysRented());
            result.append("\t").append(each.getMovie().getTitle()).append("\t").append(thisAmount).append("\n");
            owedAmount += thisAmount;


        }
        return result.toString();
    }

    /**
     * Getter for renterpoints.
     * @return renterpoints var
     */
    public int getRenterPoints() {
        return renterPoints;
    }
    /**
     * Getter for owedAmount.
     * @return owedAmount return the var
     */
    public double getOwedAmount() {
        return owedAmount;
    }
}
