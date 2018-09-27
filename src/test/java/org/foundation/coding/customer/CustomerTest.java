/**
 * Refactor Code Tasks.
 */
package org.foundation.coding.customer;

import static org.junit.Assert.assertEquals;

import java.util.AbstractMap.SimpleEntry;
import java.util.ArrayList;
import java.util.List;
import java.util.Map.Entry;
import org.foundation.coding.movie.Movie;
import org.foundation.coding.movie.NewReleaseMovie;
import org.foundation.coding.movie.RegularMovie;
import org.foundation.coding.rental.Rental;
import org.junit.Before;
import org.junit.Test;

/**
 * Test to customer.
 */
public class CustomerTest {

  private Customer customer;
  private Movie movie;
  private Rental rental;
  private List<Rental> rentals;

  /**
   * test method.
   */
  @Before
  public void createScenary() {
    rentals = new ArrayList<>();
    customer = new Customer("Test");
    movie = new RegularMovie("Terminator", 0);
    rental = new Rental(movie, 2);
    customer.addRental(rental);
    movie = new NewReleaseMovie("The Revenant", 1);
    rental = new Rental(movie, 2);
    customer.addRental(rental);
  }

  /**
   * test method.
   */
  @Test
  public void getRentals() {
    Movie movie1 = new RegularMovie("Terminator", 0);
    Movie movie2 = new NewReleaseMovie("The Revenant", 1);
    List<Entry<Movie, Integer>> pairList = new ArrayList<>();
    Entry<Movie, Integer> pair1 = new SimpleEntry<>(movie1, 2);
    Entry<Movie, Integer> pair2 = new SimpleEntry<>(movie2, 2);
    pairList.add(pair1);
    pairList.add(pair2);
    rentals = customer.getRentals();

    for (int i = 0; i <= pairList.size(); i++) {
      Entry<Movie, Integer> pair = pairList.get(i);
      for (int j = 0; j <= rentals.size(); j++) {
        Rental rental = rentals.get(j);
        Movie movieExpected = pair.getKey();
        int daysRentedExpected = pair.getValue();
        Movie movieActual = rental.getMovie();
        assertEquals(movieExpected.getTitle(), movieActual.getTitle());
        assertEquals(daysRentedExpected, rental.getDaysRented());
        return;
      }
    }
  }

  /**
   * Test method.
   */
  @Test
  public void getName() {
    String stringExpected = "Test";
    assertEquals(stringExpected, customer.getName());
  }
}
