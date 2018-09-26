package org.fundacionjala.coding.kevincristhian;

/**
 * main class.
 */
public final class Main {

    /**
     * empty constructor.
     */
    private Main() {

    }
    /**
     * main method.
     * @param args justa a variable
     */
    public static void main(final String[] args) {
        Customer customer;
        Movie movie;
        Rental rental;
        customer = new Customer("Test");

        movie = new MovieRegular("Terminator");
        rental = new Rental(movie, 2);
        customer.addRental(rental);

        movie = new MovieNew("The Revenant");
        rental = new Rental(movie, 2);
        customer.addRental(rental);

        System.out.println(customer.statement());
    }
}
