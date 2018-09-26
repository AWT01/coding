package org.fundacionjala.coding.kevincristhian;

import java.util.ArrayList;
import java.util.Iterator;

/**
 * customer class, it has a 1 to N
 * relation with rental class.
 */
public class Customer {
    private String name;
    private ArrayList<Rental> rentals;

    /**
     * constructor for customer.
     *
     * @param name the name of the customer
     */
    public Customer(final String name) {
        this.name = name;
        rentals = new ArrayList<>();
    }

    /**
     * this function add the rental
     * to a list, it will help to process
     * many rentals.
     *
     * @param rental it need a rental
     *               to add
     */
    public void addRental(final Rental rental) {
        rentals.add(rental);
    }

    /**
     * getter for the name of the customer.
     *
     * @return the name of the customer
     */
    public String getName() {
        return name;
    }

    /**
     * it returns the state of the customer.
     *
     * @return a string with the total amount
     * of the rent and the total points of a rent
     */
    public String statement() {
        double totalAmount = 0;
        int frequentRenterPoints = 0;
        Iterator<Rental> rentalIterator = rentals.iterator();
        String result = "Rental Record for " + name + "\n";
        while (rentalIterator.hasNext()) {
                Rental each = rentalIterator.next();
                totalAmount += each.getRentCost();
                frequentRenterPoints += each.getRentPoint();
            }
        result += "===================================\n";
        result += "Amount owed is " + totalAmount
                + "\n";
        result += "===================================\n";
        result += "You earned " + frequentRenterPoints
                +
                " frequent renter points";
        return result;
    }
}
