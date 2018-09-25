package org.fundacionjala.coding;

import java.util.Enumeration;
import java.util.Vector;

/**
 * customer class, it has a 1 to N
 * relation with rental class
 */
public class Customer {
    private String name;
    private Vector rentals;

    /**
     * constructor for customer
     *
     * @param name the name of the customer
     */
    public Customer(String name) {
        this.name = name;
        rentals = new Vector();
    }

    /**
     * this function add the rental
     * to a list, it will help to process
     * many rentals
     *
     * @param rental it need a rental
     *               to add
     */
    public void addRental(Rental rental) {
        rentals.addElement(rental);
    }

    /**
     * getter for the name of the customer
     *
     * @return the name of the customer
     */
    public String getName() {
        return name;
    }

    /**
     * it returns the state of the customer
     *
     * @return a string with the total amount
     * of the rent and the total points of a rent
     */
    public String statement() {
        double totalAmount = 0;
        int frequentRenterPoints = 0;
        Enumeration rentals = this.rentals.elements();
        String result = "Rental Record for " + name + "\n";
        while (rentals.hasMoreElements()) {
                Rental each = (Rental) rentals.nextElement();
                totalAmount+= each.getRentCost();
                frequentRenterPoints += each.getRentPoint();
            }
        result += "===================================\n";
        result += "Amount owed is " + String.valueOf(totalAmount) +
                "\n";
        result += "===================================\n";
        result += "You earned " + String.valueOf(frequentRenterPoints)
                +
                " frequent renter points";
        return result;
    }
}
