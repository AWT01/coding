package org.fundacionjala.coding;

public class Main {
    public static void main(String[] args) {
        Customer customer;
        Movie movie;
        Rental rental;
        customer = new Customer("Test");

        movie = new MovieRegular("Terminator");
        rental = new Rental(movie,2);
        customer.addRental(rental);

        movie = new MovieNew("The Revenant");
        rental = new Rental(movie,2);
        customer.addRental(rental);

        System.out.println(customer.statement());
    }
}
