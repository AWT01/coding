package org.foundation.coding;

import org.foundation.coding.customer.Customer;
import org.foundation.coding.movie.Movie;
import org.foundation.coding.movie.New_Release_Movie;
import org.foundation.coding.movie.Regular_Movie;
import org.foundation.coding.rental.Rental;

public class Main {

    public static void main(String[] args) {

        Customer customer;
        Movie movie;
        Rental rental;

        customer = new Customer("Test");

        movie = new Regular_Movie("Terminator",0);
        rental = new Rental(movie,2);
        customer.addRental(rental);

        movie = new New_Release_Movie("The Revenant",1);
        rental = new Rental(movie,2);
        customer.addRental(rental);

        Statement std = new Statement(customer);
        System.out.println(std.statement());

    }
}
