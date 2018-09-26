package org.fundacionjala.coding.KevinHerrera.Movies;

import org.fundacionjala.coding.KevinHerrera.Movies.Movie.Movie;
import org.fundacionjala.coding.KevinHerrera.Movies.Movie.MovieFactory;
import org.fundacionjala.coding.KevinHerrera.Movies.Customer.Customer;

/**
 * @author KevinHerrera - AWT-[01].
 * @version 0.1
 */

public class Main {
    /**
     * .
     */
    protected Main() {
    }

    /**
     * main class.
     * @param args args
     */
    public static void main(final String[] args) {
        Customer customer = new Customer("Test");
        Movie movieRevenant = MovieFactory.createNewReleaseMovie("The Revenant");
        Movie movieTerminator = MovieFactory.createRegularMovie("Terminator");
        customer.rentMovie(movieRevenant, 2);
        customer.rentMovie(movieTerminator, 2);
        System.out.println(customer.statement());
    }
}
