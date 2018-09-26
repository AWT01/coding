package org.fundacionjala.coding.kevinherrera.movies;

import org.fundacionjala.coding.kevinherrera.movies.movie.Movie;
import org.fundacionjala.coding.kevinherrera.movies.movie.MovieFactory;
import org.fundacionjala.coding.kevinherrera.movies.customer.Customer;

/**
 * @author kevinherrera - AWT-[01].
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
