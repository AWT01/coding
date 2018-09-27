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
        rental = new Rental();
        movie = new MovieRegular("Terminator", 2);
        rental.addMovie(movie);
        movie = new MovieNew("The Revenant", 2);
        rental.addMovie(movie);
        customer = new Customer("Test", rental);
        System.out.println(customer.statement());
    }
}
