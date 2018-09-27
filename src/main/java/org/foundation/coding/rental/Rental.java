/**
 * Refactor Code Tasks.
 */
package org.foundation.coding.rental;
import org.foundation.coding.movie.Movie;

/**
 * Class support the rental of a movie.
 */
public class Rental {

  //days to rental the movie.
  private int daysRented;
  //the movie to rental.
  private Movie movie;

  /**
   * constructor.
   * @param movie receive.
   * @param daysRented receive.
   */
  public Rental(final Movie movie, final int daysRented) {
    this.movie = movie;
    this.daysRented = daysRented;
  }

  /**
   * give the day to rental.
   * @return days rented.
   */
  public int getDaysRented() {
    return daysRented;
  }

  /**
   * give the movie to rental.
   * @return movie.
   */
  public Movie getMovie() {
    return movie;
  }
}
