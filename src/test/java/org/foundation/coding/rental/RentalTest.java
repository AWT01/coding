/**
 * Refactor Code Tasks.
 */
package org.foundation.coding.rental;

import static org.junit.Assert.assertEquals;
import org.foundation.coding.movie.Movie;
import org.foundation.coding.movie.RegularMovie;
import org.junit.Test;

/**
 * Test to rental class.
 */
public class RentalTest {
  //to instance.
  private Movie movie;
  //to instance.
  private Rental rental;

  /**
   * test method.
   */
  @Test
  public void getDaysRented() {
    movie = new RegularMovie("Terminator", 0);
    rental = new Rental(movie, 2);
    assertEquals(rental.getDaysRented(), 2);
  }

  /**
   * test method.
   */
  @Test
  public void getMovie() {
    movie = new RegularMovie("Terminator", 0);
    rental = new Rental(movie, 2);
    assertEquals(movie, rental.getMovie());
  }
}
