package org.fundacionjala.coding.KevinHerrera.Movies.Customer;

import java.util.ArrayList;
import java.util.List;
import org.fundacionjala.coding.KevinHerrera.Movies.Movie.Movie;
import org.fundacionjala.coding.KevinHerrera.Movies.Rental.RentalMovie;
import org.fundacionjala.coding.KevinHerrera.Movies.Rental.RentalFactory;

/**
 * @author KevinHerrera - AWT-[01].
 * @version 0.1
 */
public class Customer implements IRentMovie {
    private String name;
    private List<RentalMovie> rentedMoviesList;
    private int frequentRenterPoints = 0;

    /**
     * .
     * @param name name
     */
    public Customer(final String name) {
        this.name = name;
        rentedMoviesList = new ArrayList<RentalMovie>();
    }

    /**
     * .
     * @return value
     */
    public String getName() {
        return name;
    }

    /**
     * .
     * @return value
     */
    public String statement() {
        StringBuilder bld = new StringBuilder();
        bld.append("RentalMovie Record for: " + getName() + System.lineSeparator());
        for (RentalMovie rental : rentedMoviesList) {

            //show figures for this rental
            bld.append(String.format("Title: %s(%s)||\tRent Amount: %d $||\tDays Rented: %s day(s)%n",
                    rental.getMovie().getTitle(),
                    rental.getMovie().priceCodeToString(),
                    (int) rental.getRentAmount(),
                    rental.getDaysRented())
            );
        }
        bld.append("Amount owned is " + getTotalBillAmount()  + "$" + System.lineSeparator());
        bld.append("You earned:" + frequentRenterPoints + " frequent renter points");
        String result = bld.toString();
        return result;
    }

    /**
     * .
     * @return value
     */
    public int getTotalBillAmount() {
        int totalAmount = 0;
        for (RentalMovie rental: rentedMoviesList) {
            totalAmount += rental.getRentAmount();
        }
        return totalAmount;
    }

    /**
     * .
     * @param value value
     */
    private void setFrequentRenterPoints(int value) {
        frequentRenterPoints = value;
    }

    /**
     * .
     * @return value
     */
    public int getFrequentRenterPoints() {
        return frequentRenterPoints;
    }

    /**
     * .
     * @param movie movie
     * @param daysRented daysRented
     */
    @Override
    public void rentMovie(final Movie movie, int daysRented) {
        RentalMovie rented = RentalFactory.createRentalMovie(movie, daysRented);
        // add frequent renter points
        setFrequentRenterPoints(frequentRenterPoints + 1);
        // add bonus for a two day new release rental
        if (rented.getMovie().getPriceCode() == Movie.NEW_RELEASE && rented.getDaysRented() > 1) {
            setFrequentRenterPoints(frequentRenterPoints + 1);
        }
        rentedMoviesList.add(rented);
    }

    /**
     * .
     * @return value
     */
    @Override
    public List<RentalMovie> getRentedMoviesList() {
        return rentedMoviesList;
    }
}
