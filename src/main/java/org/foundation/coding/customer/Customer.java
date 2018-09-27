/**
 * Refactor Code Tasks.
 */
package org.foundation.coding.customer;

import java.util.ArrayList;
import org.foundation.coding.movie.ChildrenMovie;
import org.foundation.coding.movie.Movie;
import org.foundation.coding.movie.NewReleaseMovie;
import org.foundation.coding.movie.RegularMovie;
import org.foundation.coding.rental.Rental;

/**
 * The class contains info for rental movie.
 */
public class Customer {
  //Variable to define the children movie.
  private static final int CHILDREN = 2;
  //Variable to define the regular movie.
  private static final int REGULAR = 0;
  //The name of the customer.
  private String name;

  /**
   * Return a type of list rental.
   * @return rental list.
   */
  public ArrayList<Rental> getRentals() {
    return rentals;
  }

  /**
   * Define a list to rentals.
   */
  private ArrayList<Rental> rentals;

  /**
   * constructor.
   * @param name receive.
   */
  public Customer(final String name) {

    this.name = name;
    rentals = new ArrayList<Rental>();
  }

  /**
   * give a name of custom.
   * @return name.
   */
  public String getName() {
    return name;
  }

  /**
   * add to list a rental.
   * @param rental give.
   */
  public void addRental(final Rental rental) {
    rentals.add(rental);
  }

  /**
   * calculate the total of rentals.
   * @param rental .
   * @return number double.
   */
  public double getTotalFeeRental(final Rental rental) {
    Movie movie = rental.getMovie();
    switch (rental.getMovie().getPriceCode()) {
      case CHILDREN:
        ChildrenMovie childrenMovie = (ChildrenMovie) movie;
        return childrenMovie.getFee(rental.getDaysRented());
      case REGULAR:
        RegularMovie regularMovie = (RegularMovie) movie;
        return regularMovie.getFee(rental.getDaysRented());
      default:
        return 0;
    }
  }

  /**
   * return the point calculates to new release movie.
   * @param rental receive.
   * @return int.
   */
  public int retrievePoints(final Rental rental) {
    Movie movie = rental.getMovie();
    if (movie.getPriceCode() == rental.getMovie().getPriceCode()) {
      NewReleaseMovie movieRelease = new NewReleaseMovie(movie.getTitle(), movie.getPriceCode());
      return movieRelease.getFrequentRenterPoints(rental.getDaysRented());
    }
      return 0;
  }
}
