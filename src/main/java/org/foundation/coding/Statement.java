package org.foundation.coding;

import org.foundation.coding.customer.Customer;
import org.foundation.coding.movie.Children_Movie;
import org.foundation.coding.movie.Movie;
import org.foundation.coding.movie.New_Release_Movie;
import org.foundation.coding.movie.Regular_Movie;
import org.foundation.coding.rental.Rental;

import java.util.Enumeration;
import java.util.Vector;

public class Statement {

    private static final int CHILDREN = 2;
    private static final int REGULAR = 0;
    private Customer customer;
    private Rental rental;
    private Movie movie;

    public Statement(Customer customer) {
        this.customer = customer;
    }

    public String statement() {

        Vector rentals = customer.getRentals();
        Enumeration enumerationRentals = rentals.elements();

        String result = "Rental Record for " + customer.getName() + "\n";

        double fee = 0;
        int point = 0;

        while (enumerationRentals.hasMoreElements()) {
            rental = (Rental) enumerationRentals.nextElement();
            movie = rental.getMovie();

            fee += retrieveFee(rental.getMovie().getPriceCode());
            point += retrievePoints(rental.getMovie().getPriceCode());
        }

        result += "===================================\n";
        result += "Amount owed is " + String.valueOf(fee)+
                "\n";
        result += "===================================\n";

        result += "You earned " + String.valueOf(point)
                +
                " frequent renter points";
        return result;
    }

    private int retrievePoints(int priceCode) {

        if (movie.getPriceCode() == priceCode) {
            New_Release_Movie mov =  new New_Release_Movie(movie.getTitle(),movie.getPriceCode());
            return mov.getFrequentRenterPoints(rental.getDays_rented());
        }
            return 0;
    }

    private double retrieveFee(int priceCode) {

        switch (priceCode){
            case CHILDREN:
                Children_Movie children_movie = new Children_Movie(movie.getTitle(),movie.getPriceCode());
                return children_movie.getFee(rental.getDays_rented());
            case REGULAR:
                Regular_Movie regular_movie = new Regular_Movie(movie.getTitle(),movie.getPriceCode());
                return regular_movie.getFee(rental.getDays_rented());
        }

        return 0;
    }
}
