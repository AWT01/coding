package org.fundacionjala.coding.kevincristhian;

/**
 * customer class, it has a 1 to N
 * relation with rental class.
 */
public class Customer {
    private String name;
    private Rental rental;

    /**
     * constructor for customer.
     *
     * @param name the name of the customer
     * @param rental rental object
     */
    public Customer(final String name, final Rental rental) {
        this.name = name;
        this.rental = rental;
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
        result.append(rental.calculateTotalCost());
        result.append("\n");
        result.append("You earned ");
        result.append(rental.calculateTotalPoints());
        result.append(" frequent renter points");
        return result.toString();
    }
}
