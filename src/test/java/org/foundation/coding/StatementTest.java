/**
 * Refactor Code Tasks.
 */
package org.foundation.coding;

import static org.junit.Assert.assertNotSame;
import java.util.logging.Logger;
import org.foundation.coding.customer.Customer;
import org.foundation.coding.movie.Movie;
import org.foundation.coding.movie.NewReleaseMovie;
import org.foundation.coding.movie.RegularMovie;
import org.foundation.coding.rental.Rental;
import org.junit.Test;

/**
 * Test printer message.
 */
public class StatementTest {
  //Log instance.
  static final Logger LOGGER = (Logger) Logger.getLogger(String.valueOf(StatementTest.class));

  /**
   * Test the method statement.
   */
  @Test
  public void statement() {
    Customer customer;
    Movie movie;
    Rental rental;

    customer = new Customer("Test");

    movie = new RegularMovie("Terminator", 0);
    rental = new Rental(movie, 2);
    customer.addRental(rental);

    movie = new NewReleaseMovie("The Revenant", 1);
    rental = new Rental(movie, 2);
    customer.addRental(rental);

    Statement std = new Statement(customer);
    StringBuilder stdStatement = std.statement();
    LOGGER.info(stdStatement.toString());
    assertNotSame("", std);
  }
}
