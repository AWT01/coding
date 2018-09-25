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

/**
 * Customer of a video club that can rent movies get debt and renter points
 *
 * @version 1.0.
 */
package movies;

import movies.movie.ChildrenMovie;
import movies.movie.NewReleaseMovie;
import movies.movie.RegularMovie;

import java.util.Enumeration;
import java.util.Vector;

public class Customer {
    private String _name;
    private Vector _rentals = new Vector();
    private static int _renterPoints = 0;
    private static double _owedAmount = 0;

    /**
     * Constructor of customer with the name
     * @param name of the customer
     */
    public Customer(String name) {
        _name = name;
    }

    /**
     * Add a movie as rented by the customer in the customer rented list
     * @param arg Movie and days rented
     */
    public void addRental(Rental arg) {
        _rentals.addElement(arg);
    }

    /**
     * Get the customer's name
     * @return customer's name
     */
    public String getName() {
        return _name;
    }

    /**
     * Get a string with the customer's statement of how much he owes and how many renter points he have
     * @return String with statement
     */
    public String statement() {
        String result = "Rental Record for " + getName() + "\n";
        //add footer lines
        result += stateDebt();
        result += "Amount owed is " + String.valueOf(_owedAmount) + "\n";
        result += "You earned " + String.valueOf(_renterPoints) + " frequent renter points";
        return result;
    }

    /**
     * Calculate how much the costumer owes
     * @return owed quantity
     */
    public String stateDebt(){
        String result = "";
        Enumeration rentals = _rentals.elements();
        while (rentals.hasMoreElements()) {
            double thisAmount = 0;
            Rental each = (Rental) rentals.nextElement();
            // add frequent renter points
            _renterPoints++;
            // add bonus for a two day new release rental

            if (each.getMovie() instanceof NewReleaseMovie && each.getDaysRented() > 1) {
                _renterPoints++;
                //determine amounts for each movie depending of the movie children it is
                thisAmount += each.getDaysRented() * 3;
            }
            if (each.getMovie() instanceof ChildrenMovie) {
                thisAmount += 1.5;
                if (each.getDaysRented() > 3)
                    thisAmount += (each.getDaysRented() - 3) * 1.5;
            }
            if (each.getMovie() instanceof RegularMovie) {
                thisAmount += 2;
                if (each.getDaysRented() > 2)
                    thisAmount += (each.getDaysRented() - 2) * 1.5;
            }

            //show figures for this rental
            result += "\t" + each.getMovie().getTitle() + "\t" +
                    String.valueOf(thisAmount) + "\n";
            _owedAmount += thisAmount;


        }
        return result;
    }

}
