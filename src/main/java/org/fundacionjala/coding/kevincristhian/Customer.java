package org.fundacionjala.coding.kevincristhian;

import java.util.ArrayList;

/**
 * customer class, it has a 1 to N
 * relation with rental class.
 */
public class Customer {
    private String name;
    private ArrayList<Rental> rentalList;

    /**
     * constructor for customer.
     *
     * @param name the name of the customer
     */
    public Customer(final String name) {
        this.name = name;
        rentalList = new ArrayList<>();
    }

    /**
     * add rentals.
     * @param rental to be added.
     */
    public void addRental(final Rental rental) {
        rentalList.add(rental);
    }

    /**
     * amount of the rent of the movie.
     * @return total of rent
     */
    public double calculateTotalCost() {
        double totalCost = 0;
        for (Rental each:rentalList) {
            totalCost += each.calculateRentCost();
        }
        return totalCost;
    }

    /**
     * amount of points.
     *
     * @return total of rent points
     */
    public int calculateTotalPoints() {
        int totalPoints = 0;
        for (Rental each :rentalList) {
            totalPoints += each.getFrequentPoint();
        }
        return totalPoints;
    }

    /**
     * it returns the state of the customer.
     *
     * @return a string with the total amount
     * of the rent and the total points of a rent
     */
    public String statement() {
        StringBuilder result = new StringBuilder();
        result.append("Rental Record for ");
        result.append(name);
        result.append("\n");
        result.append("Amount owed is ");
        result.append(calculateTotalCost());
        result.append("\n");
        result.append("You earned ");
        result.append(calculateTotalPoints());
        result.append(" frequent renter points");
        return result.toString();
    }
}
