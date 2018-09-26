/**
 * The main class to call to customer
 * @author      Sami Shaio
 * @version     %I%, %G%
 * @since       1.0
 */
package org.foundationsjala.coding;

import org.foundationsjala.coding.customer.Customer;
import org.foundationsjala.coding.movies.Movie;
import org.foundationsjala.coding.movies.Rental;

/**
 * Class main
 */
public class Main {
  /**
   * Main method for aplication
   * @param args receive
   */
  public static void main(String[] args) {
    Customer customer = new Customer("Test");
    customer.addRental(new Rental(new Movie("The Revenant", 1), 2));
    customer.addRental(new Rental(new Movie("Terminator", 0), 2));
    System.out.println(customer.statement());
  }
}
